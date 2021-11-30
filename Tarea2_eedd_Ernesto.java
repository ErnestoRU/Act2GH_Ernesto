package Tarea2;

import java.util.Scanner;

public class Tarea2_eedd_Ernesto {
	public static void main(String[] args) {
<<<<<<< HEAD
		int m [] = new int[30];
=======
		int x;
		int y = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Dime el número que quieres comprobar");
		s = Integer.parseInt(s.nextLine());
>>>>>>> refs/tags/V_2.0
		
<<<<<<< HEAD
		
		
		
=======
		for (int j = 0; j < m.length; j++) {
			m[j] = (int)(Math.random()*10);
			System.out.print(m[j]);
			System.out.print(", ");
			if(m[j] = x) {
				y++;
			}
		}
		System.out.println("El número seleccionado está repetido: " + y + " veces en el array");
>>>>>>> refs/tags/V_2.0
	}
}
