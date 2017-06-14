package guvi;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the character:");
		Scanner input=new Scanner(System.in);
		char c=input.next().charAt(0);
		if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
			System.out.println("The character is alphabet");
		}else{
			System.out.println("The character is not alphabet");
		}input.close();

	}

}
