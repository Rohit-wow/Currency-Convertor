import java.util.Scanner;

public class Display {
    public void displayResultInr(int currency, double result, double amount){
        switch (currency){
            case 1:
                System.out.println(amount + " rupees = "+result+" dollars");
                break;
            case 2:
                System.out.println(amount + " rupees = "+result+" euros");
                break;
            case 3:
                System.out.println(amount + " rupees = "+result+" yens");
                break;
            default:
                System.out.println("You have entered a wrong value");
        }
    }
    public void displayResultUsd(int currency, double result, double amount){
        switch (currency){
            case 1:
                System.out.println(amount + " dollars = "+result+" rupees");
                break;
            case 2:
                System.out.println(amount + " dollars = "+result+" euros");
                break;
            case 3:
                System.out.println(amount + " dollars = "+result+" yens");
                break;
            default:
                System.out.println("You have entered a wrong value");
        }
    }
    public void exitMessage(){
        System.out.println("Exiting program...");
        System.out.println("Have a good day");
    }
}
