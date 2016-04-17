import java.util.Scanner;

public class Google {
//	dir1
//	 dir11
//	 dir12
//	  picture.jpeg
//	  dir121
//	  file1.txt
//	dir2
//	 file2.gif
    CharSequence searchStr = ".";

	public int solution(String S) {
        // write your code in Java
        Scanner in = new Scanner(S);

        int level = 0;
        String root = in.nextLine().trim();
        StringBuilder sb = new StringBuilder();

        String currentString = "";
        while(in.hasNext()){
        	currentString = in.nextLine().trim();
        	if(currentString.charAt(level) == ' '){
        		recursiveSolution(level, in.next());
        	}else{
        		root = currentString;
        		level++;
        	}
        }
		return 0;
    }
	 
	public String recursiveSolution(int level, String S){
		Scanner in = new Scanner(S);
		String currentString = in.nextLine();
		while((currentString = in.nextLine()).charAt(++level ) != ' '){
			if(currentString.contains(searchStr) ){
				
    		}
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
//-1, 3, -4, 5, 1, -6, 2, 1
}
