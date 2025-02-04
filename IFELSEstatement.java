import java.security.AlgorithmParameterGeneratorSpi;

public class IFELSEstatement {
    public static void main (String args []){

        int age  = 20;

        if(age  > 19){
            System.out.println("you are elgible");
        }
        else{
            System.out.println("you are not elgible");  }
        
            int x  = 18;
            if(x!=18){
                System.out.println(" true");
            }
             else{
                System.out.println("false ");
             }
        

             int y = 6;
             if(y==8){
                System.out.println("not allowed");
                             }

             else{
                System.out.println("allowed");
             }  
             
             int z = 100;
             if(z>=90){
                System.out.println("true");
             }

             else{
                System.out.println("false");
             }

             int a = 10;
             if(a == 10){
               System.out.println("true");
             }
             else{System.out.println("false");}

             int b = 27;
             if(b!= 7){System.out.println("correct");}
             else{System.out.println("incorrect");}
    }

}