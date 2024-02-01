package de.neuefische;

// Step 3: Create a class 'VideoPlayer' that also implements the 'Playable' interface. Implement the 'play' method to play a video.

import java.util.Objects;

public class VideoPlayer implements Playable{
    Video video = null;

    @Override
    public void play() {
        if(Objects.isNull(video)){
            System.out.println("no Video loaded!");
            return;
        }

        System.out.println("VideoPlayer starts the Video!");
        video.play();
    }

    public void ejectVideo(){
        if(Objects.isNull(video)){
            System.out.println("There is no Video to eject!");
            return;
        }
        video = null;
    }

    public void loadVideo(Video video) {
        this.video = video;
        System.out.println("Video loaded!");
    }
}
