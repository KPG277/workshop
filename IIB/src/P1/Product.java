package P1;

public class Product {
 int price=250;
 void printProdDetails() {
	 System.out.println("Product price "+this.price+" "+"RS");
 }
	public static void main(String[] args) {
Product p=new Product();
p.printProdDetails();
	}

}
