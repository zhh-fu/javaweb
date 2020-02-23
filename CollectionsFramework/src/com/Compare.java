package com;

import com.songclass.Song;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Compare {
    class ArtistCompare implements Comparator
    {
        public int compare(Object one,Object two)
        {
            Song s1=(Song) one;
            Song s2=(Song) two;
            return Collator.getInstance(Locale.CHINA).compare(s1.getArtist(),s2.getArtist());
        }
    }
    class SongCompare implements Comparator
    {
        public int compare(Object one,Object two)
        {
            Song s1=(Song) one;
            Song s2=(Song) two;
            return Collator.getInstance(Locale.CHINA).compare(s1.getTitle(),s2.getTitle());
        }
    }
}
