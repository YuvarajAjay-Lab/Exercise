public class Test8 {
    
    public static int returnOne()
    {
        System.out.println("This method return type is 1");
        return 1;
    }
    public static int returnZero()
    {
        System.out.println("This method return type is 0");
        return 0;
    }

    public static void main(String[] args)
    {
        int a = returnZero();

        switch(a)
        {
            case 0:
                System.out.println("Return value is 0");
                break;
            case 1:
                System.out.println("Return value is 1");
                break;            
        }
    }
}
