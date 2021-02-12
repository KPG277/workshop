package P1;
import java.util.Scanner;

public class Vehicle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name : ");
	String name=sc.nextLine();
	System.out.println("Your current Age is : ");
	int age=sc.nextInt();
    System.out.println(name+" before five years your age is : "+(age-5));
    System.out.println(name+" after five years your age is : "+(age+5));
}
}



