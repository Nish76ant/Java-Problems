/*
Arrays are used to store multiple values in a single variable, 
instead of declaring separate variables for each value.
datatype[] arrayName;
arrayName = new dataType[n];
or
datatype[] arraYName = new dataType[n];
*/
//Arrays in Java

public class ArraysinJava
{    public static void main(String [] args)
    {   //Define the Array
        //int [] marks = new int[5];
       // int [] marks;
       // marks = new int[10];
       //int[] rollNos,classes = new int[5];
       //int rollNos[],classes = new int [5] 
       //int rollNos[],classes[] = new int[5]
       //int marks[] = new int [5];
       //System.out.println(marks[0]); //by default we gey 0 value

       int[] age = {2,5,1,34,12};
       double [] marks = {1.0,3.14,2.9,7.9,9.6};

    //Iterate the values one by one
       //    System.out.println(marks[0]);       
    //    System.out.println(marks[1]);
    //    System.out.println(marks[2]);
    //    System.out.println(marks[3]);
    //    System.out.println(marks[4]);

    //    System.out.println(age[0]);
    //    System.out.println(age[1]);
    //    System.out.println(age[2]);
    //    System.out.println(age[3]);
    //    System.out.println(age[4]);

    //Iterate the value by for loop
          for(int i = 0;i<age.length;i++)
          {
              System.out.println(age[i]);
          }




       //Update the value of the marks2 index[1]
       //marks[1] = 4.56;
       //System.out.println(marks[1]);
    }
    
}
