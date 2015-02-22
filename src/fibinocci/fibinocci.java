package fibinocci;

import java.util.Scanner;

public class fibinocci {
	
	void findfib(int number)
	{
		int first=1;
		int second=1;
		int next=2;
		if(number<1){
			System.out.println("enter a higher number");
			return;
		}
		if(number==1){
			System.out.println(first);
		}
		else if(number==2){
			System.out.println(first+" "+second);
		}
		else {
			System.out.print(first+" "+second+" ");
			for(int i=3;i<=number;i++)
			{
				next=first+second;
				first=second;
				second=next;
				System.out.print(next+" ");
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		fibinocci i=new fibinocci();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number for fibinocci");
		int number=s.nextInt();
		i.findfib(number);
	}
}
