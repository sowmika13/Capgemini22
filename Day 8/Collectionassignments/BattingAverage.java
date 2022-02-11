package Collectionassignments;

public class BattingAverage {
	static int averageRuns(int runs,int matches,int notout) {
		int out = matches - notout;
		if (out == 0)
			return -1;
		int avg = (runs) / out;
		return avg;
		}
public static void main(String[] args) {
	int runs = 10000;
	int matches = 250;
	int notout = 50;
	int avg = averageRuns(runs, matches,notout);
	if (avg == -1)
		System.out.print("NA");
	else
		System.out.print(avg);
	}
}
