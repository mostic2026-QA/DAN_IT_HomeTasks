package java_hw_7.Third_task;

public class Video extends Media{
    String resolution;
    public Video(String title, int duration, String resolution){
        super(title, duration);
        this.resolution = resolution;
    }
    @Override
    public void play(){
        System.out.println("Playing video " + title + " in " + resolution);
    }
}
