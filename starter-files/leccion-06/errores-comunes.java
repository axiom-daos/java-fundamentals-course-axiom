public class MyClass {

    public static void main(String args[]) {

        // ===== 1. Usar = en lugar de == en una comparación =====
        // TODO 1: Declara una variable int llamada "x" con el valor 5.
        // TODO 2: Escribe (en un comentario) un "if" que use = en lugar de ==
        //   para comparar x con 10. Indica qué error de compilación produce
        //   y por qué (asigna, no compara).
        // TODO 3: Escribe la versión correcta: un "if" que compare x con 10
        //   usando ==. El bloque puede quedar vacío.


        // ===== 2. Comparar Strings con == en lugar de equals =====
        // TODO 4: Crea dos Strings "a" y "b", ambos con new String("hola").
        // TODO 5: Imprime el resultado de comparar a y b con ==.
        //   Antes de ejecutar, anota en un comentario qué crees que imprimirá
        //   y por qué (pista: referencias vs. contenido).
        // TODO 6: Imprime el resultado de comparar a y b con equals().
        //   Anota en un comentario qué imprime y por qué.


        // ===== 3. Concatenar en lugar de sumar =====
        // TODO 7: Declara dos variables int: n1 con el valor 5 y n2 con el valor 3.
        // TODO 8: Imprime "Suma: " seguido de n1 y n2 usando solo concatenación (+).
        //   Anota en un comentario qué se imprime y por qué.
        // TODO 9: Corrige el error para que se imprima "Suma: 8"
        //   (pista: usa paréntesis).


        // ===== 4. División entera =====
        // TODO 10: Imprime el resultado de 5 / 2.
        //   Anota en un comentario qué imprime y por qué no es 2.5.
        // TODO 11: Imprime el resultado de la división de 5 entre 2
        //   de forma que el resultado sea 2.5 (pista: usa un número decimal).


        // ===== 5. Punto y coma después del if (bloque vacío) =====
        // TODO 12: Escribe un "if" que verifique si x > 100, pero coloca
        //   un punto y coma (;) justo después de la condición.
        // TODO 13: Debajo, agrega un bloque { } que imprima
        //   "Esto se imprime siempre".
        //   Ejecuta y anota en un comentario por qué el mensaje se imprime
        //   aunque la condición sea falsa.
        // TODO 14: Corrige el código eliminando el punto y coma.


        // ===== 6. Off-by-one en bucles =====
        // TODO 15: Crea un arreglo de int llamado "numeros" con los valores
        //   10, 20 y 30.
        // TODO 16: Recorre el arreglo con un ciclo "for" e imprime cada elemento.
        //   Usa la condición correcta: i < numeros.length.
        // TODO 17: Anota en un comentario qué ocurriría si usaras
        //   i <= numeros.length (¿qué excepción se lanzaría?).


        // ===== 7. Olvidar el break en un switch =====
        // TODO 18: Declara una variable int llamada "dia" con el valor 1.
        // TODO 19: Crea un "switch" sobre "dia" con dos casos:
        //   - case 1: imprime "Lunes".
        //   - case 2: imprime "Martes".
        //   No uses break. Ejecuta y anota qué se imprime y por qué
        //   (fall-through).
        // TODO 20: Corrige el switch agregando el break donde corresponda.


        // ===== 8. Bucle infinito (la condición nunca cambia) =====
        // TODO 21: Declara una variable int llamada "i" con el valor 0.
        //   (Nota: si ya usaste "i" en el ciclo for anterior, el for la
        //   declaró dentro de su propio alcance, así que aquí no hay conflicto.)
        // TODO 22: Escribe en un comentario un "while (i < 5)" que imprima i
        //   pero que NO incremente i. Explica por qué sería un bucle infinito.
        //   (No lo dejes activo, ¡o el programa nunca terminará!)
        // TODO 23: Escribe la versión correcta del while, incrementando i
        //   en cada vuelta (i++).

    }
}