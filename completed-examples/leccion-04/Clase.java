class Mascota {
    String nombre;
    int energia;
}

class Estudiante {
    String codigo;
    String nombre;
    double promedio;
}

class Producto {
    String nombre;
    double precio;
    int stock;
}

class Vehiculo {
    String marca;
    String modelo;
    int anio;
}

class CuentaBancaria {
    String titular;
    double saldo;
    String numeroCuenta;
}

public class Clase {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: estructura de la clase Mascota ===");
        Mascota mascota = new Mascota();
        mascota.nombre = "Firulais";
        mascota.energia = 85;
        System.out.println("Mascota: " + mascota.nombre + " / energía: " + mascota.energia);

        System.out.println("=== Ejemplo 2: estructura de la clase Estudiante ===");
        Estudiante estudiante = new Estudiante();
        estudiante.codigo = "2026-01";
        estudiante.nombre = "Ana";
        estudiante.promedio = 17.5;
        System.out.println("Estudiante: " + estudiante.nombre + " / promedio: " + estudiante.promedio);

        System.out.println("=== Ejemplo 3: estructura de la clase Producto ===");
        Producto producto = new Producto();
        producto.nombre = "Laptop";
        producto.precio = 1200.0;
        producto.stock = 8;
        System.out.println("Producto: " + producto.nombre + " / precio: $" + producto.precio + " / stock: " + producto.stock);

        System.out.println("=== Ejemplo 4: estructura de la clase Vehiculo ===");
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.marca = "Toyota";
        vehiculo.modelo = "Corolla";
        vehiculo.anio = 2024;
        System.out.println("Vehículo: " + vehiculo.marca + " " + vehiculo.modelo + " / año: " + vehiculo.anio);

        System.out.println("=== Ejemplo 5: estructura de la clase CuentaBancaria ===");
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.titular = "Juan Pérez";
        cuenta.saldo = 1500.50;
        cuenta.numeroCuenta = "001234567";
        System.out.println("Cuenta de " + cuenta.titular + " / saldo: $" + cuenta.saldo);
    }
}

