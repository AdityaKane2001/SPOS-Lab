import java.io.*;

public class PageReplacement {

	public static void main(String[] args) {
		
		FCFS fcfs=new FCFS();
		System.out.println("FCFS");
		//fcfs.execute();
		
		LRU lru=new  LRU();
		System.out.println("LRU");
		//lru.execute();
		
		Optimal optimal=new Optimal();
		System.out.println("Optimal");
		optimal.execute();
	}

}
