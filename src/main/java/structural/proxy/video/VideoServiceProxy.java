package structural.proxy.video;

/**
 * Patrón Proxy
 * Propósito: Este patrón permite controlar el acceso a un objeto real, en este caso, un servicio de video.
 */
public class VideoServiceProxy implements VideoService {

    private String videoFile;
    private RealVideoService realVideoService;
    private boolean isUserLoggedIn;

    public VideoServiceProxy(String videoFile, boolean isUserLoggedIn) {
        this.videoFile = videoFile;
        this.isUserLoggedIn = isUserLoggedIn;
    }

    @Override
    public void playVideo() {
        if (!isUserLoggedIn) {
            System.out.println("Access denied. Please log in to play the video.");
            return;
        }

        // Lazy loading: solo creamos el objeto real si se necesita
        if (realVideoService == null) {
            realVideoService = new RealVideoService(videoFile);
        }

        realVideoService.playVideo();
    }
}
