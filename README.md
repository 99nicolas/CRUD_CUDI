# CRUD_CUDI

Aplicación de consola en Java que gestiona los productos de una tienda con operaciones CRUD (crear, leer, actualizar, eliminar).

## Estructura

| Archivo | Rol |
|---|---|
| `Main.java` | Menú principal y lectura de opciones del usuario |
| `Tienda.java` | Lógica del CRUD sobre una lista de productos |
| `Producto.java` | Modelo con id, nombre y precio |

## Uso

```bash
javac *.java
java Main
```

Menú:

```
1.- Agregar Producto
2.- Mostrar productos
3.- Actualizar producto
4.- Eliminar producto
5.- Salir de la tienda
```
