package structure;

import java.util.Iterator;

import structure.hierarchy.SongInfo;
import structure.iterator.SongIterator;

/*
 * Class that will receive songs from three "SongsFrom" and must iterate them in a 
 * uniform way, even tough their different data structures -- solution -> [SongIterator interface]
 */
public class DiscJockey {
	
	SongIterator iter70s;
	SongIterator iter80s;
	SongIterator iter90s;
	
	public DiscJockey(SongIterator newIter70s, SongIterator newIter80s, SongIterator newIter90s) {
		this.iter70s = newIter70s;
		this.iter80s = newIter80s;
		this.iter90s = newIter90s;
	}

	public void showTheSongs() {
		Iterator<SongInfo> songs70s = iter70s.createIterator();
		Iterator<SongInfo> songs80s = iter80s.createIterator();
		Iterator<SongInfo> songs90s = iter90s.createIterator();
		
		System.out.println("Songs of the 70s");
		printTheSongs(songs70s);
		System.out.println("Songs of the 80s");
		printTheSongs(songs80s);
		System.out.println("Songs of the 90s");
		printTheSongs(songs90s);
	}
	
	public void printTheSongs(Iterator<SongInfo> iterator) {
		while(iterator.hasNext()) {
			SongInfo songInfo = (SongInfo) iterator.next();
			System.out.println(String.format("Song name: %s, song band: %s, year: %d", 
					songInfo.getSongName(), songInfo.getBandName(), songInfo.getYearReleased()));
		}
		System.out.println();
	}
}
