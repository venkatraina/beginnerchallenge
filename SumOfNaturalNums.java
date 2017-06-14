package guvi;

import java.util.Scanner;

public class SumOfNaturalNums {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Print sum of Natural numbers upto :");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			sum+=i;
		}System.out.println("Sum of first "+n+" Natural numbers:"+sum);
		in.close();

	}

}
