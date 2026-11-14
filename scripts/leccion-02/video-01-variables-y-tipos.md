
# Guion - Lección 2 (Video 1): Variables y tipos de datos

**Duración orientativa:** 6 a 7 minutos, contando escritura en JDoodle y pausas de práctica.

**Herramienta:** https://www.jdoodle.com/online-java-compiler

## Introducción

Hola. En este video aprenderemos a guardar información en Java utilizando **variables** y **tipos de datos**.

Imagina que estamos creando un videojuego. Necesitamos saber cómo se llama el jugador, cuántas vidas le quedan y si todavía está jugando.

Todos esos datos deben guardarse en alguna parte. Para eso sirven las variables.

No necesitas instalar nada: más adelante lo probaremos desde el navegador.

## ¿Qué es una variable?

Una variable es un espacio de memoria al que le damos un nombre para guardar un valor.

Podemos imaginarla como una caja con una etiqueta. Si la etiqueta dice **vidas**, dentro guardamos un número, por ejemplo tres.

Más adelante, si el jugador pierde una vida, ese número cambia.

Una variable tiene tres elementos importantes: el tipo, que indica qué clase de dato puede guardar; el nombre, que nos ayuda a reconocerla; y el valor, que es la información que contiene.

Por ejemplo, `int vidas = 3;`.

`int` es el tipo, `vidas` el nombre y `3` el valor inicial.

El signo igual asigna el valor a la variable, y el punto y coma cierra la instrucción.

##Tipos de datos 

No toda la información es igual.

Para contar vidas usamos `int`, que almacena números enteros.

Para una cantidad con decimales, como la energía del personaje, usamos `double`.

Para el nombre del jugador usamos `String`, que almacena texto y debe escribirse entre comillas dobles.

Para una respuesta de sí o no utilizamos `boolean`, cuyos valores posibles son `true` y `false`, sin comillas.

Recuerda que Java distingue entre mayúsculas y minúsculas: `String` empieza con S mayúscula, mientras que `int`, `double` y `boolean` se escriben en minúscula.

Los nombres claros, como `vidas` o `jugador`, facilitan entender el programa.

## Demostración en JDoodle

Ahora abrimos JDoodle y dejamos el editor configurado para Java.

Si el editor ya tiene una clase llamada `MyClass` y su método `main`, podemos conservarlos.

La ejecución empieza dentro de `main`.

Voy a borrar únicamente el contenido de ese método y escribir cuatro variables.

Primero, `String jugador = "Alex";`.

Después `int vidas = 3;`, `double energia = 87.5;` y `boolean jugando = true;`.

Observa que los textos llevan comillas, pero los números y el booleano no.

Luego usamos `System.out.println()` para imprimir los datos.

Por ejemplo, `System.out.println("Jugador: " + jugador);`.

Ese signo más permite juntar el texto con el valor de la variable.

Hacemos lo mismo para las vidas, la energía y el estado.

Presiono **Execute**.

Ahora vemos los cuatro valores en el panel de resultados: Alex, tres vidas, 87.5 de energía y `true`.

¿Y si el personaje pierde una vida?

Escribo `vidas = vidas - 1;` y luego muestro de nuevo la variable.

Al ejecutar aparece dos.

Fíjate que no repetí `int`: solo estoy cambiando el valor de una variable que ya existe.

## Pausa y reto

Te propongo una práctica.

Pausa el video y cambia el nombre del jugador por el tuyo.

Después modifica las vidas iniciales a cinco y la energía a 95.5.

Finalmente, ejecuta el programa y comprueba que la salida cambie.

Si algo falla, revisa el punto y coma, las comillas y que hayas escrito los nombres de forma idéntica.

Puedes consultar el archivo inicial y la solución del repositorio del curso.

## Cierre

Hoy aprendimos qué es una variable, qué partes tiene y cómo representar enteros, decimales, texto y valores de verdadero o falso.

En el siguiente video usaremos esos datos para realizar cálculos y comprobar condiciones mediante operadores y expresiones.

¡Nos vemos en la siguiente práctica!
