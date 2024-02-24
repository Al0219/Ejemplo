import java.util.Scanner; //Importación de la clase Scanner
class Ejemplo{
	public static void main(String[]args){
		int num1=0, num2=0, num3=0; //Declaración de variables que contendrán los números
		String nombre; //Declaración de variable para el nombre

		Scanner recibirDatos = new Scanner(System.in);//Creación del método para recibir datos
		Scanner recibirNombre = new Scanner(System.in);

		//Ingreso de los números
		System.out.println("Ingrese el primer numero: ");
		num1 = recibirDatos.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = recibirDatos.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		num3 = recibirDatos.nextInt();
		
		//Ingreso del nombre
		System.out.println("Ingrese su nombre completo: ");
		nombre = recibirNombre.nextLine();

		//Mostrar en pantalla los datos ingresados
		System.out.println("El primer numero que ingreso es: " + num1);
		System.out.println("El segundo numero que ingreso es: " + num2);
		System.out.println("El tercer numero que ingreso es: " + num3);
		System.out.println("El nombre que ingreso es: " + nombre);
		
	}
}