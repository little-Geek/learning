import java.util.*;


public class MissingNumberInArray {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		printMissingNumber(new int[] {1,2,3,4,6}, 6);
		missingNumberGreaterthanone(new int[] {1,2,3,4,5,7,8,9,11}, 11);
		
	}
	
	
	public static void printMissingNumber(int[] numbers, int count) {
		
		int num_length = numbers.length;
		int exp_sum = count*(count +1)/2;
		int total_count =0 ;
		for(int number : numbers) {
			
			total_count = total_count + number;
			
		}
		
		int missing_number =  exp_sum - total_count ; 
		
		System.out.println("suM"+missing_number);
		
	}
	
	public static void missingNumberGreaterthanone(int []numbers, int count) {
		
		int missingcount = count - numbers.length;
		
		BitSet bitset = new BitSet(count);
		
		for(int number : numbers) {
			bitset.set(number-1);
			
		}
		
		int lastIndex = 0 ;
		
		for(int i =0 ; i<missingcount; i++) {
			
			lastIndex = bitset.nextClearBit(lastIndex);
			System.out.println(">>>"+lastIndex);
			System.out.println(++lastIndex);
		}
		
		
		
	}
	
	
}