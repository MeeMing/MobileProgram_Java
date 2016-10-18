package Searching;

import java.util.Random;

public class Searching_Main {
	public static void main(String[] args){
		
		Random random = new Random();
		Make_Arr makearr = new Make_Arr();
		Sorting sort = new Sorting();
		Searching search = new Searching();
		int size = 10;
		int searchnum = random.nextInt(50);
		
		makearr.MakeRandomArr(size);
		makearr.PrintArr();
		sort.SortingArr(makearr.Getarr());
		makearr.PrintArr();
		System.out.println("Search Number is " + searchnum);
		search.SearchNum(makearr.Getarr(), searchnum, size, 0);
		
	}
}
