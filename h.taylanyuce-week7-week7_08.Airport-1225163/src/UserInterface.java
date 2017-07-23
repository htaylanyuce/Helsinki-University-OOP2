
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cham
 */
public class UserInterface {

    private Scanner reader;
    private Panels airport;
   

    public UserInterface(Scanner sc) {
        this.reader = sc;
        this.airport = new Panels(sc);
        
    }

    public void startAirplanePanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {

            System.out.println("Choose operation:\n" + "[1] Add airplane\n" + "[2] Add flight\n" + "[x] Exit\n" + "> ");

            String reader = this.reader.nextLine();

            if (reader.equals("1")) {
                this.airport.addPlane();
            
            } else if (reader.equals("2")) {
                this.airport.addFlight();
            
            } else if (reader.toLowerCase().trim().equals("x")) {
                break;
            }
        }
    }

    public void startFlightServicePanel() {
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {

            System.out.println("Choose operation:\n" + "[1] Print planes\n" + "[2] Print flights\n" + "[3] Print plane info\n" + "[x] Quit\n" + "> ");

            String reader = this.reader.nextLine();

            if (reader.equals("1")) {
                this.airport.planeList();
            
            } else if (reader.equals("2")) {
                this.airport.flightList();
            
            } else if (reader.equals("3")) {
                this.airport.planeInfo();
            
            } else if (reader.toLowerCase().trim().equals("x")) {
                break;
            }
        }
    }
    
    
}