// TODO 1: Importa las clases necesarias para trabajar con listas
//   y para leer datos del teclado (pista: el paquete java.util).


// TODO 2: Crea una clase llamada Persona.
//   - Declara un atributo privado de tipo String llamado "nombre".
//   - Declara un atributo privado de tipo int llamado "edad".
//   - Crea un constructor público que reciba el nombre y la edad
//     como parámetros y los asigne a los atributos (usa "this").
//   - Crea los métodos "getter" para obtener el nombre y la edad
//     (getNombre y getEdad).
//   - Crea los métodos "setter" para modificar el nombre y la edad
//     (setNombre y setEdad).
//   - Crea un método público llamado "saludar" que no reciba parámetros
//     y devuelva un String con el siguiente formato:
//     "Hola me llamo [nombre] y tengo [edad] anios"


public class MyClass {

    public static void main(String args[]) {

        // TODO 3: Crea una lista de tipo Persona llamada "contactos"
        //   (usa List y ArrayList).


        // TODO 4: Crea un objeto Scanner llamado "sc" para leer
        //   datos desde el teclado (System.in).


        // TODO 5: Declara una variable de tipo Persona llamada
        //   "nuevoContacto" e inicialízala en null.


        // TODO 6: Crea un ciclo infinito con "while(true)". Dentro del ciclo:
        //   a) Muestra el mensaje "Ingrese un nombre: " y lee el nombre
        //      con sc.nextLine().
        //   b) Muestra el mensaje "Ingrese edad: " y lee la edad
        //      con sc.nextInt().
        //   c) Limpia el salto de línea pendiente con sc.nextLine().
        //   d) Crea un nuevo objeto Persona con los datos ingresados,
        //      guárdalo en "nuevoContacto" y agrégalo a la lista "contactos".
        //   e) Muestra el mensaje "Desea continuar: " y lee un número entero
        //      con sc.nextInt() (1 = continuar, 0 = salir).
        //      Recuerda limpiar el salto de línea con sc.nextLine().
        //   f) Si el usuario ingresó 1, continúa con el ciclo (continue).
        //      Si ingresó 0, sal del ciclo (break).


        // TODO 7: Muestra el título "=== Lista de contactos ===".


        // TODO 8: Recorre la lista con un ciclo "for" (usando el índice "i")
        //   y, por cada contacto, imprime lo siguiente:
        //   - "contacto #" seguido del número del contacto (empieza en 1).
        //   - "nombre: " seguido del nombre del contacto.
        //   - "edad: " seguido de la edad del contacto.
        //   - Una línea en blanco al final.
        //   (usa contactos.get(i) y los getters).

    }
}