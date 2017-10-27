package test;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello world");
Scanner input = new Scanner(System.in);
char reply;
int two = 43689;
System.out.print("say hi: ");
reply = input.findWithinHorizon(".",0).charAt(0);

System.out.println(reply);
System.out.println(two * 234);
	}

}
