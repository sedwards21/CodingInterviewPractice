// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class ICIMS {
    public String solution(String S) {
        // write your code in Java SE 8
    	  // write your code in Java SE 8
    	char[] sArray = S.toCharArray();
    	StringBuilder phoneNumber = new StringBuilder();
    	int count = 0;
    	int remainder = 0;
    	int totalCount = 0;
    	for(Character c: sArray){
    		if( Character.isDigit(c) ){
    			if(count % 3 == 0 && count != 0){
    				phoneNumber.append('-');
    			}
    			phoneNumber.append(c);
    			count++;
    		}
    	}
    	return phoneNumber.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICIMS ic = new ICIMS();
		System.out.println( ic.solution("00-44  48 5555 8361") );
	}
}


