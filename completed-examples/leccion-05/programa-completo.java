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