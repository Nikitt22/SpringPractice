package org.springframework;

public class MusicPlayer {
    private Music music;

    // Используем Inversion Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Plaing: " + music.getSong());
    }
}
