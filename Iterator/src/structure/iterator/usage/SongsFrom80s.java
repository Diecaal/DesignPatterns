package structure.iterator.usage;

import java.util.Arrays;
import java.util.Iterator;

import structure.hierarchy.SongInfo;
import structure.iterator.SongIterator;

/*
 * This class return sons in [Array] way
 */
public class SongsFrom80s implements SongIterator {
	
	SongInfo[] bestSongs;
	int arrayValue = 0;
	
	public SongsFrom80s() {	
		bestSongs = new SongInfo[3];
		
		addSong("Roam", "B 52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Tears For Fears", 1985);
	}

	private void addSong(String songName, String bandName, int yearReleased) {
		SongInfo newSongInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSongs[arrayValue] = newSongInfo;
		arrayValue++;
	}
/*
	public SongInfo[] getBestSongs() {
		return this.bestSongs;
	}
*/

	@Override
	public Iterator<SongInfo> createIterator() {
		return Arrays.asList(this.bestSongs).iterator();
	}
	
}
