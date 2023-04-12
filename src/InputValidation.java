import java.util.Scanner;

public class InputValidation {
    private boolean running;
    public void inputValidate(Scanner sc){
        System.out.println("You have entered a wrong value\nWould you like to try again\nPress 1 for try again");
        String y = sc.next();
        if(y.equals("1")) {
            running = true;
        }
        else {
            running = false;
        }
    }
    public boolean isRunning(){
        return running;
    }
}
