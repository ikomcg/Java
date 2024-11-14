import java.util.ArrayList;

public class AdjacencyList {
    public static void main (String[] args) {
    	
    	ArrayList <ArrayList> adjlist = new ArrayList<>();
    	
    	char [] undigrph = {'A','B','C','D','E','F','G'};
    	int list = 7;
    	
    	for (int i = 0; i < list; i++) {
    		adjlist.add(new ArrayList<>());
    	}
    	adjlist.get(0).add('B');
    	adjlist.get(1).add('A');
    	adjlist.get(1).add('C');
    	adjlist.get(2).add('B');
    	adjlist.get(2).add('D');
    	adjlist.get(2).add('E');
    	adjlist.get(3).add('C');
    	adjlist.get(3).add('E');
    	adjlist.get(3).add('F');
    	adjlist.get(3).add('G');
    	adjlist.get(4).add('C');
    	adjlist.get(4).add('D');
    	adjlist.get(4).add('F');
    	adjlist.get(5).add('D');
    	adjlist.get(5).add('E');
    	adjlist.get(6).add('D');
    	
    	int v = 0;
    	
    	for (int x = 0 ; x< list; x++,v++) {
    		System.out.println(undigrph[v]+" --> " + adjlist.get(x));
    	}
    }
}