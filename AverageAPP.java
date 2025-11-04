package AverageAPP;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class AverageAPP {
	static Scanner userinput = new Scanner(System.in);
	// function to calculate the average of the list
	static double averagefunct(int[] averagelist,int num) {
		int total=0;
		for (int i=0;i<averagelist.length;i++) {
			total=total+averagelist[i];
		}
		double average=Math.round(((double) total/num)*100.0)/100.0;
		return average;
	}
	public static void main(String[] args) {
		// allow the user to enter integers until they decide not to
		String entry="y";
		int[] average= new int[30];
		int j = 0;
		while (!(entry.equals("q"))) {
			System.out.print("Enter the integer that you would "
					+ "like in the list (Enter q to stop)");
			entry=userinput.nextLine();
			if (entry.equals("q")) {
				break;
			}
			else if (!(entry.equals("q"))) {
				average[j]=Integer.parseInt(entry);
				j++;
			}
		}
		// call the function and display
		double listaverage=averagefunct(average,j);
		System.out.print("Your list's average is "+ listaverage);
	}

}
