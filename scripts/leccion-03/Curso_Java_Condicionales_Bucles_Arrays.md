# Script - Curso: Condicionales, Bucles y Arrays en Java

## Lección 3.1: Condicionales y Bucles

### Introducción

En esta lección vamos a aprender dos conceptos fundamentales de
programación en Java: los condicionales y los bucles.

Los condicionales nos permiten tomar decisiones dentro de un programa.
Por ejemplo, podemos comprobar si una persona es mayor de edad y mostrar
un mensaje diferente dependiendo de la respuesta.

Los bucles, por otro lado, nos permiten repetir una o varias
instrucciones varias veces. Por ejemplo, podemos mostrar los números del
1 al 10 sin tener que escribir diez veces la misma instrucción.

Para practicar utilizaremos Java en JDoodle, un entorno online que nos
permite escribir y ejecutar nuestro código directamente desde el
navegador.

## ¿Qué es un condicional?

Un condicional permite que nuestro programa tome una decisión
dependiendo de si una condición es verdadera o falsa.

En Java utilizamos principalmente `if`, `else if` y `else`.

Por ejemplo:

``` java
int edad = 16;

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

En este ejemplo creamos una variable llamada `edad` y le asignamos el
valor `16`.

Después utilizamos `if` para comprobar si la edad es mayor o igual a 18.

La expresión:

``` java
edad >= 18
```

es una condición. Como `16` no es mayor o igual que `18`, la condición
es falsa.

Por eso se ejecuta el bloque `else` y obtenemos:

``` text
Eres menor de edad
```

## ¿Qué es `else if`?

Cuando tenemos más de dos posibilidades podemos utilizar `else if`.

Por ejemplo:

``` java
int nota = 15;

if (nota >= 18) {
    System.out.println("Excelente");
} else if (nota >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Desaprobado");
}
```

Aquí tenemos tres posibilidades.

Si la nota es 18 o más, mostramos `Excelente`.

Si no se cumple la primera condición, comprobamos si la nota es mayor o
igual a 11. En ese caso mostramos `Aprobado`.

Finalmente, si ninguna de las condiciones anteriores se cumple,
mostramos `Desaprobado`.

Como nuestra nota es 15, el resultado será:

``` text
Aprobado
```

## ¿Qué es un bucle?

Un bucle permite repetir instrucciones varias veces.

Uno de los bucles más utilizados en Java es `for`.

Por ejemplo:

``` java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Este bucle muestra los números del 1 al 5.

Podemos dividirlo en tres partes:

``` java
int i = 1
```

Aquí creamos una variable llamada `i` y comenzamos con el valor 1.

Después tenemos:

``` java
i <= 5
```

Esta es la condición del bucle. Mientras sea verdadera, el bucle
continuará ejecutándose.

Finalmente tenemos:

``` java
i++
```

Esto aumenta el valor de `i` en uno después de cada repetición.

Por eso obtenemos:

``` text
1
2
3
4
5
```

## Combinar condicionales y bucles

Una de las ventajas de estos conceptos es que podemos utilizarlos
juntos.

Por ejemplo, podemos recorrer los números del 1 al 10 y mostrar
solamente los números pares.

``` java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
```

Primero, el `for` recorre los números del 1 al 10.

Después, el `if` comprueba si cada número es par.

Utilizamos el operador `%`, que obtiene el residuo de una división.

Por ejemplo:

``` text
4 % 2 = 0
5 % 2 = 1
```

Por lo tanto, si el residuo de dividir un número entre 2 es cero,
sabemos que es par.

El resultado será:

``` text
2
4
6
8
10
```

## Ejercicio práctico

Ahora vamos a realizar un pequeño ejercicio utilizando lo aprendido.

### Enunciado

Crear un programa que recorra los números del 1 al 10 y muestre
únicamente los números pares.

### Solución

``` java
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```

Primero creamos el bucle `for`, que se encargará de recorrer los números
del 1 al 10.

Luego utilizamos un `if` para comprobar si el número actual es par.

Si la condición se cumple, mostramos el número en pantalla.

El resultado será:

``` text
2
4
6
8
10
```

## Conclusión

En esta lección aprendimos que los condicionales permiten tomar
decisiones según una condición, mientras que los bucles permiten repetir
instrucciones.

También aprendimos a combinar un `for` con un `if` para resolver un
problema sencillo.

Estos conceptos son fundamentales porque aparecen constantemente en
programas y aplicaciones.

------------------------------------------------------------------------

# Lección 3.2: Arrays en Java

## Introducción

En esta lección vamos a aprender qué son los arrays en Java y cómo
podemos utilizarlos para almacenar varios datos dentro de una misma
estructura.

Imaginemos que queremos guardar las notas de cinco estudiantes.

Podríamos crear una variable para cada nota:

``` java
int nota1 = 15;
int nota2 = 18;
int nota3 = 12;
int nota4 = 16;
int nota5 = 14;
```

Pero si necesitamos almacenar las notas de muchos estudiantes, crear una
variable para cada dato sería poco práctico.

Para solucionar este problema podemos utilizar un array.

## ¿Qué es un array?

Un array es una estructura que nos permite almacenar varios valores del
mismo tipo.

Podemos imaginarlo como una fila de espacios donde cada espacio almacena
un dato.

Por ejemplo:

``` java
int[] numeros = {10, 20, 30, 40, 50};
```

Aquí creamos un array llamado `numeros` que contiene cinco valores.

Una característica importante de los arrays en Java es que sus
posiciones comienzan desde cero.

Podemos visualizarlo de esta manera:

``` text
Posición:   0    1    2    3    4
Valor:     10   20   30   40   50
```

Por lo tanto, el primer elemento está en la posición `0` y el último
está en la posición `4`.

## Acceder a los elementos de un array

Para acceder a un elemento utilizamos el nombre del array seguido de la
posición entre corchetes.

Por ejemplo:

``` java
int[] numeros = {10, 20, 30, 40, 50};

System.out.println(numeros[0]);
System.out.println(numeros[3]);
```

La primera instrucción accede a la posición `0`, por lo que muestra:

``` text
10
```

La segunda instrucción accede a la posición `3`, por lo que muestra:

``` text
40
```

También podemos modificar un elemento del array.

Por ejemplo:

``` java
numeros[1] = 25;
```

Ahora el contenido del array será:

``` text
10, 25, 30, 40, 50
```

## Recorrer un array

Cuando tenemos muchos elementos, no sería práctico acceder a cada
posición manualmente.

Podemos utilizar un bucle `for`, como el que aprendimos en la lección
anterior.

Por ejemplo:

``` java
int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

En este ejemplo utilizamos `length`.

`length` nos indica cuántos elementos tiene el array.

En nuestro caso:

``` java
numeros.length
```

vale `5`.

El bucle comienza en `0` y continúa mientras `i` sea menor que `5`.

En cada repetición utilizamos:

``` java
numeros[i]
```

para acceder al elemento correspondiente.

El resultado será:

``` text
10
20
30
40
50
```

## Ejercicio práctico: calcular un promedio

Ahora vamos a realizar un ejercicio utilizando arrays y bucles.

### Enunciado

Tenemos las notas de cinco estudiantes:

``` text
15, 18, 12, 16, 14
```

Nuestro objetivo es crear un programa que almacene estas notas en un
array y calcule su promedio.

### Paso 1: Crear el array

Primero almacenamos las notas:

``` java
int[] notas = {15, 18, 12, 16, 14};
```

### Paso 2: Crear una variable para la suma

Necesitamos una variable que nos permita acumular todas las notas.

``` java
int suma = 0;
```

Comenzamos con el valor `0` porque todavía no hemos sumado ninguna nota.

### Paso 3: Recorrer el array

Ahora utilizamos un `for`:

``` java
for (int i = 0; i < notas.length; i++) {
    suma = suma + notas[i];
}
```

En cada repetición obtenemos una nota y la agregamos a `suma`.

Cuando termina el bucle, la variable `suma` contiene la suma de todas
las notas.

### Paso 4: Calcular el promedio

Ahora dividimos la suma entre la cantidad de notas:

``` java
double promedio = (double) suma / notas.length;
```

Utilizamos `double` porque el promedio puede contener decimales.

### Paso 5: Mostrar el resultado

Finalmente mostramos el promedio:

``` java
System.out.println("Promedio: " + promedio);
```

## Código completo

Ahora podemos unir todos los pasos:

``` java
public class Main {
    public static void main(String[] args) {

        // 1. Creamos un array con las notas.
        int[] notas = {15, 18, 12, 16, 14};

        // 2. Creamos una variable para almacenar la suma.
        int suma = 0;

        // 3. Recorremos todas las posiciones del array.
        for (int i = 0; i < notas.length; i++) {

            // 4. Sumamos cada nota.
            suma = suma + notas[i];
        }

        // 5. Calculamos el promedio.
        double promedio = (double) suma / notas.length;

        // 6. Mostramos el resultado.
        System.out.println("Promedio: " + promedio);
    }
}
```

Al ejecutar el programa obtenemos:

``` text
Promedio: 15.0
```

## Conclusión

En esta lección aprendimos que los arrays permiten almacenar varios
valores del mismo tipo dentro de una sola estructura.

También aprendimos que las posiciones de un array comienzan desde cero y
que podemos utilizar `length` para conocer la cantidad de elementos.

Finalmente, combinamos arrays y bucles para recorrer las notas y
calcular su promedio.

Los arrays son muy importantes porque nos permiten trabajar de una
manera más organizada con conjuntos de datos.
