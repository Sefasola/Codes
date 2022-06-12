package udemy;

import java.util.Scanner;

public class Udemy1 {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int n=input.nextInt();
	int[] list= new int[n];
	for(int i=0; i<list.length; i++) {
		list[i]=i*i;
		System.out.println(list[i]);
	}

	}

}
