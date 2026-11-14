# script: fundamentos de poo y programa sencillo

# Guía: Fundamentos de POO en Java

Esta guía resume cada sección de la lección. Parte de una clase `Persona` muy simple y la va mejorando paso a paso hasta llegar a un programa completo que pide datos por consola.

**Secciones:**

1. Constructores
2. Encapsulación
3. Métodos de comportamiento
4. Array (lista) de objetos
5. Programa completo

---

## 1. Constructores

### Resumen

Un **constructor** es un método especial que se ejecuta cuando se crea un objeto con `new`. Su función es **inicializar los atributos** del objeto con los valores que le pasamos.

Características clave:

- Tiene **el mismo nombre que la clase** (`Persona`).
- **No declara tipo de retorno** (ni siquiera `void`).
- Recibe parámetros y los asigna a los atributos usando `this`.
- `this.nombre` se refiere al **atributo del objeto**, mientras que `nombre` (sin `this`) es el **parámetro** del constructor. `this` evita la ambigüedad cuando ambos se llaman igual.

En este ejemplo, `Persona` está declarada como `static class` dentro de `MyClass` (clase anidada), por lo que se puede usar directamente desde `main` sin crear antes un objeto de `MyClass`.

### Código

```java
public class MyClass {

    static class Persona {
        
        String nombre;
        int edad;
        
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
  public static void main(String args[]) {
      
      Persona persona = new Persona("Luiz", 15);
      
      System.out.println(persona.nombre);
      System.out.print(persona.edad);
   
  }
}
```

### Puntos a recordar

- `new Persona("Luiz", 15)` crea el objeto y llama al constructor.
- Aquí los atributos son accesibles directamente (`persona.nombre`). Esto funciona, pero no es una buena práctica; la siguiente sección lo corrige.
- `println` imprime y salta de línea; `print` imprime sin salto de línea.

---

## 2. Encapsulación

### Resumen

La **encapsulación** consiste en **proteger los datos internos** de una clase para que no se modifiquen libremente desde afuera. Se logra con dos pasos:

1. Declarar los atributos como **`private`**, de modo que solo se puedan usar dentro de la propia clase.
2. Ofrecer métodos **públicos** para acceder a ellos:
   - **Getters** (`getNombre()`, `getEdad()`): devuelven el valor del atributo.
   - **Setters** (`setNombre()`, `setEdad()`): modifican el valor del atributo.

Esto da control sobre cómo se leen y modifican los datos (por ejemplo, más adelante se podría validar que la edad no sea negativa dentro del setter).

También se agrega un **constructor vacío** (`public Persona(){}`) además del constructor con parámetros. Tener varios constructores se llama **sobrecarga de constructores** y permite crear objetos de distintas formas.

Ahora `Persona` es una clase independiente (ya no está anidada) y `MyClass` solo contiene el `main`.

### Código

```java
class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(){}
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class MyClass {
    
    public static void main(String args[]) {
   
        Persona persona = new Persona("Luiz", 15);
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        
        persona.setNombre("Pepe");
        persona.setEdad(20);
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
    
    }
}
```

### Puntos a recordar

- Con atributos `private`, ya no se puede escribir `persona.nombre` desde fuera de la clase; hay que usar `getNombre()`.
- La salida del ejemplo es: `Luiz`, `15`, y luego tras los setters: `Pepe`, `20`.
- Convención de nombres: `get` + nombre del atributo con mayúscula inicial, y lo mismo con `set`.

---

## 3. Métodos de comportamiento

### Resumen

Hasta ahora la clase solo **guardaba datos**. Los **métodos de comportamiento** representan **lo que el objeto puede hacer**. En POO, una clase combina:

- **Estado**: los atributos (`nombre`, `edad`).
- **Comportamiento**: los métodos (`saludar()`).

El método `saludar()` construye y devuelve un `String` usando los datos del propio objeto, concatenándolos con el operador `+`. Cada objeto `Persona` responderá según **sus propios datos**.

### Código

```java
class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(){}
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String saludar() {
        return "Hola me llamo " + this.nombre + " y tengo " + this.edad + " anios";
    }
}

public class MyClass {
    
    public static void main(String args[]) {
   
        Persona persona = new Persona("Luiz", 15);
        
        System.out.println(persona.saludar());
    
    }
}
```

### Puntos a recordar

- La salida es: `Hola me llamo Luiz y tengo 15 anios`.
- El método retorna un `String` (con `return`) en lugar de imprimir directamente; quien lo llama decide qué hacer con el resultado.
- Dentro de la clase se accede a los atributos privados con `this`.

---

## 4. Array (lista) de objetos

### Resumen

Normalmente se trabaja con **varios objetos** a la vez. Para guardarlos se usa una colección; en este caso un **`List<Persona>`** implementado con **`ArrayList`**, que a diferencia de un array tradicional **crece dinámicamente**.

Pasos:

1. Importar las utilidades con `import java.util.*;`.
2. Crear varios objetos `Persona`.
3. Crear la lista: `List<Persona> personas = new ArrayList<>();`
4. Agregar los objetos con `add()`.
5. Recorrerla con `forEach` y una **expresión lambda**.

`List<Persona>` indica que la lista solo acepta objetos de tipo `Persona` (esto se llama **genéricos**). El `<>` vacío en `new ArrayList<>()` deja que Java infiera el tipo.

### Código

```java
import java.util.*;

class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(){}
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String saludar() {
        return "Hola me llamo " + this.nombre + " y tengo " + this.edad + " anios";
    }
}

public class MyClass {
    
    public static void main(String args[]) {
   
        Persona persona1 = new Persona("Luiz", 15);
        Persona persona2 = new Persona("Pepe", 20);
        Persona persona3 = new Persona("Carlos", 18);
        
        List<Persona> personas = new ArrayList<>();
        
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        
        personas.forEach(persona -> System.out.println(persona.getNombre()));
    
    }
}
```

### Puntos a recordar

- `persona -> System.out.println(persona.getNombre())` es una lambda: `persona` representa cada elemento de la lista en cada vuelta.
- La salida es: `Luiz`, `Pepe`, `Carlos`.
- Otras operaciones útiles de `List`: `get(i)`, `size()`, `remove(i)`.

---

## 5. Programa completo

### Resumen

Esta sección integra todo lo anterior en una **aplicación de consola** que funciona como una pequeña agenda de contactos:

1. **Entrada de datos**: se usa `Scanner` para leer lo que escribe el usuario.
2. **Bucle `while(true)`**: pide nombre y edad, crea un objeto `Persona`, lo agrega a la lista y pregunta si se desea continuar (`1` = sí, `0` = no).
3. **Control del bucle**: `continue` vuelve al inicio del bucle y `break` lo termina.
4. **Salida de datos**: un `for` clásico recorre la lista con índice y muestra cada contacto usando los getters.

Detalle importante sobre `Scanner`: después de `nextInt()` queda pendiente el salto de línea (Enter) en el buffer. Por eso se agrega `sc.nextLine()` justo después, para **consumir ese salto** y evitar que la siguiente lectura de texto salga vacía.

### Código

```java
import java.util.*;

class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(){}
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String saludar() {
        return "Hola me llamo " + this.nombre + " y tengo " + this.edad + " anios";
    }
}

public class MyClass {
    
    public static void main(String args[]) {
   
       List<Persona> contactos = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       
       Persona nuevoContacto = null;
       
       while(true) {
           
           System.out.println("Ingrese un nombre: ");
           String nombreContacto = sc.nextLine();
           
           System.out.println("Ingrese edad: ");
           int edadContacto = sc.nextInt();
           sc.nextLine();
           
           nuevoContacto = new Persona(nombreContacto, edadContacto);
           
           contactos.add(nuevoContacto);
           
           System.out.println("Desea continuar: ");
           int continuar = sc.nextInt();
           sc.nextLine();
           
           if(continuar == 1) continue;
           if(continuar == 0) break;
       }
       
       System.out.println("=== Lista de contactos ===");
       
       for(int i = 0; i < contactos.size(); i++) {
           
           System.out.println("contacto #" + (i + 1));
           System.out.println("Nombre: " + contactos.get(i).getNombre());
           System.out.println("Edad: " + contactos.get(i).getEdad());
           System.out.println();
       }
    
    }
}
```

### Puntos a recordar

- `(i + 1)` va entre paréntesis para que Java **sume** en lugar de concatenar `i` y `1` como texto.
- Si el usuario escribe un número distinto de `0` o `1`, ninguno de los `if` se cumple y el bucle simplemente **continúa** pidiendo otro contacto.
- `contactos.get(i)` devuelve el objeto `Persona` de esa posición, sobre el cual se llaman los getters.
- `contactos.size()` devuelve la cantidad de elementos de la lista.
- Mejora posible: usar `saludar()` dentro del listado, o validar la entrada para evitar errores si el usuario escribe texto donde se espera un número.

---

## Resumen general

| Concepto | Para qué sirve | Palabra o elemento clave |
|---|---|---|
| Constructor | Inicializar un objeto al crearlo | `public Persona(...)`, `this`, `new` |
| Encapsulación | Proteger los datos y controlar su acceso | `private`, getters y setters |
| Métodos de comportamiento | Definir lo que el objeto puede hacer | `saludar()` |
| Lista de objetos | Manejar varios objetos a la vez | `List`, `ArrayList`, `add()`, `forEach` |
| Programa completo | Integrar todo con entrada y salida por consola | `Scanner`, `while`, `for`, `break`, `continue` |