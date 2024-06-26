//este esjersicio hay que interiorizarlo por que no es mío
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InventarioTienda {

    public static class Producto {
        String nombre;
        int cantidad;

        Producto(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }
    }

    private ArrayList<Producto> inventario;

   
    public InventarioTienda() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int cantidad) {
        for (Producto p : inventario) {
            if (p.nombre.equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "El producto ya existe. Use la opción de actualizar cantidad.");
                return;
            }
        }
        inventario.add(new Producto(nombre, cantidad));
        JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
    }

    public void actualizarCantidadProducto(String nombre, int cantidad) {
        for (Producto p : inventario) {
            if (p.nombre.equalsIgnoreCase(nombre)) {
                p.cantidad = cantidad;
                JOptionPane.showMessageDialog(null, "Cantidad actualizada correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto no existe en el inventario.");
    }

    public void eliminarProducto(String nombre) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).nombre.equalsIgnoreCase(nombre)) {
                inventario.remove(i);
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto no existe en el inventario.");
    }

    public static void main(String[] args) {
        InventarioTienda tienda = new InventarioTienda();

      tienda.agregarProducto("Manzanas", 50);
        tienda.actualizarCantidadProducto("Manzanas", 75);
        tienda.eliminarProducto("Manzanas");
        
    }
} 