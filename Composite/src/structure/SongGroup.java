package structure;

import java.util.ArrayList;
import java.util.Iterator;


public class SongGroup extends SongComponent {

	ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
	
	String groupName;
	String groupDescription;
	
	public SongGroup(String newGroupName, String newGroupDescription) {
		
		groupName = newGroupName;
		groupDescription = newGroupDescription;
		
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	@Override
	public void add(SongComponent newSongComponent) {
		songComponents.add(newSongComponent);
	}

	@Override
	public void remove(SongComponent newSongComponent) {
		songComponents.remove(newSongComponent);
	}

	@Override
	public SongComponent getComponent(int componentIndex) {
		return songComponents.get(componentIndex);
	}

	@Override
	public void displaySongInfo() {
		System.out.println("\n" + "Group name: " + getGroupName() + " - " + getGroupDescription());
		
		Iterator<SongComponent> songIterator = songComponents.iterator();
		
		while(songIterator.hasNext()) {
			SongComponent songToBeDisplayed = songIterator.next();
			songToBeDisplayed.displaySongInfo();
			
			if(!songIterator.hasNext()) {
				System.out.println(); //New line after song group ends listing itself
			}
		}
	}

	
}
