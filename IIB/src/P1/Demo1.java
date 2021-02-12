package P1;

public class Demo1 {
	{
		System.out.println("IIB--I");
	}
	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println("Main Start...");
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo1 d3=new Demo1();
		System.out.println("Main End...");

	}

}
