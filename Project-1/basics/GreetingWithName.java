import java.util.Scanner;

public class GreetingWithName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String match = scan.next();
        if(name.equals(match)){
            System.out.println("Happy Birthday "+name+"!");
        }
        else
        System.out.println("No Greetings Received For This Man");
    }
}
