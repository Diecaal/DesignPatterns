package structure.iterator;

import java.util.Iterator;

import structure.hierarchy.SongInfo;

public interface SongIterator {
	
	public Iterator<SongInfo> createIterator();
	
}
