package KID;

import java.util.Scanner;

class Main {

	public void method1() {
		System.out.println("method 1");
	}

	public int wrong(int input) {
		return input * 2;
	}
}

public class MainClass {
	public static void main(String args[]) {
		Main ex1 = new Main();
		ex1.method1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value");
		int a = scan.nextInt();
		Main ex2 = new Main();
		System.out.println(ex2.wrong(a));
		scan.close();
	}
}