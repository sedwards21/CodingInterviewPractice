import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tryme(3,1,9));
	}
	public static int tryme(int A, int B, int C){
		if ((A - B) * (C - A) >= 0) {
			System.out.println(C-A + " " );
			System.out.println(A-B + " " );

	        return A;
	    } else if ((B - A) * (C - B) >= 0) {
	        return B;
	    } else {
	        return C;
	    }
	}
	String[] taskMaker(String[] source, int challengeId) {
	    int length = source.length;
	    String[] ret;
	    ArrayList<String> temp = new ArrayList<String>(Arrays.asList(source));
	    int lose = 0;
	    String str = "";
	    String space = "";
	    int spaceSub = 0;
	    
	    for(int i=0;i<length;i++){
	        space = "";
	        str = "";
	        
	        if(source[i].contains("//DB ") && source[i].contains(challengeId+"//") ){
	            lose = source[i].indexOf("//DB ",0);
	            space = source[i].substring(0,lose);
	            str = source[i].substring(lose+6,source[i].length());
	            temp.add(space + str);
	            source[i] = "";
	        }else if(source[i].contains("//DB ")){
	        }else{
	            temp.add(source[i]);
	        }
	           
	    }
	    
	    ret = new String[temp.size()];

	    return temp.toArray(ret);
	}



	double companyBotStrategy(int[][] trainingData) {
	    int totalScore = 0;
	    int count = 0;
	    for(int i=0;i<trainingData.length;i++){
	            if(trainingData[i][1] == 1){
	                totalScore = totalScore + trainingData[i][0];
	                count++;
	            }
	    }
	    
	    double finalScore = totalScore/count ;
	    return finalScore;
	}

}
