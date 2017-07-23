
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner sc = new Scanner(System.in);
        UserInterface start = new UserInterface(sc);
        start.startAirplanePanel();
        start.startFlightServicePanel();
        //System.out.println("eddeede");
        
    }
}