package Searching;

public class Searching {

	public void SearchNum(int[] arr, int num, int top, int bottom){
		
		int middle = (top+bottom)/2;
		int check = Compare(arr[middle], num);
		
		if(check == 3){
			System.out.println("Search number!");
		}//end if
		else if((middle == bottom) || (middle == top)){
			System.out.println("Not Found");
		}//end else if
		else if(check == 1){
			SearchNum(arr, num, middle, bottom);
		}//end else if
		else if(check == 2){
			SearchNum(arr, num, top, middle);
		}//end else if
		
		
		
	}//end func
	
	
	public static int Compare(int x, int y){
		
		if(x>y)
			return 1;
		else if(x<y)
			return 2;
		else
			return 3;
		
	}//end func
}
