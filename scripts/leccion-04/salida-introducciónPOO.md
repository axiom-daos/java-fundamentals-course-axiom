# Script - Lección 4: Métodos, Entrada/Salida e Introducción a la POO

## Métodos
¡Hola a todos! Bienvenidos a la Lección 4. Hoy empezaremos hablando de los métodos. Un método es un bloque de instrucciones con nombre que se puede usar muchas veces. Puede recibir datos de entrada, llamados parámetros, y devolver un resultado. Así se evita repetir código. Por ejemplo, un método que suma dos números: le das 3 y 4, y te devuelve 7. Veamos cómo se implementa en Java para JDoodle:

    public class Main {
        public static int sumar(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            int resultado = sumar(3, 4);
            System.out.println("La suma de 3 y 4 es: " + resultado);
        }
    }

## Entrada de datos
Continuamos con la entrada de datos. Los programas pueden pedirle datos a quien los usa y guardarlos en variables. Para eso se usa una herramienta de lectura que espera a que la persona escriba y presione Enter. Por ejemplo, el programa pregunta cómo se llama tu mascota y guarda la respuesta. Veamos el código en Java:

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner("Firulais\n");
            
            System.out.println("¿Cómo se llama tu mascota?");
            String nombreMascota = scanner.nextLine();
            
            System.out.println("Tu mascota se llama: " + nombreMascota);
            scanner.close();
        }
    }

## Trabajar con texto
Pasemos a trabajar con texto. Los textos vienen con herramientas incluidas: contar sus letras, pasarlos a mayúsculas o compararlos entre sí. Comparar textos requiere una herramienta especial, distinta a la que se usa para comparar números. Por ejemplo, la palabra Luna tiene 4 letras y en mayúsculas se escribe LUNA. Veamos esto en código:

    public class Main {
        public static void main(String[] args) {
            String palabra = "Luna";
            
            System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " letras.");
            System.out.println("En mayúsculas se escribe: " + palabra.toUpperCase());
            
            String otraPalabra = "Luna";
            if (palabra.equals(otraPalabra)) {
                System.out.println("Las palabras coinciden exactamente.");
            }
        }
    }

## Qué es una clase
Entramos ahora en la Introducción a la POO. ¿Qué es una clase? Una clase es el molde que define qué datos (atributos) y qué comportamientos (métodos) tendrá algo. No es un objeto todavía, solo el plano a partir del cual se crean. Por ejemplo, la clase Mascota define que toda mascota tiene nombre y energía. En Java lo definimos así:

    class Mascota {
        String nombre;
        int energia;
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println("La clase Mascota ha sido definida con atributos de nombre y energía.");
        }
    }

## Qué es un objeto
Finalmente, ¿qué es un objeto? Un objeto es una copia creada a partir de una clase, y cada uno tiene sus propios valores. Antes de usar un objeto hay que crearlo; si no, el programa falla porque ese objeto todavía no existe. Del mismo molde salen muchas galletas distintas: Luna y Max son dos mascotas diferentes. Veamos el código final en Java:

    class Mascota {
        String nombre;
        int energia;

        public Mascota(String nombre, int energia) {
            this.nombre = nombre;
            this.energia = energia;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Mascota luna = new Mascota("Luna", 80);
            Mascota max = new Mascota("Max", 95);

            System.out.println("Objeto 1 -> Nombre: " + luna.nombre + ", Energía: " + luna.energia);
            System.out.println("Objeto 2 -> Nombre: " + max.nombre + ", Energía: " + max.energia);
        }
    }