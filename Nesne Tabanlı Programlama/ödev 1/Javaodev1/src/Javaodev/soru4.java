package Javaodev;

import java.util.Scanner;
public class soru4 {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("1. Sayıyı giriniz: ");
       int sayi1 = scan.nextInt();
       System.out.print("2. Sayıyı giriniz: ");
       int sayi2 = scan.nextInt();
       
       System.out.print("İşemi seçin 1.Toplama 2.Çıkarma 3.Çarpma 4.Bölme");
       
       int islem = scan.nextInt();
       
       switch(islem) {
       case 1:
    	   System.out.println("Toplama işleminin sonucu " + (sayi1+sayi2));
    	   break;
       case 2:
    	   System.out.println("Çıkarma işleminin sonucu " + (sayi1-sayi2));
    	   break;
       case 3:
    	   System.out.println("Çarpma işleminin sonucu " + (sayi1*sayi2));
    	   break;
       case 4:
    	   System.out.println("Bölme işleminin sonucu " + (sayi1/sayi2));
    	   
       }
	}

}
