package ru.mirea.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic(MusicPlayer.Ch.CLASSICAL);
        musicPlayer.playMusic(MusicPlayer.Ch.ROCK);


    context.close();
    }
}