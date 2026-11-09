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

            opcionMenu = pio.nextInt();
            switch (opcionMenu) {
                case 1:
                    for (int i = 0; i < nombresPrendas.length; i++) {
                        if (nombresPrendas[i] != null) {
                            System.out.println(nombresPrendas[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Nombre de la referencia");
                    pio.nextLine();
                    nombreReferencia = pio.nextLine();
                    boolean resultado = nombreFuncion(nombresPrendas, nombreReferencia);
                    if (resultado) {
                        System.out.println("Referencia encontrada");
                    } else {
                        System.out.println("Referencia no encontrada");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la nueva prenda:");
                    pio.nextLine();
                    String nuevaPrenda = pio.nextLine();
                    boolean agregado = false;
                    for (int i = 0; i < nombresPrendas.length; i++) {

                        if (nombresPrendas[i] == null) {
                            nombresPrendas[i] = nuevaPrenda;
                            agregado = true;
                            break;
                        }
                    }
                    if (agregado) {
                        System.out.println("Prenda registrada correctamente");
                    } else {
                        System.out.println("No hay espacios disponibles en el lote");
                    }
                    break;
                case 4:
                    System.out.println("4. Salir ");
                    break;

                default:
                    System.out.println("esa opcion no existe");