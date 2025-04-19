package structural.proxy;

import structural.proxy.video.VideoService;
import structural.proxy.video.VideoServiceProxy;

public class Main {

    public static void main(String[] args) {
        System.out.println("User not logged in:");
        VideoService proxy1 = new VideoServiceProxy("funny-cat.mp4", false);
        proxy1.playVideo();

        System.out.println("\nUser logged in:");
        VideoService proxy2 = new VideoServiceProxy("funny-cat.mp4", true);
        proxy2.playVideo();
        proxy2.playVideo(); // No vuelve a cargar el video
    }
}
