import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ForkPoolDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		List<String> st = Arrays.asList("ax","bx","cx","dx","ex","fx","gx","hx","ix","jx","kx","lx","mx","nx","ox","px","qx","rx","sx","tx","ux","vx","wx","yx","zx");
		
		
		
		
		/*Long startTime = System.currentTimeMillis();
		ForkJoinPool pool1 = new ForkJoinPool(4);
		pool1.execute(() -> {
			st.stream().forEach(det -> {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " " + myMthod(det));
			});
		});
		Long timeTaken = System.currentTimeMillis() - startTime;
		System.out.println(timeTaken);
		
		System.out.println();
		System.out.println();*/
		
	
		
		
		
		
	/*	Long startTime2 = System.currentTimeMillis();
		System.out.println(Runtime.getRuntime().availableProcessors());
		ForkJoinPool pool2 = new ForkJoinPool(4);
		st.stream().forEach(det -> {
			pool2.execute(() -> {
				
				System.out.println(Thread.currentThread().getName() + " " + myMthod(det));
			});
			
		});
		Long timeTaken2 = System.currentTimeMillis() - startTime2;
		System.out.println(timeTaken2);
		
		System.out.println();
		System.out.println();*/
		
		
		
		
		
		List<Callable<String>> listCallable = new ArrayList<>();
		st.stream().forEach(det -> {
			Callable<String> callable = () -> {
				System.out.println(Thread.currentThread().getName() + " " + myMthod(det));
				return det;
			};
			listCallable.add(callable);
		});
		
		
		
		Long startTime3 = System.currentTimeMillis();
		ExecutorService exec = Executors.newFixedThreadPool(5);
		List<Future<String>> str = exec.invokeAll(listCallable);
		exec.shutdown();
		Long timeTaken3 = System.currentTimeMillis() - startTime3;
		System.out.println(timeTaken3);
		
		
		/*
		//Long startTime3 = System.currentTimeMillis();
		ExecutorService exec1 = Executors.newFixedThreadPool(4);		
		
		try {
			exec1.submit(() -> {
						st.stream().forEach(det -> {
						System.out.println(Thread.currentThread().getName() + " " + myMthod(det));
					});
				
			}).get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Long timeTaken3 = System.currentTimeMillis() - startTime3;
		//System.out.println(timeTaken3);
		*/
		
	}

	
	private static String myMthod(String det) {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return det;
	}

}
