import java.util.Scanner;
public class practising {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println(" total marks is 300 ");
        System.out.println(" total marks of each subject is 100");

     System.out.println("enter maths marks");
        int maths = sc.nextInt();

        System.out.println("enter physics marks");
        int physics = sc.nextInt();

        System.out.println("enter chemistry marks");
        int chemistry = sc.nextInt();

        float percentage =( ( maths + physics + chemistry )/ 300.0f) * 100;

        if(percentage >=50 && maths> 30  && physics > 30 && chemistry > 30)
        { System.out.println("you are passed");}
        else{System.out.println("you are not passed");}



        

    }
}
