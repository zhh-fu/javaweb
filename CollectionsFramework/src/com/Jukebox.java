package com;

import java.io.*;
import java.util.*;
import java.text.Collator;
import com.songclass.Song;
import com.Compare.*;
public class Jukebox
{
    ArrayList<Song> songList =new ArrayList<Song>();

    public static void main(String[] args)
    {
        Jukebox manager =new Jukebox();
        manager.go();
    }
    public void go() {
        getSongs();
        for (int i = 0; i < songList.size(); i++) {
            System.out.print(i==songList.size()-1?songList.get(i)+"\n":songList.get(i)+"\t");
        }
        //Comparator<Object> com=Collator.getInstance(java.util.Locale.CHINA);
        Compare compare=new  Compare();

        Collections.sort(songList,compare.new SongCompare());                    //java.util.Collections public static void sort(List list)
        System.out.println(songList);                  //对中文貌似不友好,并非严格按照首字母排序。00，需要对字符串进行转换编码为ios-8859-1
        //System.out.println(songList.get(3).getRating());
        ArtistCompare artistCompare=compare.new ArtistCompare();
        Collections.sort(songList,artistCompare);                   //sort(T o,Comparator c)
        System.out.println(songList);
        for (int i = 0; i < songList.size()-1; i++) {
            System.out.print(songList.get(i).getArtist()+"\t");       //中文排序输出还是有问题
        }
        System.out.println(songList.get(songList.size()-1).getArtist());
        //HashSet<Song> hashSet=new HashSet<Song>();
        //hashSet.addAll(songList);
        /*for(int i=0;i<songList.size();i++) {
            System.out.print(i==songList.size()-1?songList.get(i)+"\n":songList.get(i)+"\t");
            hashSet.add(songList.get(i));                   //songList 放入到HashSet中后原有的顺序消失了
        }*/
        //System.out.println(hashSet);
        //TreeSet<Song> treeSet=new TreeSet<Song>();
        //treeSet.addAll(songList);
        //System.out.println(treeSet);
    }

    void getSongs()
    {
        try
        {
            File file=new File("D:/java test documents/CollectionsFramework/SongList.txt");
            FileReader fileReader=new FileReader(file);
            BufferedReader reader=new BufferedReader(fileReader);
            String readLine=null;
            while ((readLine=reader.readLine())!=null)
            {
                //System.out.println(readLine);
                addSong(readLine);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    void addSong(String songs)
    {
        String[] tokens = songs.split("/");
        Song nextSong=new Song(tokens[0],tokens[1],tokens[2]);
        songList.add(nextSong);
    }
}
