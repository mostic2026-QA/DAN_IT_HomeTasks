package java_hw_7.Third_task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's listen to a song");
        Music music = new Music("If everyone cared", 4, "Nickelback");
        music.play();
        System.out.println("Let's watch a video");
        Video video = new Video("QA 13 online. Collection API, Lists, generics 16-07-2025", 174, "2560 × 1440");
        video.play();
    }
}
