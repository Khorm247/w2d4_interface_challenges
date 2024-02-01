package de.neuefische;

// Step 3: Create a class 'VideoPlayer' that also implements the 'Playable' interface. Implement the 'play' method to play a video.

public class VideoPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("playing Video!");
    }
}
