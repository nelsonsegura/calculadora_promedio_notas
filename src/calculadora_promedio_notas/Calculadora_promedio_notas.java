package calculadora_promedio_notas;

import java.util.Scanner;

/**
 *
 * @author caruso
 */
public class Calculadora_promedio_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido esta aplicacion calcula el promedio por materia.");
        System.out.print("escriba el numero de estudiantes: ");
        int numEstudiante = scanner.nextInt();

        // Declaración de variables para acumular las notas y el promedio
        double totalNota = 0.0;
        double promedio = 0.0;

        System.out.println("Seleccione la materia para calcular el promedio:");
        System.out.println("1. Matematicas");
        System.out.println("2. Español");
        System.out.println("3. Ingles");
        System.out.print("escriba el numero de la materia que desea calcular: ");
        int materia = scanner.nextInt();

        switch (materia) {
            case 1: // materia de Matematicas (usando ciclo for)
                for (int i = 1; i <= numEstudiante; i++) {
                    System.out.print("escriba la nota del estudiante " + i + ": ");
                    double nota = scanner.nextDouble();
                    totalNota += nota;
                }
                promedio = totalNota / numEstudiante;
                break;

            case 2: // materia de Español (usando ciclo while)
                int contador = 1;
                while (contador <= numEstudiante) {
                    System.out.print("escriba la nota del estudiante " + contador + ": ");
                    double nota = scanner.nextDouble();
                    totalNota += nota;
                    contador++;
                }
                promedio = totalNota / numEstudiante;
                break;

            case 3: //materia de Ingles (usando ciclo do-while)
                int contador2 = 1;
                do {
                    System.out.print("escriba la nota del estudiante " + contador2 + ": ");
                    double nota = scanner.nextDouble();
                    totalNota += nota;
                    contador2++;
                } while (contador2 <= numEstudiante);
                promedio = totalNota / numEstudiante;
                break;

            default:
                System.out.println("datos incorrectos o materia no valida.");
                return;
        }

        System.out.println("El promedio de la materia seleccionada es de: " + promedio);
    }
}