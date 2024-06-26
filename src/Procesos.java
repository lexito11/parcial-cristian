import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Procesos {
	ArrayList<String> listProductos;
	ArrayList<Integer> listCantiProd;

	public Procesos() {
		listProductos = new ArrayList<String>();
		listCantiProd = new ArrayList<Integer>();
		iniciar();
	}

	
	private void iniciar() {
		String menu = "MENÚ INVENTARIO \n\n";
		menu +="1. Agregar un producto \n";
		menu +="2. Buscar producto por nombre \n";
		menu +="3. Actualizarla cantidad del producto \n";
		menu +="4. Eliminar Producto \n";
		menu +="5. Mostrar inventario  \n";
		menu +="6. Salir \6";
		int opera = 0;
		
		do {
			opera = Integer.parseInt(JOptionPane.showInputDialog(menu));
			presentarMenu(opera);
		}while (opera !=6);
				
	}


	private void presentarMenu(int opera) {
		switch (opera) {
		case 1: agregarElementos(); break;
		case 2: consulPorNombre(); break;
		case 3: actualizarElemen(); break;
		case 4: eliminarElementos(); break;
		case 5: consultarElementos(); break;
		case 6: System.out.println("Chao"); break;
		default:
			break;
		}
		
	}
	
	public void agregarElementos() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre de su producto");
		listProductos.add(nombre);
		
		Integer cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));
		listCantiProd.add(cantidad);
		System.out.println("El producto se agregó correctamente,\n" + cantidad + nombre);
		
	}
	
	
	public void consulPorNombre() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto que desea buascar");
		boolean seEncontrara = false;
		for(int i = 0; i < listProductos.size(); i++) {
			if(listProductos.get(i).equalsIgnoreCase(nombre)) {
				seEncontrara = true;
				listProductos.get(i);
				listCantiProd.get(i);
				System.out.println("Nombre del producto: " + listProductos);
				System.out.println("Cantidad del producto: " + listCantiProd);
			}else {
				System.out.println("El preducto " + nombre + "no se encontró");
			}
		}
	}
	
	
	public void actualizarElemen() {
		String producActualizar = JOptionPane.showInputDialog("Ingrese el nombre del produsto que va a actualizar");
		
		for(int i = 0; i < listProductos.size(); i++) {
			if(listProductos.get(i).equalsIgnoreCase(producActualizar)) {
				
				Integer cantiNueva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad del producto"));
				listCantiProd.set(i, cantiNueva);
				System.out.println("Se actualizo la cantidad del producto");
				
			}else {
				System.out.println("El producto no existe");
			}
			
		}
	}
	
	
	public void eliminarElementos () {
		String elimProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto a eliminar");
		
		for (int i = 0; i < listProductos.size(); i++) {
			if (listProductos.get(i).equalsIgnoreCase(elimProducto)) {
				
				listProductos.remove(i);
				listCantiProd.remove(i);
				 System.out.println("Seeliminó el producto " + elimProducto + " correctamente");
			}else {
				System.out.println("No se eliminó ningun producto:\n " + "El producto " + elimProducto + " no esta en el inventario");
			}
		}
		
	}
	
	
	public void consultarElementos() {
		for(int i = 0; i < listProductos.size(); i++) {
			if(!listProductos.isEmpty()) {
				listProductos.get(i);
				listCantiProd.get(i);
				System.out.println("Nombre de los productos: " + listProductos + "\n" + "Cantidad de los productos: " + listCantiProd);
			}else {
				System.out.println("El inventario esta vacío");
			}
			
		}
			
	}


	

}
