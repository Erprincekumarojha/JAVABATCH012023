package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestSong {

	public static void main(String[] args) {

		List<Song> songList = new ArrayList<>();
		Song s1 = new Song(101, "tum mere dil me", "kumar sanu", new Date());
		Song s2 = new Song(102, "ao na rahe yahi", "arjit singh", new Date());
		Song s3 = new Song(103, "jane do mujhe", "lata mengasher", new Date());
		Collections.addAll(songList, s1, s2, s3);

		// print our song
		songList.forEach(s -> System.out.println(s.toString()));
		// write logic to Sort the Song based on SongName
		Collections.sort(songList, new Song());
         System.out.println("\n After Sorting\n\n");
		// print our song
		songList.forEach(s -> System.out.println(s.toString()));
	}

}
