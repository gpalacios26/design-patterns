package structural.proxy.video;

public class RealVideoService implements VideoService {

    private String videoFile;

    public RealVideoService(String videoFile) {
        this.videoFile = videoFile;
        loadVideoFromDisk(); // operación costosa simulada
    }

    private void loadVideoFromDisk() {
        System.out.println("Loading video: " + videoFile);
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video: " + videoFile);
    }
}
