package Collections.Array.AppArray;

import java.util.Random;

public class Bubble{
	public static void main(String args[]){
		
		int a = 0, b = 0, aux = 0, size = 10;
		int[] nums = new int[10];
		Random rd = new Random();
		
		
		for(a = 1; a < 10; a++){
			
			nums[10] = rd.nextInt();
			
			for(b = size-1; b >= a; b--){
				
				if(nums[b-1] > nums[b]){
					
					aux = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = aux;
				}
			}
		}
		
		for(int item: nums){
			System.out.println("Vet = [ " + item + " ]");
		}
	}
}