import java.io.*;
import java.util.Scanner;


public class menu {

	public static void main(String[] args) throws IOException{
		
		/*System.out.println("Escribe una opcion: a - b - c - d");
		char c = (char) System.in.read();
		System.out.println("Has elegido la opcion --> " + c);*/
		
		/*
		String nombre;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Escribe tu nombre: ");
		nombre = br.readLine();
		System.out.println("Hola " + nombre + ", ¿cómo estás?");*/
		
		double num1, num2, res = 0;
		
		final Scanner sc = new Scanner(System.in);
		System.out.println("Dime 1er número: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime 2do número: ");
		num2 = sc.nextInt();
		
		
		System.out.println("Escribe una opcion: 1.sumar - 2.restar - 3.multiplicar - 4.dividir"); 
		char c = (char)	System.in.read(); 
		
		
		
		switch (c) {
		
		case '1':
			res = num1 + num2;
			break;
		case '2':
			res = num1 - num2;
			break;
		case '3':
			res = num1 * num2;
			break;
		case '4':
			res = num1 / num2;
			break;
		}
		
		System.out.println("El resultado es --> " + res);
		
		
	}

}
