package Sorting;

public class Sorting_Main {

	public static void main(String[] args){
		
		Make_Arr makearr = new Make_Arr();
		Sorting sort = new Sorting();
		
		
		makearr.MakeRandomArr(10);
		makearr.PrintArr();
		sort.SortingArr(makearr.Getarr());
		makearr.PrintArr();
		
		
	}
}
