package tugas2;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pil;
     	Scanner input = new Scanner(System.in);
     	 do {
     		System.out.println("============");
     		System.out.println("KALKULATOR");
     		System.out.println("=============");
	     	System.out.println("Pilih Operasi :");
	     	System.out.println("1. Penambahan");
	     	System.out.println("2. Pengurangan");
	     	System.out.println("3. Perkalian");
	     	System.out.println("4. Pembagian");
	     	System.out.println("5. Selesai");
	     	System.out.println("Masukan pilihan :");
	     	
  	        pil=input.nextInt();
  	        
	        switch (pil) {
         	case 1 : Operasi.penambahan();break;
            case 2 : Operasi.pengurangan();break;
            case 3 : Operasi.perkalian();break;
            case 4 : Operasi.pembagian();break;
            case 5 : System.out.println();break;
            } 
	     } while (pil!=5);
        input.close();
	}       
}
