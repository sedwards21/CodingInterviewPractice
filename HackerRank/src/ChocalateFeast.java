/*Little Bob loves chocolate, and he goes to a store with $N in his pocket.
 *  The price of each chocolate is $C. The store offers a discount: 
 *  for every M wrappers he gives to the store, he gets one chocolate for free. 
 *  How many chocolates does Bob get to eat?
 */
 
import java.io.*;
import java.util.*;

public class ChocalateFeast {

	public static void chocalateCalculations(int wrappersForDiscount, int chocolateBought) {

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		int counter = 0;

		while (counter < testCases) {
			int nMoneyInHisPocket = in.nextInt();
			int cPricePerChocolate = in.nextInt();
			int mWrappersForDiscount = in.nextInt();
			int xtraWrappers = 0;
			int chocolateBought = nMoneyInHisPocket / cPricePerChocolate;
			int x = 0;
			
			if (chocolateBought >= mWrappersForDiscount) {
				// eligible for extra chocolate
				if(( x = chocolateBought - mWrappersForDiscount) > 0){
					xtraWrappers = x + 1;
					chocolateBought++;
					if(xtraWrappers >= mWrappersForDiscount){
						chocolateBought++;
					}else{
					}
				}


			}
			System.out.println(chocolateBought);
			counter++;

		}

	}
}
