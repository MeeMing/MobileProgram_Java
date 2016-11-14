// linkedlist 사용한 generic 이

package QuickCoding;

import java.util.LinkedList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args){
		LinkedList<Integer> ints = new LinkedList<Integer>();
		LinkedList<String> str = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			
			System.out.print("텍스트 입력 (끝내기는 0) : ");
			String line = sc.nextLine();
//			System.out.println(line);
			if(line.equals("0")){
				System.out.println("끝내겠습니까?");
				System.out.println("Y,y -> 끝내기, 아니면 아무키나 입력 : ");
				String input = sc.nextLine();
				if(input.equals("Y") || input.equals("y")){
					break;
				}else{
					int num = Integer.parseInt(line);
					ints.add(num);
					System.out.println("add ints");
				}
			}else{
			
				try{
					int num = Integer.parseInt(line);
					ints.add(num);
					System.out.println("add ints");
				}catch(NumberFormatException e){
					str.add(line);
					System.out.println("add str");
				}
			}
		}
		
		
		System.out.println(str);
		System.out.println(ints);
		
		
		
		
		
		
	}
	
	
}
