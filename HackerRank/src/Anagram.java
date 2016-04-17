import java.io.*;
import java.util.*;

public class Anagram {

	public static int anagram(String testString){
    		String input = testString;
    		int count = 0;
    		for(int k =0;k<input.length();k++){
    			char[] inputToArray = input.toCharArray();
    			char[] leftArray = Arrays.copyOfRange(inputToArray, 0, inputToArray.length/2);
    			char[] rightArray = Arrays.copyOfRange(inputToArray,inputToArray.length/2 , inputToArray.length);
    			int[] letters = new int[26];
    			
    			if(inputToArray.length%2 != 0){
    				System.out.println(-1);
    			}
    			
    			for(char letter: leftArray){
    				int tmp = letter - 'a';
    				letters[tmp]++;  
    			}
    			
    			for(char rLetter: rightArray){
    				int tmp = rLetter - 'a';
    				if(letters[tmp]>0){
                        letters[tmp]--;
                    }    			
    			}
    			
    			for(int c: letters){
    				count = count + Math.abs(c);
    			}
    		}
    		return count;
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int testCases = in.nextInt();
    	String[] inputStrings = new String[testCases];
    	
    	for(int i=0;i<testCases;i++){
    		inputStrings[i]=in.next();
    	}
    	
    	for(int k=0;k<testCases;k++){
    		System.out.println( anagram(inputStrings[k]) );
    	}

    }
}