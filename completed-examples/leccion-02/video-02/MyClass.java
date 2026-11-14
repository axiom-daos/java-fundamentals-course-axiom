
public class MyClass {
    public static void main(String[] args) {
        int puntos = 120;
        int bono = 30;
        int vidas = 2;
        boolean activo = true;

        int suma = puntos + bono;
        int puntajeFinal = puntos + bono * 2;
        boolean puedeContinuar = vidas > 0 && activo;
        boolean recibePremio = puntajeFinal >= 180 || vidas == 3;

        System.out.println("Suma de puntos y bono: " + suma);
        System.out.println("Puntaje final: " + puntajeFinal);
        System.out.println("Puede continuar: " + puedeContinuar);
        System.out.println("Recibe premio: " + recibePremio);
        System.out.println("Division entera 5 / 2: " + (5 / 2));
        System.out.println("Division decimal 5.0 / 2: " + (5.0 / 2));
    }
}
