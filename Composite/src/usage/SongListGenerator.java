package usage;

import structure.DiscJockey;
import structure.Song;
import structure.SongComponent;
import structure.SongGroup;

public class SongListGenerator {

	public static void main(String[] args) {

		SongComponent industrialMusic = new SongGroup("Industrial", "Industrial Music song group description");
		
		SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Heavy Metal Music song group description");
		
		SongComponent dubpsetMusic = new SongGroup("Dubpset", "Dubpset Music song group description");
		
		/* Contain a list of every song groups or invididual songs */
		SongComponent everySong = new SongGroup("Song List", "Every song available in our list");
		
		everySong.add(industrialMusic);
		industrialMusic.add( new Song("Industrial 1","Artist 1", 1990));
		industrialMusic.add( new Song("Industrial 2","Artist 2", 2000));
		
		everySong.add(heavyMetalMusic);
		heavyMetalMusic.add( new Song("Heavy Metal 1","Artist 1", 2005));
		heavyMetalMusic.add( new Song("Heavy Metal 2","Artist 2", 1998));
		
		everySong.add(dubpsetMusic);
		dubpsetMusic.add( new Song("Dubpset 1","Artist 1", 2019));
		
		everySong.add( new Song("Rebel song without category","Unknown",2020));
		
		DiscJockey DJ = new DiscJockey( everySong );
		DJ.getSongList();
	}

}
