import java.util.Scanner;
public class methodsque {
// avg of three numbers

/*public static float averageofnumber(float a , float b , float c){
    float average = (a + b +c)/3.0f;
    return average;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c= sc.nextFloat();
    float average = averageofnumber(a, b, c);
     
    System.out.println("average of three numbers is "+ average);
} */

//sum of odd numbers from 1 to n

/* public static int printoddnumberssum(int n){
    
    int sum =0;

    for(int i = 0; i<= n;i++ ){
        if( i % 2 != 0){
            sum = sum + i;
        }
    }
    System.out.println("the sum of all odd numbers from 1 to " + n +  " is " + sum);
    return sum;
}
 public static void main (String args[]){
    printoddnumberssum(8);   
 }  */

 
//Write a function which takes in 2 numbers and returns the greater of those two.

/* public static int printgretestnumber(int a, int b){
    
    if(a>b){
        return a;
}
else {
    return b ;
}

}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

   System.out.println("the greatest number is " + printgretestnumber(a, b));
}  */

//Write a function that takes in the radius as input and returns the circumference of a circle.

/* public static double printcircumference(double radius){
     double circumference = (2 * 3.14)* radius;
     return circumference;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextInt();

    System.out.println("the circumference of circle is " + printcircumference(radius));
}    */

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

/* public static boolean printeligible(int age){
    if(age >=18){
        return true;
    }
    else {
        return false;
    }
}
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int age = sc.nextInt();

    System.out.println(printeligible(age));
}    */

//



 /*static void  printmultiplication(int n){
    for(int i = 1; i<=10; i ++){
        System.out.format("%d X %d = %d\n ", n,i,n*i);
    }
    
}

public static void main(String args[]){
  printmultiplication(8);
}    */


//print a function of patterns

/*static void printpattern(int n ){
    for(int i = 0; i <n; i++){
        for(int j = 0; j< i+1; j ++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String args[]){
    printpattern(6);
} */

//print multiplication table of any number

/*public static void printtable(int n) {
    for(int i=1; i <=10;i ++){
   System.out.printf("%d X %d = %d\n", n, i , n*i);
    }
}
public static void main(String args[]){
    printtable(8);
}  */

//print pattern using methods

/*public static void printpattern(int n) {
    for(int i = n; i > 0;i --){
        for(int j = 0; j <i ; j++){
    System.out.print("*");
        }
        System.out.println("\n");
    }
}
 public static void main(String args[]) {
    printpattern(7);
 }  
    */

//print average of all arguments 
/* public static float calculateaverage(float a, float b, float c, Float d) {
    float sum = a + b + c + d;
    float average = sum/4.0f;
    return average;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter value of a : \n");
    float a =sc.nextFloat();
    System.out.println("enter value of b : \n");
    float b =sc.nextFloat();
    System.out.println("enter value of c : \n");

    float c =sc.nextFloat();
    System.out.println("enter value of d : \n");
    float d =sc.nextFloat();
    float average = calculateaverage(a, b, c, d);
    System.out.println("the average of these numbers is " + average );

}   */

//print conversion of  celsius into fahrenheit
    public static float calculate(float celsius) {
    float fahrenheite = (celsius*9.0f)/5.0f + 32.0f;
    return fahrenheite;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        float fahrenheite = calculate(celsius);
        System.out.println("the conversion of celsius into fahrenheite is: "+ fahrenheite);

    }

}





