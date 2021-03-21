import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LearnQueueAndBlockedQueue {
	
	public static void main(String[] args) throws InterruptedException {
		Queue<String> queue = new LinkedList<>();
		System.out.println(queue.poll());
		BlockingQueue<String> blockedQueue = new LinkedBlockingQueue<>();
		blockedQueue.put("12");
		System.out.println(blockedQueue.take());
		
		
	}

}
