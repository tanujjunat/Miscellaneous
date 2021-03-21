import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoSleep {
	
	public static void main(String[] args) {
		DemoSleep sleep = new DemoSleep();
		String A = "Sun 10:00-20:00\n"+
					"Fri 05:00-10:00\n"+
					"Fri 16:30-23:50\n"+
					"Sat 10:00-24:00\n"+
					"Sun 01:00-04:00\n"+
					"Sat 02:00-06:00\n"+
					"Tue 03:30-18:15\n"+
					"Tue 19:00-20:00\n"+
					"Wed 04:25-15:14\n"+
					"Wed 15:14-22:40\n"+
					"Thu 00:00-23:59\n"+
					"Mon 05:00-13:00\n"+
					"Mon 15:00-21:00";
		sleep.solution(A);
	}
	
	public int solution(String A) {
		String [] array = A.split("\n");
		List<List<String>> startTimeArrayList = new ArrayList<>();
		List<List<String>> endTimeArrayList = new ArrayList<>();
		
		List<String> mon = new ArrayList<>();
		List<String> tue = new ArrayList<>();
		List<String> wed = new ArrayList<>();
		List<String> thu = new ArrayList<>();
		List<String> fri = new ArrayList<>();
		List<String> sat = new ArrayList<>();
		List<String> sun = new ArrayList<>();
		
		List<String> monE = new ArrayList<>();
		List<String> tueE = new ArrayList<>();
		List<String> wedE = new ArrayList<>();
		List<String> thuE = new ArrayList<>();
		List<String> friE = new ArrayList<>();
		List<String> satE = new ArrayList<>();
		List<String> sunE = new ArrayList<>();
		
		for (String a : array) {
			String [] singleValueSplit = a.split(" ");
			
			
			
			if (singleValueSplit[0].equals("Mon")) {
				mon.add(singleValueSplit[1].split("-")[0]);
				monE.add(singleValueSplit[1].split("-")[1]);
			}
			if (singleValueSplit[0].equals("Tue")) {
				tue.add(singleValueSplit[1].split("-")[0]);
				tueE.add(singleValueSplit[1].split("-")[1]);
			}
			if (singleValueSplit[0].equals("Wed")) {
				wed.add(singleValueSplit[1].split("-")[0]);
				wedE.add(singleValueSplit[1].split("-")[1]);
			}
			if (singleValueSplit[0].equals("Thu")) {
				thu.add(singleValueSplit[1].split("-")[0]);
				thuE.add(singleValueSplit[1].split("-")[1]);
			}
			if (singleValueSplit[0].equals("Fri")) {
				fri.add(singleValueSplit[1].split("-")[0]);
				friE.add(singleValueSplit[1].split("-")[1]);
			}
			if (singleValueSplit[0].equals("Sat")) {
				sat.add(singleValueSplit[1].split("-")[0]);
				satE.add(singleValueSplit[1].split("-")[1]);
			}
			if (singleValueSplit[0].equals("Sun")) {
				sun.add(singleValueSplit[1].split("-")[0]);
				sunE.add(singleValueSplit[1].split("-")[1]);
			}
						
		}
		
		
		startTimeArrayList.add(mon.stream().sorted().collect(Collectors.toList()));		
		startTimeArrayList.add(tue.stream().sorted().collect(Collectors.toList()));
		startTimeArrayList.add(wed.stream().sorted().collect(Collectors.toList()));
		startTimeArrayList.add(thu.stream().sorted().collect(Collectors.toList()));
		startTimeArrayList.add(fri.stream().sorted().collect(Collectors.toList()));
		startTimeArrayList.add(sat.stream().sorted().collect(Collectors.toList()));
		startTimeArrayList.add(sun.stream().sorted().collect(Collectors.toList()));
		
		endTimeArrayList.add(monE.stream().sorted().collect(Collectors.toList()));		
		endTimeArrayList.add(tueE.stream().sorted().collect(Collectors.toList()));
		endTimeArrayList.add(wedE.stream().sorted().collect(Collectors.toList()));
		endTimeArrayList.add(thuE.stream().sorted().collect(Collectors.toList()));
		endTimeArrayList.add(friE.stream().sorted().collect(Collectors.toList()));
		endTimeArrayList.add(satE.stream().sorted().collect(Collectors.toList()));
		endTimeArrayList.add(sunE.stream().sorted().collect(Collectors.toList()));
		
		List<String> endTimeList = endTimeArrayList.stream().flatMap(List::stream).collect(Collectors.toList());
		List<String> startTimeList = startTimeArrayList.stream().flatMap(List::stream).collect(Collectors.toList());
		
		int [] startTimeArray = new int[startTimeList.size()];
		int count = 0;
		for (String startTime : startTimeList) {
			int min = 0;
			String[] split = startTime.split(":");
			min += Integer.parseInt(split[0])*60;
			min += Integer.parseInt(split[1]);
			startTimeArray[count]=min;
			count++;
		}
		
		int [] endTimeArray = new int[endTimeList.size()];
		count = 0;
		for (String endTime : endTimeList) {
			int min = 0;
			String[] split = endTime.split(":");
			min += Integer.parseInt(split[0])*60;
			min += Integer.parseInt(split[1]);
			endTimeArray[count]=min;
			count++;
		}
		
		for (int startTime : startTimeArray) {
			System.out.print(startTime + ",");
		}
		System.out.println();
		for (int endTime : endTimeArray) {
			System.out.print(endTime + ",");
		}
		
		
		int [] endTimeArray1 = {780,1260,1095,1200,914,1360,1439,600,1430,360,1440,240,1200};
		int [] startTimeArray1 = {300,900,210,1140,265,914,0,300,990,120,600,60,600};
		int maxSleepTime = 0;
		for (int i=0;i < endTimeArray.length; i++) {
			int sleepTime = 0;
				if (i+1 < endTimeArray.length && startTimeArray[i+1] >= endTimeArray[i]) {
					sleepTime = startTimeArray[i+1] - endTimeArray[i];
				} else if (i+1 < endTimeArray.length && startTimeArray[i+1] < endTimeArray[i]) {
					sleepTime = startTimeArray[i+1] + (1440 - endTimeArray[i]);
				} 
				if (maxSleepTime < sleepTime) {
					maxSleepTime = sleepTime;
				}
			
		}
		System.out.println();
		 System.out.println(maxSleepTime);
		return maxSleepTime;
	}

}
