
public class MyClass {
    public static void main(String[] args) {
        String jugador = "Alex";
        int vidas = 3;
        double energia = 87.5;
        boolean jugando = true;

        System.out.println("Jugador: " + jugador);
        System.out.println("Vidas: " + vidas);
        System.out.println("Energia: " + energia);
        System.out.println("Sigue jugando: " + jugando);

        vidas = vidas - 1;
        System.out.println("Vidas despues de perder una: " + vidas);
    }
}
