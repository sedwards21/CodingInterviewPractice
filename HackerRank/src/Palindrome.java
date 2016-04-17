import java.io.*;
import java.util.*;

public class Palindrome {
	
	public static int[] minPalindromeCount(String[] palindromes){
		int length = palindromes.length;
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
		int counter = 0;
		int itemCount = 0;
		int odds = 0;
		int evens = 0;
		int[] resultBooleans = new int[palindromes.length];
		
		for(String str: palindromes){
			table.clear();
			str = str.trim();
			for(int i=0; i<=str.length()-1;i++){
				char current = str.charAt(i);
				itemCount = table.get(current);
				table.put(current, ++itemCount);
			}
			
		    Enumeration<Integer> e = table.elements();
		    int finalCount = 0;
		    while(e.hasMoreElements()){
		    	finalCount = (Integer) e.nextElement();
		    	if(finalCount % 2 == 0){
		    		evens++;
		    	}else if(finalCount == 0){
		    		odds++;
		    	}else{
		    		odds++;
		    	}
		    }
		    
		    if(odds > 1){
		    	resultBooleans[counter++] = odds - 1;
		    }else if(odds == 2){
		    	resultBooleans[counter++] = 1;
		    }else{
		    	resultBooleans[counter++] = 0;
		    }
		}
		return resultBooleans;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int testCases = in.nextInt();
    	String[] palinStrings = new String[testCases];
    	
    	for(int j = 0; j < testCases; j++){
    		palinStrings[j] = in.nextLine().trim();
    	}
    	
    	int[] results = minPalindromeCount(palinStrings);
    	for(int i = 0;i<results.length;i++){
    		System.out.println( results[i] );
    	}
    	
    }
}