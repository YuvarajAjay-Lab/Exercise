/* 
   
    Prove me that && and || operators executes only one of the condition 
    if the result is desired where as & and | executes both

 */

public class Test7 
{
    public static boolean returnTrue()
    {
        System.out.println("A method return type is true");
        return true;
    }
    public static boolean returnFalse()
    {
        System.out.println("B method return type is false");
        return false;
    }
    // public static boolean c()
    // {
    //     System.out.println("C method return type is true");
    //     return true;
    // }

    public static void main(String[] args)
    {
        
        if (returnFalse() && returnTrue())
        {
            System.out.println("Check both conditions");
        }
        
        System.out.println();

        if (returnFalse() & returnTrue())
        {
            System.out.println("Check both conditions");
        }

    }
}
