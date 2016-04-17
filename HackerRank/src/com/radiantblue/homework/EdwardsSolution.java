package com.radiantblue.homework;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class EdwardsSolution implements RadiantBlueAssignment {
	Hashtable<Integer,String> NumberToLetters;

	@Override
	public String[] getLetterPermutationsRecursive(int[] phoneNumber) {
		// TODO Auto-generated method stub
		List<String> solution = new ArrayList<String>();
		String[] returnArray;
		solution.add("");
		if(phoneNumber.length>0){
			for(int i= 0;i < phoneNumber.length; i++){
				System.out.println(solution);
				solution =  recurse(phoneNumber[i]) ;
			}
		}else{
			return null;
		}

		//bad approach
		Object[] obj = solution.toArray();
		returnArray = new String[obj.length];
		for(int i=0; i<obj.length;i++) {
		    returnArray[i] = (String)obj[i];
		}
		return returnArray;
	}
	
	public List<String> recurse(int number){
		List<String> solution = new ArrayList<String>();
		List<String> middleSolution;
		String numTolet = "";
		solution.add("");
			numTolet = NumberToLetters.get(number);
			middleSolution = new ArrayList<>(numTolet.length() * solution.size());
			for(String str:solution){
				for(int l=0; l<numTolet.length();l++){
					middleSolution.add(str + numTolet.charAt(l));
				}
			}
			return middleSolution;
	
	}

	
	@Override
	public String[] getLetterPermutationsIterative(int[] phoneNumber) {
		// TODO Auto-generated method stub
		List<String> solution = new ArrayList<String>();
		List<String> middleSolution;
		String numTolet = "";
		solution.add("");
		for(int i= 0;i < phoneNumber.length; i++){
			//570
			numTolet = NumberToLetters.get(phoneNumber[i]);
			middleSolution = new ArrayList<>(numTolet.length() * solution.size());
			for(String str:solution){
				//497
				for(int l=0; l<numTolet.length();l++){
					//0872
					middleSolution.add(str + numTolet.charAt(l));
				}
			}
			solution = middleSolution;
		}
		return (String[]) solution.toArray();
	}
	
	public EdwardsSolution(){
		NumberToLetters = new Hashtable<Integer, String>();
		NumberToLetters.put(0, "000");
		NumberToLetters.put(1, "111");
		NumberToLetters.put(2, "abc");
		NumberToLetters.put(3, "def");
		NumberToLetters.put(4, "ghi");
		NumberToLetters.put(5, "jkl");
		NumberToLetters.put(6, "mno");
		NumberToLetters.put(7, "pqrs");
		NumberToLetters.put(8, "tuv");
		NumberToLetters.put(9, "wxyz");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdwardsSolution sol = new EdwardsSolution();
		int[] phoneNumber = {5,7,0,4,9,7,0,8,7,2};
		sol.getLetterPermutationsRecursive(phoneNumber);
		
	}

}
