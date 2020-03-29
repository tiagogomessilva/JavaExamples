package Applications;

import java.util.Locale;
import java.util.Scanner;

import Applications.Products;

public class Store {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Products products = new Products();
	System.out.println("Enter product data: ");
	System.out.print("Product name: ");
	products.name = sc.nextLine();
	System.out.print("Price: ");
	products.price = sc.nextDouble();
 System.out.print("Quantity in stock: ");
 products.quantity = sc.nextInt();
 
 System.out.println();
 System.out.println("Enter the number of products to be added in stock: ");
 int quantity = sc.nextInt();
 products.addProducts(quantity);
 
 System.out.println();
 System.out.print("Update data: " + products);
 
 System.out.println();
 System.out.print("Enter the number of products to be removed from stock: ");
 quantity = sc.nextInt();
 products.removeProducts(quantity);
 
 System.out.println();
 System.out.println("Update data: " + products);
	
}
}
