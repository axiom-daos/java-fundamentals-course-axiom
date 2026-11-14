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