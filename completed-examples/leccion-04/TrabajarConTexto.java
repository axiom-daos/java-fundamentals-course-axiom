public class TrabajarConTexto {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: longitud de una palabra ===");
        String palabra = "Luna";
        System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " letras.");
        System.out.println("En mayúsculas: " + palabra.toUpperCase());

        System.out.println("=== Ejemplo 2: extracción de una subcadena ===");
        String frase = "Programación en Java";
        String sub = frase.substring(15, 19);
        System.out.println("Palabra extraída: " + sub);

        System.out.println("=== Ejemplo 3: obtención de un carácter ===");
        String texto = "Sistema";
        char letra = texto.charAt(0);
        System.out.println("La primera letra de " + texto + " es: " + letra);

        System.out.println("=== Ejemplo 4: comparación de cadenas ===");
        String pass1 = "Admin123";
        String pass2 = "Admin123";
        if (pass1.equals(pass2)) {
            System.out.println("¡Las contraseñas coinciden!");
        } else {
            System.out.println("Las contraseñas no coinciden.");
        }

        System.out.println("=== Ejemplo 5: reemplazo de texto ===");
        String textoOriginal = "Hola mundo Java";
        String modificado = textoOriginal.replace("Java", "JDoodle");
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto modificado: " + modificado);
    }
}

