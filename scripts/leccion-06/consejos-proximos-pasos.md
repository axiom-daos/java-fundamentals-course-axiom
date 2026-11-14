# script: consejos y proximos pasos

# Guía: Consejos y próximos pasos en Java

Esta lección recopila **los 8 errores más comunes** al programar en Java, con un ejemplo del error y su corrección. Muchos de ellos no generan error de compilación, por lo que el programa corre pero **hace algo distinto a lo esperado**. Conocerlos ayuda a detectarlos rápido.

**Secciones:**

1. Usar `=` en lugar de `==`
2. Comparar Strings con `==` en lugar de `equals`
3. Concatenar en lugar de sumar
4. División entera
5. Punto y coma después del `if`
6. Error de un elemento en bucles (off-by-one)
7. Olvidar el `break` en un `switch`
8. Bucle infinito
9. Próximos pasos

---

## 1. Usar `=` en lugar de `==` en una comparación

### Resumen

En Java, `=` es el operador de **asignación** (guarda un valor en una variable) y `==` es el operador de **comparación** (pregunta si dos valores son iguales). Confundirlos es un error clásico.

Con tipos como `int`, Java ayuda: `if (x = 10)` **no compila**, porque asignar produce un número y el `if` exige un valor `boolean`.

### Código

```java
int x = 5;
// if (x = 10) { }          // ERROR de compilación: asigna, no compara
if (x == 10) { }            // correcto
```

### Puntos a recordar

- `=` asigna, `==` compara.
- Con `boolean` el error sí podría compilar (`if (flag = true)`), así que conviene tener cuidado.

---

## 2. Comparar Strings con `==` en lugar de `equals`

### Resumen

Los `String` son **objetos**, no tipos primitivos. Con objetos, `==` compara **referencias** (si ambas variables apuntan al mismo objeto en memoria), no el contenido. Para comparar el **texto** se usa el método `equals()`.

En el ejemplo se crean dos objetos distintos con `new String("hola")`: tienen el mismo texto, pero son objetos diferentes, por eso `==` da `false` y `equals` da `true`.

### Código

```java
String a = new String("hola");
String b = new String("hola");
System.out.println(a == b);       // false (compara referencias)
System.out.println(a.equals(b));  // true  (compara contenido)
```

### Puntos a recordar

- Para comparar el contenido de Strings, **siempre** usar `equals()`.
- Existe también `equalsIgnoreCase()` para ignorar mayúsculas y minúsculas.
- Con literales (`"hola" == "hola"`) a veces `==` da `true` por una optimización de Java, pero no se debe depender de eso.

---

## 3. Concatenar en lugar de sumar

### Resumen

El operador `+` hace dos cosas: **suma** números y **concatena** texto. Cuando un `String` aparece primero, Java evalúa de izquierda a derecha y trata todo lo que sigue como texto: `"Suma: " + 5` se vuelve `"Suma: 5"` y luego se le pega `3`, resultando `"Suma: 53"`.

La solución es usar **paréntesis** para forzar que la suma se haga primero.

### Código

```java
int n1 = 5, n2 = 3;
System.out.println("Suma: " + n1 + n2);     // "Suma: 53"
System.out.println("Suma: " + (n1 + n2));   // "Suma: 8"
```

### Puntos a recordar

- Salidas: `Suma: 53` y `Suma: 8`.
- Cuando mezclas texto y operaciones matemáticas, usa paréntesis en la operación.

---

## 4. División entera

### Resumen

Si **ambos operandos son `int`**, Java realiza una **división entera** y descarta la parte decimal (no redondea, la elimina). Por eso `5 / 2` da `2`. Para obtener decimales, al menos uno de los operandos debe ser `double` (por ejemplo `2.0`).

### Código

```java
System.out.println(5 / 2);     // 2, no 2.5
System.out.println(5 / 2.0);   // 2.5
```

### Puntos a recordar

- `int / int` → resultado `int`.
- `int / double` → resultado `double`.
- Si trabajas con variables, puedes convertir con un *cast*: `(double) a / b`.

---

## 5. Punto y coma después del `if` (bloque vacío)

### Resumen

Si se escribe `;` justo después de la condición del `if`, Java lo interpreta como **una instrucción vacía**: ese es todo el cuerpo del `if`. El bloque `{ ... }` que viene después **ya no pertenece al `if`**, es un bloque independiente que se ejecuta siempre.

En el ejemplo, `x` vale 5, así que `x > 100` es falso, pero aun así el mensaje se imprime.

### Código

```java
if (x > 100);
{
    System.out.println("Esto se imprime siempre");
}
```

### Puntos a recordar

- Nunca poner `;` después de `if (...)`, `for (...)` o `while (...)`, salvo que sea intencional.
- Este error es difícil de ver porque el código compila y no muestra advertencias claras.

---

## 6. Off-by-one en bucles

### Resumen

Es un error de **un elemento de más o de menos** en el recorrido de un bucle. Los índices de un array empiezan en `0` y el último es `length - 1`. Por eso la condición correcta es `i < numeros.length`. Si se usa `<=`, el bucle intenta acceder a `numeros[3]`, que no existe, y lanza `ArrayIndexOutOfBoundsException`.

### Código

```java
int[] numeros = {10, 20, 30};
for (int i = 0; i < numeros.length; i++) {   // con <= fallaría
    System.out.println(numeros[i]);
}
```

### Puntos a recordar

- Un array de 3 elementos tiene índices `0`, `1` y `2`.
- Salida del ejemplo: `10`, `20`, `30`.
- Si no necesitas el índice, un `for-each` evita este error: `for (int n : numeros)`.

---

## 7. Olvidar el `break` en un `switch`

### Resumen

En un `switch`, una vez que se cumple un `case`, Java ejecuta su código y **continúa con los casos siguientes** hasta encontrar un `break` o llegar al final (comportamiento llamado *fall-through*). Sin `break`, el valor `1` imprime tanto "Lunes" como "Martes".

### Código

```java
int dia = 1;
switch (dia) {
    case 1: System.out.println("Lunes");      // sin break sigue al siguiente caso
    case 2: System.out.println("Martes");
}
```

### Puntos a recordar

- Salida del ejemplo: `Lunes` y `Martes`.
- Corrección: agregar `break;` al final de cada `case`.
- Se puede añadir un `default` para el caso en que ningún `case` coincida.

---

## 8. Bucle infinito (la condición nunca cambia)

### Resumen

Un bucle `while` se repite mientras su condición sea verdadera. Si dentro del bucle **nada modifica la variable de la condición**, esta nunca se vuelve falsa y el programa no termina. En el ejemplo falta `i++`, por lo que `i` siempre vale `0`. Está comentado en el código para que no se ejecute.

### Código

```java
int i = 0;
// while (i < 5) { System.out.println(i); }   // falta i++
```

### Puntos a recordar

- Verificar siempre que algo dentro del bucle haga avanzar la condición.
- Corrección: `while (i < 5) { System.out.println(i); i++; }`.
- Si un programa se queda colgado, se puede detener manualmente (por ejemplo con `Ctrl + C` en la consola).

---

## 9. Próximos pasos

> Esta sección es una sugerencia de ruta de estudio para continuar después de la lección; no proviene del código de la lección.

Con los fundamentos de Java y de POO ya cubiertos, algunos temas para seguir avanzando:

1. **Herencia y polimorfismo**: reutilizar y especializar clases (`extends`, sobrescritura de métodos).
2. **Interfaces y clases abstractas**: definir contratos que otras clases implementan.
3. **Manejo de excepciones**: `try`, `catch`, `finally` para controlar errores en lugar de que el programa se detenga.
4. **Colecciones**: profundizar en `List`, `Map` y `Set`.
5. **Archivos**: leer y escribir datos para que no se pierdan al cerrar el programa.
6. **Proyectos propios**: practicar con programas pequeños (agenda, gestor de tareas, inventario) para consolidar lo aprendido.

---

## Resumen general

| # | Error | Qué pasa | Solución |
|---|---|---|---|
| 1 | `=` en vez de `==` | Asigna en lugar de comparar | Usar `==` |
| 2 | `==` con Strings | Compara referencias | Usar `equals()` |
| 3 | `"Suma: " + n1 + n2` | Concatena y da `53` | Usar paréntesis `(n1 + n2)` |
| 4 | `5 / 2` | Da `2`, descarta decimales | Usar `5 / 2.0` |
| 5 | `if (...);` | El bloque se ejecuta siempre | Quitar el `;` |
| 6 | `i <= length` | Se sale del array | Usar `i < length` |
| 7 | `switch` sin `break` | Ejecuta casos de más | Agregar `break;` |
| 8 | Falta `i++` | Bucle infinito | Actualizar la variable del bucle |