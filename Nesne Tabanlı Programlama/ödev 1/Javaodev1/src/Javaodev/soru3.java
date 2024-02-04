package Javaodev;

import java.util.Scanner;
public class soru3 {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("1. Sayıyı giriniz: ");
       int sayi1 = scan.nextInt();
       System.out.print("2. Sayıyı giriniz: ");
       int sayi2 = scan.nextInt();
       
       System.out.print("İşemi seçin 1.Toplama 2.Çıkarma 3.Çarpma 4.Bölme");
       
       int sonuc = 0;
       int islem = scan.nextInt();
       
       if(islem == 1) {
    	   sonuc=sayi1+sayi2;
       }
       else if(islem==2) {
    	   sonuc = sayi1-sayi2;
       }
       else if(islem==3) {
    	   sonuc = sayi1*sayi2;
       }
       else if(islem == 4) {
    	   sonuc = sayi1/sayi2;
       }
       else {
    	   System.out.println("yanlış işlem seçtiniz");
       }
       System.out.println("Sonuc " + sonuc);
	}

}
