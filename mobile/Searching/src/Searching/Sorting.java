package Searching;

public class Sorting {

	public void SortingArr(int[] arr){
		while(true){
			int count=0;
			for(int i=0; i<arr.length-1; i++){
				if(arr[i] >= arr[i+1]){
					//System.out.print("1 ");
					Swap(arr, i);
				}//end if
				else{
					count++;
				}//end else
			}//end for
			
			if(count==arr.length-1){
				break;
			}//end if
		}//end while
	}//end func
	
	
	
	void Swap(int[] arr, int n){
		int temp = arr[n];
		arr[n] = arr[n+1];
		arr[n+1] = temp;
	}//end func
	
}
