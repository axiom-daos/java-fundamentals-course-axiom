
# Guion - Lección 2 (Video 2): Operadores y expresiones

**Duración orientativa:** 6 a 7 minutos, contando escritura en JDoodle y pausas de práctica.

**Herramienta:** https://www.jdoodle.com/online-java-compiler

## Introducción 

Hola de nuevo.

En el video anterior aprendimos a guardar información en variables.

Pero un programa también necesita **hacer algo** con esos datos: sumar puntos, comparar cuántas vidas quedan o decidir si un jugador puede seguir participando.

Para ello utilizamos operadores y expresiones.

Vamos a seguir con un ejemplo de videojuego, para que todo sea más fácil de visualizar.

## Operadores

Un operador es un símbolo que realiza una operación.

Los operadores aritméticos son `+`, `-`, `*` y `/`, que sirven para sumar, restar, multiplicar y dividir.

Imagina que conseguimos 120 puntos y recibimos un bono de 30: podemos sumarlos para obtener 150.

También tenemos operadores de comparación: `>` significa mayor que, `<` menor que y `==` permite preguntar si dos valores son iguales.

Es muy importante distinguir `=` de `==`: un solo igual **asigna** un valor; dos iguales **comparan** valores.

Una comparación nos devuelve `true` o `false`.

También existen operadores lógicos.

`&&` significa **y**: se cumplen dos condiciones a la vez.

Por ejemplo, tener más de cero vidas **y** estar activo.

En cambio `||` significa **o**: basta con que se cumpla al menos una condición.

No te preocupes por memorizar todo inmediatamente; veremos cómo funcionan en el editor.

## ¿Qué es una expresión?

Una expresión combina valores, variables y operadores para obtener un resultado.

Por ejemplo, `puntos + bono * 2` es una expresión.

En Java, como en matemáticas, la multiplicación se realiza antes que la suma.

Si puntos vale 120 y bono vale 30, primero obtenemos 60 por el bono doble, y después sumamos 120.

El resultado es 180.

Si quisiéramos sumar primero, usaríamos paréntesis: `(puntos + bono) * 2`, cuyo resultado sería 300.

## Demostración en JDoodle

Abro JDoodle con Java y escribo una clase `MyClass` con el método `main`.

Declaro `int puntos = 120;`, `int bono = 30;`, `int vidas = 2;` y `boolean activo = true;`.

Escribo `int suma = puntos + bono;` y `int puntajeFinal = puntos + bono * 2;`.

Ahora muestro ambas cantidades con `System.out.println()`.

Ejecuto y observo 150 y 180.

Vemos que una expresión puede guardar su resultado en otra variable.

Probemos ahora una comparación con dos condiciones:

`boolean puedeContinuar = vidas > 0 && activo;`.

Esto da `true` porque tenemos dos vidas y el jugador está activo.

Escribo también:

`boolean recibePremio = puntajeFinal >= 180 || vidas == 3;`.

El resultado es `true` porque el puntaje sí llega a 180, aunque no tengamos tres vidas.

Mostramos ambos valores en pantalla.

Hagamos una última prueba: imprimimos `5 / 2` y `5.0 / 2`.

El primero muestra 2, porque los dos números son enteros y se descarta la parte decimal.

El segundo muestra 2.5, ya que el valor 5.0 tiene decimales.

Este detalle es importante cuando trabajamos con promedios, medidas o precios.

## Reto y comprobación

Ahora te toca.

Pausa el video y cambia `vidas` a cero.

Ejecuta de nuevo y observa qué sucede con `puedeContinuar`: debería mostrar `false`.

Después cambia `puntajeFinal` por la expresión `(puntos + bono) * 2` y comprueba si ahora resulta 300.

Como reto adicional, intenta cambiar `activo` a `false` y piensa cuál será el resultado de la condición con `&&` antes de ejecutar.

Si tu resultado no coincide, revisa que hayas colocado bien los paréntesis y que no estés confundiendo `=` con `==`.

## Cierre

Hoy practicamos operadores aritméticos, de comparación y lógicos, y vimos cómo formar expresiones.

Aprendimos además que la división entre enteros puede eliminar decimales.

En la siguiente lección utilizaremos estas condiciones para que nuestros programas tomen decisiones y repitan instrucciones.

¡Hasta la próxima!
