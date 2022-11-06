import java.util.Scanner;
public class Main {
	 //  print the fibonacci series using function
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
  
    // Driver Code
    public static void
    main(String args[])
    {
        // Given Number N
    	Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz:");
        int number = input.nextInt();
        // Print selected numbers
        for (int i = 0; i < number; i++) {
  
            System.out.print(fib(i) + " ");
        }
	 } 
}
