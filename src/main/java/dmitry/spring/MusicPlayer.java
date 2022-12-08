package dmitry.spring;

import java.util.List;

public class MusicPlayer {

    private List<String> listMusic;
    private String name;
    private int volume;
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public List<String> getListMusic() {
        return listMusic;
    }

    public void setListMusic(List<String> listMusic) {
        this.listMusic = listMusic;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void play(){
        System.out.println(music.getSong());
    }
    public void playListMusic(){
        for(String str : listMusic){
            System.out.println(str);
        }
    }
}
