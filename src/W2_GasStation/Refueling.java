package W2_GasStation;

import java.util.Scanner;
//insert problem
public class Refueling {
    public static void main(String[] args) {
        //insert methods
        //cast to two decimals
        double tank = 0;
        double pricetag = 5.5;
        double cost = 0;
        double paid = 0;
        double remained;
        String choice;

        System.out.println("Welcome to the gas station!");
        System.out.println("Enter c for continue or f to finish:");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.next(); //add check
        while (choice.equals("c")){
            System.out.println("Enter amount of petrol in litre:");
            tank += scanner.nextDouble();//check
            cost = tank * pricetag;
            System.out.println("Said and done that. Enter payment:");
            paid += scanner.nextDouble();//check
            System.out.println("Enter c for continue or f to finish:");
            choice = scanner.next();
        }
        if (paid == cost){
            System.out.println("Thanks, hope you come back soon!");
        } else if (paid>cost){
            System.out.println("Thanks, here's the rest, "+(paid-cost)+", hope to see you soon!");
        } else if (paid<cost){
            remained = cost-paid;
            while (remained>0){
                System.out.println(remained+" more to pay:");
                remained -= scanner.nextDouble();//check
                if (remained==0){
                    System.out.println("Thank you, come back soon!");
                } else if (remained<0){
                    System.out.println("Thanks, here's the rest, "+(-remained)+", come back soon!");
                }
            }
        }
    }
}
