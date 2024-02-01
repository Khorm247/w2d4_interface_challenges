package de.neuefische;

public class Video implements Playable{

    String name;
    int lengthInMinutes;
    String videoContent;

    public Video(String name, int lengthInMinutes, String videoContent) {
        this.name = name;
        this.lengthInMinutes = lengthInMinutes;
        this.videoContent = videoContent;
    }

    public String getName() {
        return name;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getVideoContent() {
        return videoContent;
    }

    @Override
    public void play() {
        System.out.printf("Starting to play %s for %d Minutes\n", name, lengthInMinutes);
        System.out.println(videoContent);
    }
}
