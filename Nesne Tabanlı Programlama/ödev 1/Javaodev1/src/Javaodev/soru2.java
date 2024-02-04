package Javaodev;

import java.util.Scanner;
public class soru2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        
        int sonuc=sayi1;
        
        if(sayi1 > sayi2) {
        	sonuc = sayi1+sayi2;
        }
        else {
        	sonuc = sayi1 * sayi2;
        }
        
        System.out.println("Girilen sayılardan en büyüğü = " + sonuc);

	}

}
