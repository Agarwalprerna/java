public class multidimentionalarrays {
    public static void main(String args[]){

        // 1D array
        int[]marks;
        marks= new int[3];
        //accessing array elements
        marks[0] = 46;
        marks[1] = 56;
        marks[2] = 98;
       //displaying array elements
     // System.out.println(marks[1]);
      
      //displaying all the elements
      /*for(int element : marks){
        System.out.println(element);
      }  */

      //displaying array elements in reverse order
     /*  for(int i = marks.length -1; i>=0; i --){
        System.out.println(marks[i]);
      } */


// 2 D array
 //accessing array elements
int[][]flats = new int[2][3];
flats[0][0] = 101;
flats[0][1] = 102;
flats[0][2] = 103;
flats[1][0] = 201;
flats[1][1] = 201;
flats[1][2] = 203;
// displaying array elements
System.out.println(flats.length);

for(int i = 0; i< flats.length; i++){
    for(int j= 0; j <flats[i].length ; j++){
        System.out.print(flats[i][j]);
        System.out.print(" ");
    }
    System.out.println("");
}



    }
}
