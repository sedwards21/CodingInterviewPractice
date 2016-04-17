import java.io.*;
import java.util.*;

public class Day16_Sorting {

	public static ArrayList<Integer> sortArray(int[] intArray){
		Arrays.sort(intArray);
		int difference = Math.abs( intArray[0] - intArray[intArray.length - 1] );
		int tempDiff = 0;
		int[] pair = new int[2];
		ArrayList<Integer> pairs = new ArrayList<Integer>();
		for(int i = 0; i <= intArray.length; i++){
			if(i == intArray.length-1){
				break;
			}else{
				tempDiff = Math.abs( intArray[i] - intArray[i+1] );
				if(tempDiff <= difference){
					difference = tempDiff;
					pairs.add( intArray[i] );
					pairs.add( intArray[i+1] );
				}


			}


		}

		//array should be sorted 
		return pairs;
	}
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		int listLength = 0;
		int[] intArray;

		Scanner in = new Scanner(System.in);
		listLength = in.nextInt();
		intArray = new int[listLength];

		for(int i = 0; i < listLength; i++){
			intArray[i] = in.nextInt();
		}

		ArrayList<Integer> answerArray = sortArray(intArray);
		for(int i = 0; i < answerArray.size() ; i++){
			System.out.print( answerArray.get(i) + " " );
		}

		//-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 
	}
}