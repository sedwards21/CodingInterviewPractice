/*Write a program that prints the numbers from 1 to 100.
 *  But for multiples of three print “Fizz” instead of 
 *  the number and for the multiples of five print “Buzz”.
 *   For numbers which are multiples of both three and five
 *    print “FizzBuzz”
 *    
 */
		
public class FizzBuzz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int mod = 0;
		boolean threeFlag = false;
		boolean fiveFlag = false;
		
		while(count < 100){
			System.out.println();
			//test += (i % 3) == 0 ? "fizz" : ""
			if(count != 0){
			if(count % 3 == 0){
				System.out.print("Fizz ");
				threeFlag = true;
			}
			if ( count % 5 == 0 ){
				System.out.print("Buzz ");
				fiveFlag = true;
			}
			if(!threeFlag && !fiveFlag){
				System.out.print(count);
			}
			count++;
			threeFlag = false;
			fiveFlag = false;
					
		}
		}
	}

}
