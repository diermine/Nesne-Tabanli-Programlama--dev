package Javaodev;

import java.util.Scanner;
public class soru6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Aracın vergisiz fiyatını giriniz : ");
		int vfiyat = scanner.nextInt();
		System.out.println("Aracın slindir hacmi nedir : ");
		int hacim = scanner.nextInt();
		
		int fiyat;
		if (hacim <1600 && vfiyat < 85000) {
			fiyat=((vfiyat/100)*45);
			fiyat=fiyat+(fiyat/100)*18;
			System.out.println("Aracın şuanki fiyatı : "+ fiyat);
		}
		else if (hacim<1600 && vfiyat>=85000 && vfiyat<130000) {
			fiyat=((vfiyat/100)*50);
			fiyat=fiyat+(fiyat/100)*18;
			System.out.println("Aracın şuanki fiyatı : "+ fiyat);
		}
		else if (hacim<1600 && vfiyat>=130000) {
			fiyat=((vfiyat/100)*80);
			fiyat=fiyat+(fiyat/100)*18;
			System.out.println("Aracın şuanki fiyatı : "+ fiyat);
		}
		else if (hacim>=1600 && hacim<2000 && vfiyat<170000) {
			fiyat=((vfiyat/100)*130);
			fiyat=fiyat+(fiyat/100)*18;
			System.out.println("Aracın şuanki fiyatı : "+ fiyat);
		}
		else if (hacim>=1600 && hacim<2000 && vfiyat>=170000) {
			fiyat=((vfiyat/100)*150);
			fiyat=fiyat+(fiyat/100)*18;
			System.out.println("Aracın şuanki fiyatı : "+ fiyat);
		}
		else if (hacim>=2000) {
			fiyat=((vfiyat/100)*220);
			fiyat=fiyat+(fiyat/100)*18;
			System.out.println("Aracın şuanki fiyatı : "+ fiyat);
		}
	}

}
