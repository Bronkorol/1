import java.util.Scanner;

class crapculator {
public static void main (String[] args){
	Scanner dracula = new Scanner(System.in);
	double num1, num2, raspuns;
	System.out.println("scrie primul numar: ");
	num1 = dracula.nextDouble();
	System.out.println("scrie al 2-lea numar: ");
	num2 = dracula.nextDouble();
	raspuns = num1 + num2;
	System.out.println(raspuns);
	
	dracula.close();
	}
}

