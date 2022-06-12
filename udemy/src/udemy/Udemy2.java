package udemy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Udemy2 {

	public static void main(String[] args) {
		/*
		 * Scanner input= new Scanner(System.in); int n=input.nextInt(); int[] list= new
		 * int[n]; for(int i=0; i<list.length; i++) { //list[i]=i*i; list[i]=(int)
		 * Math.pow(i, 2); System.out.println(list[i]); }
		 */
		
		Scanner input= new Scanner(System.in);
		
		/*
		 * String[] list= {"ocak", "şubat", "mart", "nisan", "mayıs", "haziran",
		 * "temmuz", "ağustos", "eylül", "ekim", "kasım", "aralık"};
		 * System.out.println("Which month are you in:"); int number=input.nextInt();
		 * System.out.println(list[number-1]);
		 */

		
		/*
		 * System.out.println("enter number that you want:"); int
		 * number=input.nextInt(); int[] list= new int[number]; for(int i=0;
		 * i<list.length; i++) { list[i]=input.nextInt(); } int sum=0; for(int i=0;
		 * i<list.length; i++) { sum=sum+list[i]; }
		 * System.out.println((double)sum/number);
		 */
	
		/*
		 * int n=input.nextInt(); int[] array= new int[n]; int[] list= new int[n];
		 * for(int i=0; i<array.length; i++) { array[i]=input.nextInt(); } for(int i=0,
		 * k=array.length-1; i<list.length; i++, k-- ) { list[k]= array[i];
		 * 
		 * } for(int i=0; i<list.length; i++) { System.out.println(list[i]); }
		 */
		
		/*
		 * int[] sayılar= {1,9,5,2,7,9,60,120,55,-9}; diziyerdeğiştir(sayılar);
		 * System.out.println("yer değiştirme metotundan sonra dizi");
		 * diziyazdır(sayılar);
		 * 
		 * }
		 * 
		 * private static void diziyazdır(int[] dizi) { for(int i: dizi) {
		 * System.out.println("eleman " + i); }
		 * 
		 * }
		 * 
		 * public static void diziyerdeğiştir(int[] dizi) { for(int i=dizi.length-1;
		 * i>0; i--) { int rastgeleindex=(int) (Math.random()*(i+1)); int
		 * gecici=dizi[i]; dizi[i]=dizi[rastgeleindex]; dizi[rastgeleindex]=gecici;
		 * 
		 * }
		 */
		
		/*
		 * int[] list= {3,5,2,1,8,6}; for(int i=0; i<list.length-1; i++) { int
		 * gecici=list[i]; int index=i; for(int k=i+1;k<list.length; k++) {
		 * if(gecici>list[k]) { gecici=list[k]; index=k;
		 * 
		 * } } if(index!=i) { list[index]=list[i]; list[i]=gecici; } } for(int i=0;
		 * i<list.length;i++) { System.out.println(list[i]); }
		 */
		
		/*int[] list= {2,3,6,1,8,4,-2};
		System.out.println("before order");
		diziyazdır(list);
		System.out.println("after ordered");
		Arrays.sort(list);
	    diziyazdır(list);
	}
	
	public static void diziyazdır(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ ",");
		}*/
		
		/*
		 * int[] list= {2,3,6,1,8,4,-2}; int result=Arrays.binarySearch(list, 3);
		 * System.out.println(result);
		 */
		
		/*
		 * int[] list= {2,3,6,1,8,4,-2}; int[] list1= {2,3,6,1,8,4,-9};
		 * System.out.println(Arrays.equals(list, list1));
		 * 
		 * int[] array= new int[20]; System.out.printf(Arrays.fill(array, 5)+",");
		 */
		
		//example 1
		/*
		 * double[] list= new double[100]; double sum=0; for(int i=0; i<list.length;
		 * i++) { list[i]=Math.random(); sum=sum+list[i]; } double average=sum/100; int
		 * count=0; for(int i=0; i<list.length; i++) { if(average>list[i]) { count++; }
		 * else { } } System.out.println("there are numbers under average: " + count);
		 */
		
		//example 2
		/*
		 * double[][] list= new double[2][3]; double sum=0; double normal=0; double
		 * normal1=1; for(int i=0; i<list.length; i++) { for(int k=0; k<3; k++) {
		 * list[i][k]=Math.random(); sum=sum+list[i][k]; System.out.println(list[i][k]);
		 * } } for(int i=0; i<list.length; i++) { for(int k=0; k<3; k++) { double
		 * gecici=list[i][k]; double enküçük=list[i][k]; if(gecici>normal) {
		 * normal=gecici; } if(normal1>enküçük) { normal1=enküçük; }
		 * 
		 * } } System.out.println("the smallest number is this: "+normal1);
		 * System.out.println("the biggest number is this: "+ normal);
		 */
		
		//example 3
		//empty
		
		
		
		//example 4
		
		/*
		 * int number=input.nextInt(); int number1=input.nextInt(); if(number>number1) {
		 * for(int i=number1; i>0; i--) { if(number1%i==0 && number%i==0) {
		 * System.out.println("ebob: "+ i); int ekok=(number1*number)/i;
		 * System.out.println("ekok: "+ ekok); break; } } } else if(number1>number) {
		 * for(int i=number; i>0; i--) { if(number1%i==0 && number%i==0) {
		 * 
		 * System.out.println("ebob: "+ i); int ekok=(number1*number)/i;
		 * System.out.println("ekok: "+ ekok); break; } } }
		 */
		
		/*int student=input.nextInt();
		int questıon=input.nextInt();
		String[][] list= new String[student][questıon];
		String[][] correctanswer= new String[student][questıon];
		String[] str= {"A","B","C","D","E"};
		Random r= new Random();
		//int randomnumber= r.nextInt(str.length);
		//System.out.println(str[randomnumber]);
		for(int i=0; i<list.length; i++) {
			int count=0;
			int count1=0;
		for(int k=0; k<questıon; k++) {
		int randomnumber= r.nextInt(str.length);
		int randomnumber1=r.nextInt(str.length);
		list[i][k]=str[randomnumber];	
		correctanswer[i][k]=str[randomnumber1];
		if(correctanswer[i][k]==list[i][k]) {
			count++;
		}
		else {
			count1++;
		}
			}
		System.out.println(i+1+".kid"+" correct answer numbers: "+ count);
		System.out.println(i+1+".kid"+" wrong answer numbers: "+ count1);
		}
	
	
	}*/
		/*int[][] list= new int[5][5];
		for(int i=0; i<list.length; i++) {
			for(int k=0; k<5; k++) {
				list[i][k]=(int) (Math.random()*10);
				System.out.println(list[i][k]);
			}
		}*/
		
		/*
		 * int number=input.nextInt(); int kalan=2; int bölüm=2; String binary="";
		 * while(bölüm>0) { bölüm=number/2; kalan=number%2; number=bölüm;
		 * binary=binary+kalan; //System.out.println("kalan "+ binary);
		 * //System.out.println("bölüm "+ bölüm); }
		 * 
		 * System.out.println("kalan "+ binary);
		 */
		
		
		
		/*int number=input.nextInt();
		for(int i=0; i<number; i++) {
			for(int j=0; j<number; j++) {
				if(i==j || j==(number-i-1)) {
					System.out.print("x");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
	}
	}

	


