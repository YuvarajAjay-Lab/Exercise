
public class Test9 
{
    public static void main(String[] args) 
    {
        new MarinaMall();
        Parking tic = new Parking();
        tic.twoWheeler(100);
        tic.fourWheeler(200);
    }
}
class MarinaMall
{
    MarinaMall()
    {
        System.out.println("Welcome to Marina Mall :) ");
    }
    
}
class Parking extends MarinaMall
{
    int balance = 0;

    Parking()
    {
        System.out.println("For Two Wheeelers 40 and Four Wheelers 100 ");
    }

    int twoWheeler(int cost)
    {
        if (cost <= 40)
            System.out.println("For Two Wheelers parking charge is 40");
        else if (cost == 40)
                System.out.println("Payment successfull");
        else if (cost > 40)
            balance = cost - 40;
            System.out.println("You're balance amount : "+ balance);
            System.out.println("Payment successfull");
        return balance;
    }

    int fourWheeler(int cost)
    {
        if (cost <= 100)
            System.out.println("For Four Wheelers parking charge is 100");
        else if (cost == 100)
                System.out.println("Payment successfull");
        else if (cost > 100)
            balance = cost - 100;
            System.out.println("You're balance amount : "+ balance); 
            System.out.println("Payment successfull");
        return balance;
    }
}
class FoodCourt extends MarinaMall
{
    void showFood()
    {
        System.out.println("I am eating food");
    }
}

class Shop extends MarinaMall
{
    void typesOfShop()
    {
        System.out.println("Listing shop names");
    }
}

class Cinema extends MarinaMall
{
    void listMovieNames()
    {
        System.out.println("Listing the movies names");
    }
}

