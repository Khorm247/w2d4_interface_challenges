package de.neuefische;

// Step 3: Create a class 'VideoPlayer' that also implements the 'Playable' interface. Implement the 'play' method to play a video.

public class VideoPlayer implements Playable{
    Video video = null;


    @Override
    public void play() {
        System.out.println("playing Video!");
    }

    public void ejectVideo(){
        if(video.isNull()){
            System.out.println("There is no Video to eject!");
        }


        video = null;
    }
}
