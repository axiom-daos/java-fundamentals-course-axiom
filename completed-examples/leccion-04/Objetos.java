class Mascota {
    String nombre;
    int energia;

    public Mascota(String n, int e) {
        nombre = n;
        energia = e;
    }
}

class Estudiante {
    String nombre;
    double promedio;

    public Estudiante(String nom, double prom) {
        nombre = nom;
        promedio = prom;
    }
}

class Producto {
    String nombre;
    double precio;

    public Producto(String nom, double prec) {
        nombre = nom;
        precio = prec;
    }
}

class Vehiculo {
    String marca;
    int anio;

    public Vehiculo(String mar, int an) {
        marca = mar;
        anio = an;
    }
}

class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String tit, double sal) {
        titular = tit;
        saldo = sal;
    }
}

public class Objetos {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: creación de objetos de tipo Mascota ===");
        Mascota luna = new Mascota("Luna", 80);
        Mascota max = new Mascota("Max", 95);
        System.out.println("Objeto 1: " + luna.nombre + " (Energía: " + luna.energia + ")");
        System.out.println("Objeto 2: " + max.nombre + " (Energía: " + max.energia + ")");

        System.out.println("=== Ejemplo 2: creación de objetos de tipo Estudiante ===");
        Estudiante est1 = new Estudiante("Lucía", 17.5);
        Estudiante est2 = new Estudiante("Mateo", 15.0);
        System.out.println("Estudiante 1: " + est1.nombre + " - Promedio: " + est1.promedio);
        System.out.println("Estudiante 2: " + est2.nombre + " - Promedio: " + est2.promedio);

        System.out.println("=== Ejemplo 3: creación de objetos de tipo Producto ===");
        Producto p1 = new Producto("Laptop", 1200.00);
        Producto p2 = new Producto("Mouse", 25.50);
        System.out.println("Producto: " + p1.nombre + " cuesta $" + p1.precio);
        System.out.println("Producto: " + p2.nombre + " cuesta $" + p2.precio);

        System.out.println("=== Ejemplo 4: creación de objetos de tipo Vehiculo ===");
        Vehiculo auto1 = new Vehiculo("Toyota", 2024);
        Vehiculo auto2 = new Vehiculo("Hyundai", 2022);
        System.out.println("Auto 1 -> Marca: " + auto1.marca + ", Año: " + auto1.anio);
        System.out.println("Auto 2 -> Marca: " + auto2.marca + ", Año: " + auto2.anio);

        System.out.println("=== Ejemplo 5: creación de objetos de tipo CuentaBancaria ===");
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1500.50);
        CuentaBancaria cuenta2 = new CuentaBancaria("María López", 3200.00);
        System.out.println("Cuenta de " + cuenta1.titular + " con saldo: $" + cuenta1.saldo);
        System.out.println("Cuenta de " + cuenta2.titular + " con saldo: $" + cuenta2.saldo);
    }
}