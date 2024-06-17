package Assignment;

import java.util.Scanner;

public class Main

{

public static void main(String[] args)

{

int[] arrray = new int[5]; 

try (Scanner s = new Scanner(System.in)) {
	System.out.print("Enter 5 numbers:");

	for(int i=0;i<5;i++)  

	arrray[i] = s.nextInt();
} 

System.out.println("Product of 5 numbers "+multiply(arrray,4));
}

public static int multiply(int x[], int count)  

{

if(count<0)

return 1; 

return x[count] * multiply(x, --count); 

}
}


