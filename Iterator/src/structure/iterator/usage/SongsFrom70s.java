package structure.iterator.usage;

import java.util.ArrayList;

import structure.hierarchy.SongInfo;
import structure.iterator.MySongIterator;
import structure.iterator.SongIterator;

/*
 * This class return sons in [ArrayList] way
 */
public class SongsFrom70s implements SongIterator {
	
	ArrayList<SongInfo> bestSongs;
	
	public SongsFrom70s() {	
		bestSongs = new ArrayList<SongInfo>();
		
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I Will Survive", "Gloria Gaynor", 1979);
	}

	private void addSong(String songName, String bandName, int yearReleased) {
		SongInfo newSongInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSongs.add(newSongInfo);
	}
/*
	public ArrayList<SongInfo> getBestSongs() {
		return new ArrayList<SongInfo>(this.bestSongs);
	}
*/
	@Override
	public MySongIterator createIterator() {
		return new MySongIterator( this.bestSongs );
	}
}
