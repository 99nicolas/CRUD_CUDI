import java.util.ArrayList;
import java.util.Scanner;
//Tienda va a gestionar todo el CRUD
public class Tienda {
    //Atributos
    //Lista para almacenar productos
    private ArrayList<Producto> productos;
    //Inicializar el constructor 
    public Tienda(){
        productos = new ArrayList<>();
    } 

    //Metodo agregar productos
    public void agregarProductos(Scanner scanner){
        //Solicito los datos y los almaceno en variables

        System.out.println("Ingrese el id del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        //Agregar un producto a la lista 
        Producto producto = new Producto(id, nombre, precio);
        productos.add(producto);
        System.out.println("El producto" + nombre + "se agrego correctamente a la lista");
    }

    //Metodo mostrar o listar productos
    public void mostrarProductos(){
        //vamos a evaluar si la lista esta vacia o no
        if(productos.isEmpty()){
            System.out.println("No hay productos por ahora...");
        }else{
            //El for va a imprimir un sout por cada producto en mi lista
            for(Producto producto : productos){
                System.out.println(producto);
            }
        }

    }

    //Metodo para actualizar productos 
    public void actualizarProductos(Scanner scanner){
        //Solicito en primer lugar el id al usuario
        System.out.println("Ingrese el id del producto a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        //buscar ese id dentro de mi lista de productos 
        for(Producto producto : productos){
            //evaluo si existe una coincidencia entre el id producto y el id del usuario
            if(producto.getIdProducto()==id){
                //le solicito los datos a actualizar al ausuario
                System.out.println("Ingresa el nombre a actualizar: ");
                String nombreActualizado = scanner.nextLine();
                
                System.out.println("Ingrese el precio a actualizar: ");
                double precioActualizado = scanner.nextDouble();

                //Actualizar estos datos 
                //actualizo el nombre
                producto.setNombreProducto(nombreActualizado);
                //actualizo el preico
                producto.setPrecioProducto(precioActualizado);
                System.out.println("El producto fue actualizado.");
                return;

            }
        }System.out.println("El producto que quieres actualizar no se encuentra.");
    }

    //Metodo para eliminar productos
    public void eliminarProducto(Scanner scanner){
        //Solicito en primer lugar el id al usuario
        System.out.println("Ingrese el id del producto a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Producto productoAeliminar = null;
        //for para recorrer la lista y encontrar una coincidencia
        for(Producto producto : productos){
            if(producto.getIdProducto()==id){
                productoAeliminar = producto;
                break;//Salgo del ciclo
            }
        }
        
        if(productoAeliminar!=null){
            productos.remove(productoAeliminar);
            System.out.println("El producto" + productoAeliminar + "fue eliminado correctamente");
        }else{
            System.out.println("El producto" + productoAeliminar + "no existe");
        }
    }


}
