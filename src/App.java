import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner pio = new Scanner(System.in);
        int opcionMenu = 0;
        String[] nombresPrendas = { "Jeans AirFlex", "Graphic Tee", "Denim Jacket", null, null };
        String nombreReferencia;

        while (opcionMenu != 4) {

            System.out.println("escoja una pocion:");

            System.out.println("1. Lista de coleccion en la bodega");
            System.out.println("2. Nombre de la referencia");
            System.out.println("3. Registrar nueva prenda al lote");
            System.out.println("4. Salir ");
