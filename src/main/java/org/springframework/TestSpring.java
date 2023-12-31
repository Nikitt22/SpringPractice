package org.springframework;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("MusicBean", Music.class);
       // MusicPlayer musicPlayer = new MusicPlayer(music);
        // Используем Dependency Injection через конструктор
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
           musicPlayer.playMusicList();


        context.close();
    }
}
