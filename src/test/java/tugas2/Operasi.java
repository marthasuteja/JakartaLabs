package tugas2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operasi {
	
	public static void penambahan() {
		try {
			Scanner input = new Scanner(System.in);
			int x,y,z;
			System.out.println("========================");
			System.out.println("Masukan angka pertama :");
			x = input.nextInt();
			System.out.println("Masukan angka kedua :");
			y = input.nextInt();
			z = x + y;
			System.out.println(x+" + "+y+" = "+z);
		} catch(InputMismatchException err) {
			System.out.println("tidak boleh memasukan string");		
		}
		return ;
		
	}
	
	public static void pengurangan() {
		try {
			Scanner input = new Scanner(System.in);
			int x,y,z;
			System.out.println("========================");
			System.out.println("Masukan angka pertama :");
			x = input.nextInt();
			System.out.println("Masukan angka kedua :");
			y = input.nextInt();
			z = x - y;
			System.out.println(x+" - "+y+" = "+z);
		} catch(InputMismatchException err) {
		System.out.println("tidak boleh memasukan string");
		}
		return ;
	}
	
	public static void perkalian() {
		try {
			Scanner input = new Scanner(System.in);
			int x,y,z;
			System.out.println("========================");
			System.out.println("Masukan angka pertama :");
			x = input.nextInt();
			System.out.println("Masukan angka kedua :");
			y = input.nextInt();
			z = x * y;
			System.out.println(x+" x "+y+" = "+z);
		} catch(InputMismatchException err) {
			System.out.println("tidak boleh memasukan string");
		}
		return ;
	}
	
	public static void pembagian() {
		try {
			Scanner input = new Scanner(System.in);
			int x,y,z;
			System.out.println("========================");
			System.out.println("Masukan angka pertama :");
			x = input.nextInt();
			System.out.println("Masukan angka kedua :");
			y = input.nextInt();
			z = x / y;
			System.out.println(x+" : "+y+" = "+z);
		} catch(InputMismatchException err) {
			System.out.println("tidak boleh memasukan string");		
		}
		return ;
	}
}

