package de.neuefische;

// Step 2: Create a class 'MusicPlayer' that implements the 'Playable' interface. Implement the 'play' method to play a song.

public class MusicPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("playing Music!");
    }
}
