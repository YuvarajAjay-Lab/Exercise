/*
 
Write a Java program to print the following patterns:

    1
   21
  321
 4321
54321


 */



public class Test3 {
    public static void main(String []args)
    {
       for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= 1; j--)
            {
                if (j <= i)    
                    System.out.print(j);
                else   
                    System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
