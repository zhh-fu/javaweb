package com.songclass;

public class Song implements Comparable<Song>
{
    String title;
    String artist;
    String rating;

    public Song(String title,String artist,String rating)
    {
        this.title=title;
        this.artist=artist;
        this.rating=rating;
    }

    @Override
    public int compareTo(Song s) {
        return this.title.compareTo(s.getTitle());
    }

    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getRating()
    {
        return rating;
    }
    public String toString()
    {
        return title;
    }
    public boolean equals(Object asong)                     //覆盖和重载不同，最主要是在形参类型上,覆盖形参和返回类型必须一样
    {
        Song s=(Song) asong;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}

