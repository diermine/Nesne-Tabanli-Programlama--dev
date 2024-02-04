package Javaodev;

import java.util.Scanner;
public class soru5 {
	 
    public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Boyunuzu girin : ");
    double boy = scanner.nextDouble();
    
    System.out.print("Kilonuzu girin : ");
    double kilo = scanner.nextDouble();
    
    
    boy=boy/100;
    double vki  = kilo/(boy*boy);
    
    if(vki <20)
    {
       System.out.print(String.format("ZAYIF değer: "+ vki));
    }   
    else if(vki >= 20 && vki <25)
    {
        System.out.print(String.format("NORMAL değer:  "+ vki));
    }
    else if(vki >= 25 && vki <30)
    {
        System.out.print(String.format("KİLOLU değer: "+ vki));        
    }
    else if(vki >= 30 && vki <35)
    {
        System.out.print(String.format("ŞİŞMAN değer: "+ vki));
    }
    else
    {
        System.out.print(String.format("OBEZ değer: "+ vki));
    }     
    }  
}
