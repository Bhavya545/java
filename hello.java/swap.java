import java.util.Scanner;

public class swap {
     public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt(), b = sc.nextInt();
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        System.out.println("After swapping: a = " + a + ", b = " + b);
	        sc.close();
	    }
	}

