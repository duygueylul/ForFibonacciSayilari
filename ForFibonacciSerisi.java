package Temel_Kavramlar;


import java.util.Scanner;
public class ForFibonacciSerisi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		
		int input = scan.nextInt();
		int s1 = 0;
		int s2 = 1;
		int top;
		
		System.out.println(input + " Sayısının Fibonacci Serisi: ");
		
		for(int i = 1; i <= input; i++) {
			System.out.print(s1 + " , ");
			
			top = s1 + s2;
			s1 = s2;
			s2 = top;
		}

	}

}
