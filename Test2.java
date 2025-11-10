/* 
Write a Java program to print the following patterns:

11111                       1   
22222                       21  
33333                       321 
44444                       4321
55555                       54321


for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

*/


public class Test2
{
    public static void main(String []args)
    {
        
        for (int i = 1; i <= 4; i++)
        {
            for (int j = i; j >= 0; j--)
            {
                    System.out.print(j);
            }
            System.out.println();
        }
        
    }
}



