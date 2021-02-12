package P1;

public class Demo {
	{
		System.out.println("IIB");
	}
static {
	System.out.println("Static block-S");
}
static {
	System.out.println("Static block-Z");
}
	public static void main(String[] args) {
		System.out.println("Main Start");
		Demo d=new Demo();
		//Demo d1=new Demo();
		//Demo d2=new Demo();
		//Demo d3=new Demo();
		System.out.println("Main End");
	}
	static{
System.out.println("Static block-B");
	}

}
