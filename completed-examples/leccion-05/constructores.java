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