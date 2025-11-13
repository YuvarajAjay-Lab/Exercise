/* Write a program to print the below pattern:

111111111
 1111111
  11111
   111
    1

*/

public class Test6 
{
    
    public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) 
        {
            for (int j = 0; j < 5 - i; j++)
                System.out.print(".");

            for (int k = 1; k<=2*i-1; k++) 
            {
                System.out.print(1);
            }
            System.out.println();
        }

    }
}
