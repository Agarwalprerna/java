public class recursion {
    
//print number from 7 to 1
       /*  if(n==0){
            return;
        }
        System.out.println(n);
        printnumber(n-1);
    }

    public static void main(String args[]){
        int n = 7; //intialization
        printnumber(7);
    }   */
// print number from 1 to 7

/*if(n ==7){
    return;
}
System.out.println(n);
printnumber(n+1);
}
 
public static void main(String args[]){
    int n = 1;
    printnumber(1);
}  */

//print sum of first n natural numbers

/*if(i==n){
    sum += i;
    System.out.println(sum);
    return;
}
sum += i;
printsum(i+1, n, sum);
}

public static void main(String args[]){
    printsum(0, 6, 0);
}  */


//public static int printfactorial(int n){
// print factorial of number 

/*if(n==0){
    return 1; }
    else{
        return n* printfactorial(n-1);
    }
}
public static void main(String args[]) {
    int n = 4;
    System.out.println("the factorial of a " + n + " is " + printfactorial(n));
} */

//print fibonnaci series till nth term

/*public static void printfibonnaci(int a, int b, int n){
if(n==0){
    return;
}
int c = a+b;
System.out.println(c);
printfibonnaci(b, c, n-1);
}

public static void main (String args[]){
    int a=0;
    int b=1;
    int  n= 8;
    System.out.println(a);
    System.out.println(b);
    printfibonnaci(a, b, n-2);
}  */

/*public static int printxpowern(int x, int n){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }

    int xpowernm1 = printxpowern(x, n-1);
    int xpowern = x * xpowernm1;
    return xpowern;
}
public  static void main(String args[]){
    
    int x = 2;
    int n = 4;
    System.out.println(printxpowern(x, n));
}  */


    
}







