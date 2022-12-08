package dmitry.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.play();

        context.close();
    }
}
