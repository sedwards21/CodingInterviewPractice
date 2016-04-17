import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseString {
    public static String reverseString(String str){
        String[] wordsArray = str.split(" ");
        int midpoint = wordsArray.length/2;
        String leftString = "";
        String rightString ="";
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<midpoint; i++){
        	leftString = wordsArray[i] ;
        	wordsArray[i] = wordsArray[wordsArray.length - 1 - i] + " ";
        	wordsArray[wordsArray.length - 1 - i] = leftString;
        }
   
        return Arrays.toString(wordsArray);
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String answer = reverseString(input);
        System.out.println(answer);
        
    }
}