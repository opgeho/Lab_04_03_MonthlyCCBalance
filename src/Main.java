public class Main
{
    public static void main(String[] args)
    {
        final double INTEREST_RATE = 0.17;

        double initBalance = 5000;
        double interest = 0;

        interest = initBalance * INTEREST_RATE;
        System.out.println("your interest for a balance of " + initBalance + "$ after one month is: " + interest);
        initBalance += interest;
        interest = initBalance * INTEREST_RATE;
        System.out.println("your interest after two months is: " + interest);



    }
}