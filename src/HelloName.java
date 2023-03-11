import java.util.Scanner;
public class HelloName {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "";

        while(userName.isEmpty() || !userName.matches("[a-zA-Z ]+")){
            System.out.println("What's your name?:");
            userName = input.nextLine();



            if(userName.isEmpty()) {
                System.out.println("Please enter a valid name.");

            } else if(!userName.matches("[a-zA-Z ]+")){
                System.out.println("Not recognised. Please enter your name again.");
                userName = "";
            }
        }

        System.out.println("Hello " + userName + " !");


    }

    


}
