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