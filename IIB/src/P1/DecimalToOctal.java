package P1;
import java.util.Scanner;
public class DecimalToOctal {
	static String decToHexa(int n){
	String hx="";
	do{
	int r=n%16;
	if(r<10)
	hx=r+hx;
	else{
	switch(hx)
	{
	case "10": hx='A'+hx;
	break;
	case "11": hx='B'+hx;
	break;
	case "12": hx='C'+hx;
	break;
	case "13": hx='D'+hx;
	break;
	case "14": hx='E'+hx;
	break;
	case "15": hx='F'+hx;
	break;
	}
	n=n/16;
	}
	}while(n!=0);
	return hx;
	}
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	int i=sc.nextInt();
	String s=decToHexa(i);
	System.out.println("Octal equalent is : "+s);
	}
	}

