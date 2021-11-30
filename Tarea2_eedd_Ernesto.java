package Tarea2;

public class Tarea2_eedd_Ernesto {
	public static void main(String[] args) {
		int m [] = new int[20];
		
		for (int j = 0; j < m.length; j++) {
			m[j] = (int)(Math.random()*10);
			System.out.print(m[j]);
			System.out.print(", ");
		}
	}
}
