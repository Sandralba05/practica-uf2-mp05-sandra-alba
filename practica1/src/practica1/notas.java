package practica1;
import java.util.Scanner;

/**
 * Esta es la clase Notas, la cual permite ingresar, comprovar, calcular y mostrar las notas de los estudiantes.
 */
public class notas {
	//Las siguientes variables tienen que ser double, es decir, tienen que contiene coma flotante.
	/**
	 * @param nota La nota del estudiente.
	 * @return true si el estudiante ha aprobado, false si ha suspendido.
	 */
	double not1, not2, not3;
	double pro1, pro2, pro3, defi;
	
	/**
	 * Utilizamos el escaner para que el usuario pueda introducir las notas. 
	 */
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * Añade por el usuario y verifica las notas que sean entre 0 al 10.
	 */
	public void IngresaComprobarNotas() {
        System.out.println("Ingrese las notas del estudiante");
        
		do {
            System.out.print("Ingrese nota 1: ");
            not1 = entrada.nextDouble();
            if (not1 < 0 || not1 > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Intente nuevamente.");
            }
        } while (not1 < 0 || not1 > 10);

        do {
            System.out.print("Ingrese nota 2: ");
            not2 = entrada.nextDouble();
            if (not2 < 0 || not2 > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Intente nuevamente.");
            }
        } while (not2 < 0 || not2 > 10);

        do {
            System.out.print("Ingrese nota 3: ");
            not3 = entrada.nextDouble();
            if (not3 < 0 || not3 > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Intente nuevamente.");
            }
        } while (not3 < 0 || not3 > 10);
	}
	
	/**
	 * Obtenemos las notas ponderadas del alumno.
	 */
	public void Calculonotas() {
		pro1 = not1 * 0.35;
		pro2 = not2 * 0.35;
		pro3 = not3 * 0.30;
		
		defi = pro1 + pro2+ pro3;
	}
	
	/**
	 * Imprime las notas introducidas, el acomulado ya calculado y la nota defiinitiva.
	 */
	public void Mostrar() {
		System.out.println("Las notas introducidas son:");
		System.out.println("La nota 1: " + not1);
		System.out.println("La nota 2: " + not2);
		System.out.println("La nota 3: " + not3);
		
		System.out.println("El acomulado 1: "+ pro1);
		System.out.println("El acomulado 2: "+ pro2);
		System.out.println("El acomulado 3: "+ pro3);
		
		System.out.println("La nota defiinitiva es "+defi);
	
	}
	
	/**
	 * Comprueba si el estudicante ha aprobado o suspendido, dependiendo del rango en el que esté.
	 */
	public void aprobado() {
			if(defi<5 && defi>=0) {
				System.out.println("Suspendio.");
			}else {
				if (defi>=5 && defi<=10 ) {
				System.out.println("Aprobado.");
				}else {
					System.out.println("Hay un error en la notas.");
				}
			}
		}
		
	/**
	 * Método principal en al cual se comprieba la funcionalidad de la clase notas. 
	 * @param args Los argumentos de la línea de comandos. 
	 */
	public static void main(String[] args) {
		//Creamos mecanimos para llamar a cualquier metodo fuera de la clase
		notas fc= new notas();
		
		fc.IngresaComprobarNotas();
		
		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();	
	}
}