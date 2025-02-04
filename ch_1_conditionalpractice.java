import java.util.Scanner;
public class ch_1_conditionalpractice {
    public static void main(String args[]){

       /*  int a = 10;
        if(a>10){System.out.println("i am a little big");}

        else{System.out.println("i am not a big");}*/

       Scanner sc = new Scanner(System.in);
      /*  int a = sc.nextInt();

       if(a> 50){System.out.println("you are an adult");}

       else if(a>25){System.out.println(" you are younge");}

       else{System.out.println("you are not an adult");
}*/

//q3
/*System.out.println("enter your maths marks");
int a = sc.nextInt();

System.out.println("enter your chemistry marks");
int b = sc.nextInt();

System.out.println("enter your physics marks");
int c = sc.nextInt();

float avg = (a + b+c)/ 3.0f;

if(avg>= 40 && a>33 && b>33 && c>33){System.out.println("you are passed");}
else{System.out.println("you are not passed");}

*/
  //Q4   find out day of the week

  /*int day = sc.nextInt();

  switch(day){
    case 1 : 
    System.out.println("monday");
    break;

 case 2 :
 System.out.println("tuesday");
 break;

 case 3 : 
    System.out.println("wednesday");
    break;

    case 4 : 
    System.out.println("thursday");
    break;

    case 5 : 
    System.out.println("friday");
    break;

    case 6 : 
    System.out.println("saturday");
    break;

    case 7:
    System.out.println("sunday");
    break;
        */


//q5
/*  String website= sc.next();
  if(website.endsWith(".org")){
    System.out.println("this an organized website");
  }

  else if(website.endsWith(".com")){
    System.out.println("this is a commercial website");
  }

  else if(website.endsWith(".in")){
    System.out.println("this is an indian website");
  }        */


//q6

 int year = sc.nextInt();
 if (year % 4 == 0){System.out.println("this a leap year");}

else{System.out.println("this is not a leap year");}

    }






}


