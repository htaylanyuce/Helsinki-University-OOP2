
import java.util.ArrayList;
import java.util.HashMap;
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
/*
 HashMap 
 ArrayList of the HashMap
 */
public class Panels {

    private HashMap<String, Integer> planeList;
    private ArrayList<String> flightInfo;
    private Scanner scanner;

    public Panels(Scanner sc) {
        this.planeList = new HashMap<String, Integer>();
        this.flightInfo = new ArrayList<String>();
        this.scanner = sc;
    }

    public void addPlane() {
        System.out.println("Give plane ID: ");
        String ID = this.scanner.nextLine();

        System.out.println("Give plane capacity: ");
        int capacity = Integer.parseInt(this.scanner.nextLine());

        this.planeList.put(ID, capacity);
    }

    public void addFlight() {
        System.out.println("Give plane ID: ");
        String putID = this.scanner.nextLine();

        System.out.println("Give departure airport code: ");
        String depAirport = this.scanner.nextLine();

        System.out.println("Give destination airport code: ");
        String desAirport = this.scanner.nextLine();

        this.flightInfo.add(putID + " (" + this.planeList.get(putID) + " ppl) " + "(" + depAirport + "-" + desAirport + ")");

    }

    public void planeList() {
        ArrayList<String> planeList = new ArrayList<String>();
        for (String name : this.planeList.keySet()) {
            planeList.add(name + " (" + this.planeList.get(name) + " ppl)");
        }

        for (String list : planeList) {
            System.out.println(list);
        }
        System.out.println("");
    }

    public void flightList() {
        for (String list : this.flightInfo) {
            System.out.println(list);
        }
        System.out.println("");
    }

    public void planeInfo() {
        System.out.println("Give plane ID: ");
        String ID = this.scanner.nextLine();

        if (this.planeList.containsKey(ID)) {
            System.out.println(ID + " (" + this.planeList.get(ID) + " ppl)");
        }
        System.out.println("");
    }

}