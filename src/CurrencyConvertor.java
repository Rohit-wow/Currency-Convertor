import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        InputValidation inputValidation = new InputValidation();
        Display display = new Display();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.println("Enter Your choice of currency which you want to convert : \n For INR - 1 \n For USD - 2 \n For exit - 0");
            int choice = sc.nextInt();
            if(choice == 0){
                running = false;
                display.exitMessage();
            }
            else if(choice == 1){
                System.out.println("Amount in INR : ");
                double amount = sc.nextDouble();
                while(true){
                    System.out.println("Enter in which currency you want to convert : \n 1. USD \n 2. Euro \n 3. Yen");
                    int currency = sc.nextInt();
                    double result = conversion.convertInr(currency,amount);
                    display.displayResultInr(currency,result,amount);
                    if(currency <= 3){
                        break;
                    }
                }


            }
            else if (choice == 2){
                System.out.println("Amount in USD : ");
                double amount = sc.nextDouble();
                while(true){
                    System.out.println("Enter in which currency you want to convert : \n 1. INR \n 2. Euro \n 3. Yen");
                    int currency = sc.nextInt();
                    double result = conversion.convertUsd(currency,amount);
                    display.displayResultUsd(currency,result,amount);
                    if(currency <= 3){
                        break;
                    }
                }
            }
            else {
                inputValidation.inputValidate(sc);
                running = inputValidation.isRunning();
                if (!running){
                    display.exitMessage();
                }
            }

            System.out.println("---------------------------------------------------------------------------");
        }
    }
}
