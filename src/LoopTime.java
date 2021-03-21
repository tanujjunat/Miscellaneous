
public class LoopTime {
	
	public static void main(String[] args) {
		boolean a = false;
		long startTime = System.currentTimeMillis();
		for (int i=0; i<26000; i++) {
			for (int j=0; j<260; j++) {
				if (j % 2 == 0) {
					a = true;
					System.out.println(a);
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("total time taken : " + (endTime - startTime));
	}
}
