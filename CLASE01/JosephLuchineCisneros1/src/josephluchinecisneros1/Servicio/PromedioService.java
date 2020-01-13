package josephluchinecisneros1.Servicio;

import java.util.Scanner;

public class PromedioService {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Variable 
		double nota1, nota2, nota3, nota4, nota5, notaMenor;
		double promedio;
		System.out.println("Ingrese el primer numero");
		nota1 = scan.nextDouble();
		System.out.println("Ingrese el primer numero");
		nota2 = scan.nextDouble();
		System.out.println("Ingrese el primer numero");
		nota3 = scan.nextDouble();
		System.out.println("Ingrese el primer numero");
		nota4 = scan.nextDouble();
		System.out.println("Ingrese el primer numero");
		nota5 = scan.nextDouble();
		//Proceso
		promedio = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5);
		if (nota1 < 2 && nota1 < 3) {
			System.out.println("Nota1 es la menor" + nota1);
			notaMenor = nota1;
		} else if (nota2 < 1 && nota2 < 3) {
			System.out.println("Nota2 es la menor" + nota2);
			notaMenor = nota2;
		} else {
			System.out.println("Nota3 es la menor" + nota3);
			notaMenor = nota3;
		}
		System.out.println("La nota menor es:" + notaMenor);
	}
	
}
