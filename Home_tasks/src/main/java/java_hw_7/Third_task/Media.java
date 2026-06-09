package java_hw_7.Third_task;

public class Media {
    String title;
    int duration;
    public Media(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    public void play(){
        System.out.println("Playing media");
    }
}
