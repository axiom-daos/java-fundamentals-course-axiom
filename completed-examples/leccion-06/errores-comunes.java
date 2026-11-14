public class MyClass {
  public static void main(String args[]) {
    // 1. Usar = en lugar de == en una comparación
        int x = 5;
        // if (x = 10) { }          // ERROR de compilación: asigna, no compara
        if (x == 10) { }            // correcto

        // 2. Comparar Strings con == en lugar de equals
        String a = new String("hola");
        String b = new String("hola");
        System.out.println(a == b);       // false (compara referencias)
        System.out.println(a.equals(b));  // true  (compara contenido)

        // 3. Concatenar en lugar de sumar
        int n1 = 5, n2 = 3;
        System.out.println("Suma: " + n1 + n2);     // "Suma: 53"
        System.out.println("Suma: " + (n1 + n2));   // "Suma: 8"

        // 4. División entera
        System.out.println(5 / 2);     // 2, no 2.5
        System.out.println(5 / 2.0);   // 2.5

        // 5. Punto y coma después del if (bloque vacío)
        if (x > 100);
        {
            System.out.println("Esto se imprime siempre");
        }

        // 6. Off-by-one en bucles
        int[] numeros = {10, 20, 30};
        for (int i = 0; i < numeros.length; i++) {   // con <= fallaría
            System.out.println(numeros[i]);
        }

        // 7. Olvidar el break en un switch
        int dia = 1;
        switch (dia) {
            case 1: System.out.println("Lunes");      // sin break sigue al siguiente caso
            case 2: System.out.println("Martes");
        }

        // 8. Bucle infinito (la condición nunca cambia)
        int i = 0;
        // while (i < 5) { System.out.println(i); }   // falta i++
  }
}