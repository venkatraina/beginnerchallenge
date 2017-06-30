package guvi;

import java.util.Scanner;

public class Hello5Times {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=0;i<=n;i++){
			sum+=i;
		}System.out.println(sum);
		in.close();

	}

}
