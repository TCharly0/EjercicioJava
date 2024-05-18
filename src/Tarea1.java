import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona un ejercicio para ejecutar:");
        System.out.println("1. Determinar si un número es par o impar.");
        System.out.println("2. Determinar el mayor de dos números.");
        System.out.println("3. Calcular el factorial de un número.");
        System.out.println("4. Mostrar los números impares desde 1 hasta un número dado.");
        System.out.println("5. Mostrar el día de la semana correspondiente a un número del 1 al 5.");
        System.out.print("Ingrese el número de ejercicio deseado: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:

                System.out.println("Ejecutando el ejercicio 1:");
                ejecutarEjercicioParImpar(scanner);
                break;
            case 2:

                System.out.println("Ejecutando el ejercicio 2:");
                ejecutarEjercicioMayor(scanner);
                break;
            case 3:

                System.out.println("Ejecutando el ejercicio 3:");
                ejecutarEjercicioFactorial(scanner);
                break;
            case 4:

                System.out.println("Ejecutando el ejercicio 4:");
                ejecutarEjercicioNumerosImpares(scanner);
                break;
            case 5:

                System.out.println("Ejecutando el ejercicio 5:");
                ejecutarEjercicioDiaSemana(scanner);
                break;
            default:

                System.out.println("Opción no válida.");
        }

        scanner.close();
    }


    public static void ejecutarEjercicioParImpar(Scanner scanner) {
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }


    public static void ejecutarEjercicioMayor(Scanner scanner) {
        System.out.print("Por favor, ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Por favor, ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero1 < numero2) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }


    public static void ejecutarEjercicioFactorial(Scanner scanner) {
        System.out.print("Por favor, ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("El factorial solo se puede calcular para números enteros positivos.");
        } else {
            int factorial = 1;
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }


    public static void ejecutarEjercicioNumerosImpares(Scanner scanner) {
        int numero;
        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);

        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i += 2;
        }
    }


    public static void ejecutarEjercicioDiaSemana(Scanner scanner) {
        System.out.print("Por favor, ingresa un número del 1 al 5: ");
        int numero = scanner.nextInt();
        String diaSemana;
        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            default:
                diaSemana = "Número inválido";
                break;
        }
        System.out.println("El día de la semana correspondiente al número " + numero + " es: " + diaSemana);
    }
}
