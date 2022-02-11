package Day9;

	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Queue;


	/* 
	 * 
	 * 
	 * Queue
	1. A queue can be defined as an ordered list which enables insert operations
	 to be performed at one end called REAR and delete operations to be performed at another end called FRONT.
	2. Queue is referred to be as First In First Out list.
	3. For example, people waiting in line for a rail ticket form a queue.
	Queues are widely used as waiting lists for a single shared resource like printer, disk, CPU.
	Queues are used in asynchronous transfer of data (where data is not being transferred at the same rate between two processes) for eg. pipes, file IO, sockets.
	Queues are used as buffers in most of the applications like MP3 media player, CD player, etc.
	Queue are used to maintain the play list in media players in order to add and remove the songs from the play-list.
	Queues are used in operating systems for handling interrupts.
	 * 
	 * 
	 * 
	 * */

	public class Quequedemo {

			
			public static void main(String ar[]) {
				
			//	Queue<String> lines = new LinkedList<String>();
				
				Queue<String> lines = new PriorityQueue<String>();	
				
				lines.add("ram");
				lines.add("sham");
				lines.add("arnav");
				lines.add("varun");
				
				Iterator itr = lines.iterator();

				while (itr.hasNext()) {

					System.out.println(itr.next());

				}
			}
}
