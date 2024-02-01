package de.neuefische;

// Step 4: Create a class 'MediaController' that contains a method 'playMedia'. This method should accept
// a 'Playable' object as a parameter and invoke the 'play' method.
public class MediaController {
    public void playMedia(Playable playableMedia){
        playableMedia.play();
    }
}
