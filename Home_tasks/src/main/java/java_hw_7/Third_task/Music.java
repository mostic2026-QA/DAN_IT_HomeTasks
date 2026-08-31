package java_hw_7.Third_task;

public class Music extends Media{
    String artist;
    public Music(String title, int duration, String artist){
        super(title, duration);
        this.artist = artist;
    }
    @Override
    public void play(){
        System.out.println("Playing media " + artist + ": " + title);
    }
}
