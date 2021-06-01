package usage;

import structure.DiscJockey;
import structure.iterator.usage.SongsFrom70s;
import structure.iterator.usage.SongsFrom80s;
import structure.iterator.usage.SongsFrom90s;

public class RadioStation {

	public static void main(String[] args) {
		SongsFrom70s songs70s = new SongsFrom70s();
		SongsFrom80s songs80s = new SongsFrom80s();
		SongsFrom90s songs90s = new SongsFrom90s();
		
		DiscJockey DJ = new DiscJockey(songs70s, songs80s, songs90s);
		
		DJ.showTheSongs();
	}

}
