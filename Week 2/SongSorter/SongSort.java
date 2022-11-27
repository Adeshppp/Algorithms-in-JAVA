package SongSorter;

import java.util.ArrayList;
import java.util.Collections;

public class SongSort {
    public static void main(String[] args) {
        Song s1 = new Song("take me to your heart", "Micheal learns to Rock", 2014);
        Song s2 = new Song("see you again", "Wiz Khalifa", 2015);
        Song s3 = new Song("Love me like you do", "Ellie Goulding", 2013);
        Song s4 = new Song("Just a Dream", "Nelly", 2010);
        Song s5 = new Song("as long as you love me", "Backstreet Boys", 2008);
        ArrayList<Song> musicList = new ArrayList<Song>();
        musicList.add(s1);
        musicList.add(s2);
        musicList.add(s3);
        musicList.add(s4);
        musicList.add(s5);
        System.out.println(musicList);
        Collections.sort(musicList);
        System.out.println("after sorting......");

        for (Song song : musicList) {
            System.out.print(song + " ");
        }


    }


}

