public class arraysque {
    public static void main(String args[]){

      /* float[] marks = {20.1f, 11.4f, 89.9f, 45.3f, 60.5f};
        float sum = 0;
         
        for( float element : marks){
            sum = sum + element;
        }
        System.out.println("the average of marks is " + sum/marks.length); */

// print sum of two matrices of size 2X3

/*int[][] matrix1 = {{1,4, 5} ,{ 6,4,3}};
int[][] matrix2 = {{0,4,3}, {1,4,6}};
int[][] result = {{0,0,0},{0,0,0,}};

for( int i = 0; i<matrix1.length; i++){
    for( int j = 0;j <matrix1[i].length; j++){
        System.out.format("setting value  for  i=%d and j= %d\n ", i , j);
        result[i][j] = matrix1[i][j] + matrix2[i][j];
    }
}
        for( int i = 0; i<matrix1.length; i++){
            for( int j = 0;j <matrix1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];

            }

System.out.println("");





    }
    
   
    
   */


//print array in reverse direction

/*int[] numbers = { 5,7,3,13,90,};

for(int i = numbers.length - 1 ; i >=0; i-- ){
   System.out.print(numbers[i] + ", ");
}
*/

//print max array

/*int [] array = {455, 0, 4590, 333333};
int max = 0;
for(int element : array){
if(element > max){
    max = element;
}
}
System.out.println("the maximum value of array is " + max);
*/

//print minumum value  of array
int[] array = {65, 45,22, -899};
int min = 0;
for(int element  : array){
    if(element < min){
        min = element;
    }
}
System.out.println("the minimum value of array is " + min);
}


    

}
