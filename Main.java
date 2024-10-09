import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear una instancia 
        Tienda tienda = new Tienda();
        Scanner datoUsuario = new Scanner(System.in);
        //Crear una variable para almacenar la opcion seleccionada
        int opcion;

        //Menu principal
        do {
            //Opciones del menu
            System.out.println("\n    .::Menu de la tienda::.  ");
            System.out.println("1.- Agregar Producto");
            System.out.println("2.- Mostrar productos");
            System.out.println("3.- Actualizar producto");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir de la tienda");
            opcion = datoUsuario.nextInt();

            //procesar la opcion seleccionada
            switch (opcion) {
                case 1:
                tienda.agregarProductos(datoUsuario);
                break;

                case 2:
                tienda.mostrarProductos();
                break;

                case 3:
                tienda.actualizarProductos(datoUsuario);
                break;

                case 4:
                tienda.eliminarProducto(datoUsuario);
                break;

                case 5:
                    datoUsuario.close();
                    return;

                default:
                System.out.println("Ingrese una opcion valida...");
               
            }
        } while (opcion != 5);
    }
}