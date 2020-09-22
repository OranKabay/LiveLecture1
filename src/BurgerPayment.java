import java.util.Scanner;

public class BurgerPayment {
    public static void main(String[] args) throws Exception {
        System.out.println("How many burgers would you like?");
        
        double value = 101.0/4.0; //if double remember decimal places for full answer
        System.out.println(value);//all integers can be doubles, not the reverse

        Scanner reader = new Scanner(System.in);
        int noOfBurgers = reader.nextInt();
        
        System.out.println("How many fries would you like?");
        int noOfChips = reader.nextInt();

        double priceOfBurgers = 4.5;  //In British Pounds
        double priceOfChips = 1.6;
        
        int calOfBurger = 2000;
        int calOfChips = 500;

        System.out.println("The number of calories of burgers is " + calOfBurger*noOfBurgers + ".\n");
        System.out.println("The price of the burgers is " + priceOfBurgers*noOfBurgers + ".\n");
        System.out.println("The number of calories of chips is " + calOfChips*noOfChips + ".\n");
        System.out.println("The price of the chips is " + priceOfChips*noOfChips + ".\n");
    }
}
