package P1;

public class Person {
String name="Spiders";
void washHands() {
	System.out.println("Wash your hands....");
}
void serveFood() {
	System.out.println("Serving Food...");
}
void eat() {
	this.washHands();
	this.serveFood();
	System.out.println("Eating food");
	this.washHands();
}
	public static void main(String[] args) {
Person p=new Person();
p.eat();
	}

}
