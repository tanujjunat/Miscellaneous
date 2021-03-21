import java.util.Arrays;

public class TrainArrivalDeparture {

	// Driver program to test methods of graph class 
	public static void main(String[] args) 
	{ 
	    int arr[] = {900, 940, 950, 1130, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1145, 1900, 2000}; 
	    int n = arr.length; 
	    System.out.println("Minimum Number of Platforms Required = "
	                        + findPlatform(arr, dep, n)); 
	}

	private static int findPlatform(int[] arr, int[] dep, int n) {
		int platform_needed = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=0,j=0;
		int max_platform_needed = 0; 
		while (i < n && j <n) {
			if (arr[i] < dep[j]) {
				platform_needed++;
				i++;
			} else {
				j++;
				platform_needed--;
			}
			if (max_platform_needed < platform_needed) {
				max_platform_needed = platform_needed;
			}
		}
		return max_platform_needed;
		
	} 
}
