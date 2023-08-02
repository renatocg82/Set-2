package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class AppSet_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Set<Product> prodSet = new HashSet<>();

		prodSet.add(new Product("TelevisionTop", 1500.00));
		prodSet.add(new Product("TV", 900.00));
		prodSet.add(new Product("Notebook", 1200.00));
		prodSet.add(new Product("Tablet", 400.0));

		Product prod = new Product("Notebook", 1200.00);

		System.out.println(prodSet.contains(prod));
		
		/* Se forem removidos os métodos hashCode e equals da classe Product,
		 * o retorno será false, não true como agora, pois compararíamos a instância no heap
		 * e não o conteúdo da classe.
		 */
		
		Set<Product> prodSet2 = new TreeSet<>();

		prodSet2.add(new Product("TelevisionTop", 1500.00));
		prodSet2.add(new Product("TV", 900.00));
		prodSet2.add(new Product("Notebook", 1200.00));
		prodSet2.add(new Product("Tablet", 400.0));

		for (Product p : prodSet2) {
			System.out.println(p);
		}
		
		/* Ao se instanciar um TreeSet, faz-se necessário que a classe do
		 * Set (conjunto) seja uma implementação de Comparable, caso contrário
		 * o TreeSet não funcionará (lembre-se que ele ordena por CompareTo); 
		 */
		
		
		
		
	}

}
