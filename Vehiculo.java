import java.util.InputMismatchException; // Importa la clase para manejar excepciones de entrada no válida
import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

public class Vehiculo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables para almacenar los datos del usuario
        String marca, modelo, combustible;
        int cilindrada = 0, capacidad = 0;

        // Solicitar y validar la marca del vehículo
        System.out.print("Introduce la marca del vehículo: ");
        marca = scanner.nextLine(); // Lee una línea de texto ingresada por el usuario y la almacena en la variable 'marca'

        // Solicitar y validar el modelo del vehículo
        System.out.print("Introduce el modelo del vehículo: ");
        modelo = scanner.nextLine(); // Lee una línea de texto ingresada por el usuario y la almacena en la variable 'modelo'

        // Solicitar y validar la cilindrada del vehículo
        while (true) { // Inicia un bucle infinito para solicitar la entrada del usuario hasta que sea válida
            System.out.print("Introduce la cilindrada del vehículo (en cc): ");
            try {
                cilindrada = scanner.nextInt(); // Intenta leer un número entero ingresado por el usuario y almacenarlo en la variable 'cilindrada'
                if (cilindrada < 0) { // Verifica si el número es negativo
                    System.out.println("La cilindrada no puede ser negativa. Inténtalo de nuevo."); // Mensaje de error
                } else {
                    break; // Sale del bucle si el número es válido
                }
            } catch (InputMismatchException e) { // Captura la excepción si el usuario ingresa un valor no numérico
                System.out.println("Entrada no válida. Por favor, ingresa un número entero."); // Mensaje de error
                scanner.next(); // Limpiar el buffer del scanner para permitir nuevas entradas
            }
        }

        // Limpiar el buffer de entrada después de leer un número
        scanner.nextLine();

        // Solicitar y validar el tipo de combustible del vehículo
        while (true) { // Inicia un bucle infinito para solicitar la entrada del usuario hasta que sea válida
            System.out.print("Introduce el tipo de combustible del vehículo (diesel o gasolina): ");
            combustible = scanner.nextLine().trim().toLowerCase(); // Lee una línea de texto, elimina espacios en blanco y convierte a minúsculas
            if (combustible.equals("diesel") || combustible.equals("gasolina")) { // Verifica si el tipo de combustible es válido
                break; // Sale del bucle si la entrada es válida
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa 'diesel' o 'gasolina'."); // Mensaje de error
            }
        }

        // Solicitar y validar la capacidad de pasajeros del vehículo
        while (true) { // Inicia un bucle infinito para solicitar la entrada del usuario hasta que sea válida
            System.out.print("Introduce la capacidad de pasajeros del vehículo: ");
            try {
                capacidad = scanner.nextInt(); // Intenta leer un número entero ingresado por el usuario y almacenarlo en la variable 'capacidad'
                if (capacidad < 0) { // Verifica si el número es negativo
                    System.out.println("La capacidad no puede ser negativa. Inténtalo de nuevo."); // Mensaje de error
                } else {
                    break; // Sale del bucle si el número es válido
                }
            } catch (InputMismatchException e) { // Captura la excepción si el usuario ingresa un valor no numérico
                System.out.println("Entrada no válida. Por favor, ingresa un número entero."); // Mensaje de error
                scanner.next(); // Limpiar el buffer del scanner para permitir nuevas entradas
            }
        }

        // Mostrar los datos ingresados por el usuario
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}

