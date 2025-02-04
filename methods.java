import java.util.Scanner;
public class methods {
    /*public static int calculatesum(int a, int b){
        int sum = a +b;
        return sum;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b  = sc.nextInt();
    int sum = calculatesum(a, b);
    System.out.println("sum of 2 numbers is " + sum);
    } */

// print name by takin input through user

/*public static void printmyname(String name){
    System.out.println(name);
    return;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    printmyname(name); //call kiya function ko
}*/

// make a function to multiply two numbers and return the product

/* public static int calculateproduct(int a, int b){
    int product = a*b;
    return product;

}
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int product = calculateproduct(a, b);
    System.out.println("the product of two numbers is" + product);
}  */

// make a function to find a factorial of any number

public static int factorialofnumber(int n){
    int factorial = 1;

    for(int i =n; i >=1; i --){
        factorial *= i;
    }

    System.out.println(factorial);
     return factorial;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    factorialofnumber(n); //call kiya

}
}
   
    