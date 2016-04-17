import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
    	int testInt = ar[ar.length-1];
    	int currentIndex = ar.length-2;
        for(int i=ar.length-1;i>0;i--){
            if(testInt < ar[currentIndex]){
            	ar[i] = ar[currentIndex];
            }else{
            	System.out.println(i);
            	ar[i] = testInt;
            }
            --currentIndex;
            printArray(ar);
        }
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
