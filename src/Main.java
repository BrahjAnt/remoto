import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sText = new Scanner(System.in);
		Scanner sInteger = new Scanner(System.in);
		
		
	System.out.println("Datos de estudiantes:");
	generateDateStudents();
		
	}
	public static void generateDateStudents() {
		Scanner sText = new Scanner(System.in);
		Scanner sInteger = new Scanner(System.in);
		System.out.println("Inserte nombre:");
		String name = sText.nextLine();
		System.out.println("Inserte apellidos:");
		String lastName = sText.nextLine();
		System.out.println("Inserte fecha de nacimiento:");
		String birthDate = sText.nextLine();
		System.out.println("DNI:");
		String dni = sText.nextLine();
		System.out.println("Estudio previo:");
		String studies = sText.nextLine();
		System.out.println("Teléfono:");
		String numberTelephone = sText.nextLine();
		
		System.out.println(name+" " + lastName+" " +birthDate+ " " +dni+ " " +studies+" " + numberTelephone);
	}
}
