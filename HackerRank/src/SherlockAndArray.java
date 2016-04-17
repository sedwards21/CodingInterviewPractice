import java.io.*;
import java.util.*;

public class SherlockAndArray {

	public static String resolveArray(int arrayCount, int[] array){
		int leftSum = 0;
		int rightSum = 0;
		int jPlusOne = 0;
		for(int j=1; j<arrayCount; j++){
			if( (arrayCount-1) == j){
				jPlusOne = 0;
			}else{
				jPlusOne = array[j+1];
			}
			if(array[j] > jPlusOne){
			}else{
				leftSum = sum(j,array,true);
				rightSum = sum(j,array,false);
				if(leftSum == rightSum){
					return "YES";
				}
			}
		}
		return "NO";
	}
	
	static int sum(int position, int[] array, boolean goLeft){
		int sum = 0;
		if(goLeft){
			for(int i=position;i<=0;i--){
				sum += array[i];
			}
		}else{
			for(int i=0;i<array.length;i++){
				sum += array[i];
			}
		}
		return sum;
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int arrayCount = 0;
        int[] arrayArgument;
        int counter = 0;
        String[] answerArray = new String[testCases];

        while(counter<testCases){
        	arrayCount = scan.nextInt();
        	arrayArgument = new int[arrayCount];
        	for(int i = 0; i<arrayCount; i++ ){
        		arrayArgument[i] = scan.nextInt();
            }
        	counter++;
        	answerArray[counter] = resolveArray(arrayCount,arrayArgument);
        }
    }
}