package QuickCoding03;
//exception

import java.lang.*;
import java.util.*;


public class Main {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    
	    int num1,num2;
	    
	    try{
	    	System.out.println("num1 : ");
	    	num1 = in.nextInt();
	    	System.out.println("num2 : ");
	    	num2 = in.nextInt();
	    	int value = num1/num2;
	    	//Main m = new Main();
	    	Error_numer3(num1,num2);
	    }catch(InputMismatchException e){
	    	System.out.println("error");
	    }catch(ArithmeticException e){
	    	System.out.println("number 0");
	    }catch(Exception e){
	    	System.out.println("number over 3");
	    }
	    
	    
	}
	
	
	public static void Error_numer3(int num1, int num2) throws Exception{
		if(num1 >= 100 || num2 >= 100){
		throw new Exception();
		}
	}
	
	
	
}
