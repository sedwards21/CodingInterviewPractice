import java.io.*;
import java.util.*;

public class CountSort2 {
	static Hashtable<Integer, Integer> table;
	public static void setupHashtable(){
		table = new Hashtable<Integer,Integer>();
		for(int i=0;i<100;i++){
			table.put(i, 0);
		}
	}
	public static Integer[] countSort(int[] ar,int size){
		Integer currentValue = 0;
		Integer[] result = new Integer[100];
		setupHashtable();
		for(int i =0; i<size;i++){
			currentValue = (Integer) table.get(ar[i]);
			table.put(ar[i], ++currentValue);
		}
		
		Set<Integer> keys = table.keySet();
		for(int i=0;i<100;i++){
			result[i] = (Integer) table.get(i);

		}
		return result;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for(int i=0; i<size;i++){
        	ar[i] = in.nextInt();
        }
        Integer[] res = countSort(ar,size);
        for(Integer result: res){
        	System.out.print(result + " ");
        }
    }
}