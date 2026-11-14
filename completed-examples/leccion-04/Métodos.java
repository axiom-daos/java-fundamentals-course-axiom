public class Métodos {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarSaludo(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al sistema de programación.");
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: método para sumar ===");
        int resultado = sumar(10, 5);
        System.out.println("Resultado de la suma: " + resultado);

        System.out.println("=== Ejemplo 2: método para verificar número par ===");
        System.out.println("¿El 4 es par? " + esPar(4));
        System.out.println("¿El 7 es par? " + esPar(7));

        System.out.println("=== Ejemplo 3: método que muestra un saludo ===");
        mostrarSaludo("Carlos");

        System.out.println("=== Ejemplo 4: método para calcular el área de un rectángulo ===");
        double area = calcularAreaRectangulo(5.0, 3.2);
        System.out.println("El área del rectángulo es: " + area);

        System.out.println("=== Ejemplo 5: método para calcular un promedio ===");
        double promedioFinal = calcularPromedio(14.5, 16.0, 15.2);
        System.out.println("El promedio final es: " + promedioFinal);
    }
}