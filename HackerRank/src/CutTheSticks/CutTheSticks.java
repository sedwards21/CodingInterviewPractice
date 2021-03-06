package CutTheSticks;

import java.io.*;
import java.util.*;

public class CutTheSticks {

	public static void printSticks(ArrayList<Integer> stickList) {
		Collections.sort(stickList);
		int indexInt = stickList.get(0);
		int cutCount = 0;

		while (stickList.size() > 0) {
			indexInt = stickList.get(0);
			for (int i = 0; i < stickList.size(); i++) {
				int value = stickList.get(i);
				value = value - indexInt;
				cutCount++;
				if (value > 0) {
					stickList.set(i, value);
				} else {
					stickList.remove(i);
					i--;
				}
			}
			System.out.println(cutCount);
			cutCount = 0;
		}
	}

	 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);
    	
    	int count = in.nextInt();
 	   	ArrayList<Integer> stickList = new ArrayList<Integer>();

    	int[] sticks = new int[count];
    	for(int i = 0; i < count; i++){
    		stickList.add( in.nextInt() );
    	}
    	
    	printSticks(stickList);
    	
    }
}