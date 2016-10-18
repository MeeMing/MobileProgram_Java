package Searching;

import java.util.Random;

public class Make_Arr {
	
	private int[] arr;
	
	public void MakeRandomArr(int n){
		Random random = new Random();
		
		arr = new int[n];
		arr[0] = random.nextInt(50);
		//System.out.print(arr[0]);
		
		for(int i=1; i<n; i++){
			int num;
			while(true){
				num = random.nextInt(50);
				int check = 0;
				for(int j=0; j<i; j++){
					if(num!=arr[j]){
						check++;
					}//end if
				}//end for
				
				if(check==i){
					break;
				}//end if
				
			}//end while
			arr[i] = num;		
		}//end for
	}// end func
	
	public void PrintArr(){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}//end func
	
	public int[] Getarr(){
		return arr;
	}//end func
	
}//end class


