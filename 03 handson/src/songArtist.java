import java.util.*;
public class songArtist {
	public static void main(String[] args) {
		LinkedList <String> song= new LinkedList();
		 song.add("Panaginip lang");
		 song.add("Ikaw lang");
	     song.add("To the bone");
		 song.add("We could happen");
		 song.add("Nang dumating ka");
		
		LinkedList <String> artist= new LinkedList();
		 artist.add("Alex Gonzaga");
		 artist.add("Kiyo");
		 artist.add("Pamungkas");
		 artist.add("Aj Rafael");
		 artist.add("Bandang Lapis");
		
	    LinkedList <String> playlist= new LinkedList();
		 playlist.addAll(song);
		  playlist.addAll(artist);
		
			  System.out.println(playlist);
		  
		 
		  Iterator<String> list=song.iterator();
		  Iterator<String> list1=artist.iterator(); 
		  while(list.hasNext()||list1.hasNext()){
	      System.out.println(list.next()+" - "+ list1.next());
	     }	    
	}
}