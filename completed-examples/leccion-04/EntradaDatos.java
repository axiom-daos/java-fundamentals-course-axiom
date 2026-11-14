import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: lectura de texto ===");
        Scanner scanner = new Scanner("Firulais\n");
        System.out.println("¿Cómo se llama tu mascota?");
        String mascota = scanner.nextLine();
        System.out.println("Mascota registrada: " + mascota);
        scanner.close();

        System.out.println("=== Ejemplo 2: lectura de un número entero ===");
        scanner = new Scanner("21\n");
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        System.out.println("Su edad es: " + edad + " años.");
        scanner.close();

        System.out.println("=== Ejemplo 3: lectura de un número decimal ===");
        scanner = new Scanner("45.99\n");
        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();
        System.out.println("El precio ingresado es: $" + precio);
        scanner.close();

        System.out.println("=== Ejemplo 4: lectura de un nombre completo ===");
        scanner = new Scanner("Ana Maria Gomez\n");
        System.out.println("Ingrese su nombre completo:");
        String nombreCompleto = scanner.nextLine();
        System.out.println("Usuario: " + nombreCompleto);
        scanner.close();

        System.out.println("=== Ejemplo 5: lectura de un valor booleano ===");
        scanner = new Scanner("true\n");
        System.out.println("¿Cuenta con membresía activa? (true/false):");
        boolean tieneMembresia = scanner.nextBoolean();
        System.out.println("Estado de membresía verificado: " + tieneMembresia);
        scanner.close();
    }
}

