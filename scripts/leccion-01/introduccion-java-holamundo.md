# Script - Lección 1: Introducción a Java y Primer Programa

## Introducción y Bienvenida
¡Hola a todos! Sean bienvenidos al curso de Fundamentos de Java para Principiantes. En este curso aprenderemos a programar desde cero sin necesidad de instalar nada en la computadora, utilizando herramientas directas en el navegador.

## ¿Qué es programar y qué es un algoritmo?
Para empezar, ¿qué significa realmente programar? Programar es el arte de darle instrucciones a una computadora para que resuelva un problema o realice una tarea por nosotros. Una computadora es increíblemente rápida, pero no puede pensar por sí misma; necesita instrucciones exactas. A esa secuencia lógica y ordenada de pasos para lograr un objetivo le llamamos algoritmo, tal como seguir una receta de cocina paso a paso.

## ¿Por qué aprender Java?
¿Por qué elegimos Java para empezar? Java es uno de los lenguajes de programación más populares y demandados del mundo. Con Java se construyen desde videojuegos famosos como Minecraft hasta aplicaciones bancarias y sistemas en la nube. Además, cuenta con una enorme comunidad y una gran biblioteca de recursos abiertos.

## ¿Cómo funciona Java? (Bytecode y JVM)
Lo que hace especial a Java es su filosofía de "escribir una vez y ejecutar en cualquier lugar". Cuando escribimos código en Java (un archivo `.java`), este no se ejecuta de golpe en el procesador. Primero, el compilador lo traduce a un formato universal llamado Bytecode (archivo `.class`). Luego, la Máquina Virtual de Java, o JVM, traduce ese Bytecode para que cualquier sistema operativo (Windows, Mac o Linux) lo entienda sin tener que reprogramarlo.

## Práctica en JDoodle: Hola Mundo
Pasemos ahora a la parte práctica en JDoodle. Todo programa en Java se organiza dentro de una clase, y necesita un método principal llamado `main` para que la computadora sepa por dónde empezar a leer. Dentro del método `main`, usamos la orden `System.out.println()` para mostrar mensajes en pantalla, asegurándonos de que el texto esté entre comillas dobles y la instrucción termine con punto y coma:

    public class MyClass {
        public static void main(String args[]) {
            System.out.println("¡Hola, futuros programadores!");
        }
    }

## Errores comunes y el compilador
¿Qué pasa si olvidamos el punto y coma al final de una instrucción? El compilador detecta el error de inmediato y nos indica `error: ';' expected`. En Java, el punto y coma equivale al punto final de una oración; sin él, la computadora no sabe dónde termina la orden:

    public class MyClass {
        public static void main(String args[]) {
            System.out.println("¡Hola, futuros programadores!") // Error: falta punto y coma
        }
    }

## Reto de la Lección
Corregimos el error añadiendo el punto y coma y agregamos una segunda instrucción para imprimir un mensaje adicional. Les dejamos como reto agregar su propio mensaje con su videojuego o pasatiempo favorito:

    public class MyClass {
        public static void main(String args[]) {
            System.out.println("¡Hola, futuros programadores!");
            System.out.println("Mi videojuego favorito es Minecraft.");
        }
    }
