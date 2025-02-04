import javax.sql.rowset.spi.SyncResolver;

public class arrays {
    public static void main(String args[]){

         int[]marks ={45, 50, 67, 98, 100} ;
       // System.out.println(marks[3]);
       // System.out.println(marks.length);    // in case of length it starts from 1 index

        //float[]marks = { 101.0f, 45.6f, 83.f};
       // System.out.println(marks[2]);

       String[]names = {"rohan", "jay", "prerna","jash"};
      // System.out.println(names[0]);

      for(String element : names){
        System.out.println(element);
      }

 // displayong  an array using a for loop

 System.out.println("marks in incresing order :");
       for(int i = 0; i < marks.length; i++ ){
        System.out.println(marks[i]);
       }
       
       System.out.println("marks in reverse order :");
       for( int i = marks.length -1 ; i>=0; i--){
        System.out.println(marks[i]);
       }

       for( int element : marks){
           System.out.println(element);     //print all the elements
       }





    }
}
