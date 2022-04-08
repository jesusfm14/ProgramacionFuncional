package pruebaColecciones;

import java.math.BigDecimal;
import java.security.PublicKey;
import java.util.List;
import java.util.stream.Collectors;

import pruebaColecciones.Enum.Tax;
import pruebaColecciones.Pojo.Product;

public class App {

	public static BigDecimal ivaCalculado = new BigDecimal(0);
	
	public static BigDecimal total = new BigDecimal(0);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			List<Product> shoppingCart = List.of(
			new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
			new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
			new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
			new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
			new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
			new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
			
			shoppingCart.stream().forEach(product ->{
                ivaCalculado = product.getPrecio().multiply(product.getTax().getPrecio());
                total= total.add(product.getPrecio().add(ivaCalculado));
			});
			System.out.println("Coste total de la compra con impuesto: "+total);

			List<Product> productosEmpiezanPorC = shoppingCart.stream()
					.filter(nombre -> nombre.getNombre().startsWith("C"))
					.collect(Collectors.toList());
			
			System.out.println("\nProductos que empiezan por 'C':");
			for (Product product : productosEmpiezanPorC) {
				System.out.println(product.getNombre());
			}
			
	}


}
