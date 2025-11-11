public class Test4 {
    public static void main(String []args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                if(j <= i)
                    System.out.print("1");    
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
