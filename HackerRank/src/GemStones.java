import java.io.*;
import java.util.*;

public class GemStones {
	static Hashtable<String, Integer> table = new Hashtable<String, Integer>();
	
	public static void initHash(){
		table.put("a",0);
		table.put("b",0);
		table.put("c",0);
		table.put("d",0);
		table.put("e",0);
		table.put("f",0);
		table.put("g",0);
		table.put("h",0);
		table.put("i",0);
		table.put("j",0);
		table.put("k",0);
		table.put("l",0);
		table.put("m",0);
		table.put("n",0);
		table.put("o",0);
		table.put("p",0);
		table.put("q",0);
		table.put("r",0);
		table.put("s",0);
		table.put("t",0);
		table.put("u",0);
		table.put("v",0);
		table.put("w",0);
		table.put("x",0);
		table.put("y",0);
		table.put("z",0);
	}
	public static void gemFinder(String gem, int rockCount){
		int gemCount =0;
		char charachter = ' ';
		for(int i = 0;i<gem.length();i++){
			charachter = gem.charAt(i);
			gemCount = table.get(charachter);
			table.put("" + charachter , ++gemCount);
			if(gemCount == rockCount){
				
			}

		}
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numOfRocks = in.nextInt();
        initHash();
    
    }
}