package structure.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import structure.hierarchy.SongInfo;

public class MySongIterator implements Iterator<SongInfo> {

	List<SongInfo> listSongs;
	int position = 0;
	
	public MySongIterator(List<SongInfo> newListSongs) {
		this.listSongs = newListSongs;
	}

	@Override
	public boolean hasNext() {
		while(position < listSongs.size()) {
			return true;
		}
		return false;
	}

	@Override
	public SongInfo next() {
		if(hasNext())
			return listSongs.get(position++);
		throw new NoSuchElementException();
	}

}
