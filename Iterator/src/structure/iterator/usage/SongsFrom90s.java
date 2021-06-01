package structure.iterator.usage;

import java.util.Hashtable;
import java.util.Iterator;

import structure.hierarchy.SongInfo;
import structure.iterator.SongIterator;

/*
 * This class return sons in [HashTable] way
 */
public class SongsFrom90s implements SongIterator {
	
	Hashtable<Integer, SongInfo>  bestSongs;
	int hashKey = 0;
	
	public SongsFrom90s() {	
		bestSongs = new Hashtable<Integer, SongInfo>();
		
		 addSong("Losing My Religion", "REM", 1991);
		 addSong("Creep", "Radiohead", 1993);
		 addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
	}

	private void addSong(String songName, String bandName, int yearReleased) {
		SongInfo newSongInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSongs.put(hashKey, newSongInfo);
		hashKey++;
	}
/*	
	public Hashtable<Integer, SongInfo> getBestSongs() {
		return this.bestSongs;
	}
*/
	@Override
	public Iterator<SongInfo> createIterator() {
		return this.bestSongs.values().iterator();
	}
}
