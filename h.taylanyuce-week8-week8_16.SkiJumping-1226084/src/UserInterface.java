
import java.util.*;

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

    private FinalResult finalList;
    private Scanner reader;
    private List<Players> playersList;
    private RoundIth roundIth;
    private int counter;

    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.playersList = new ArrayList<Players>();
        this.counter = 0;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.println("  Participant name: ");
            String name = this.reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            this.playersList.add(new Players(name));
            this.roundIth = new RoundIth(this.playersList);
            this.finalList = new FinalResult(this.roundIth.getProfile());
        }
        this.letsJump();
    }

    public void letsJump() {
        System.out.println("The tournament begins!");
        System.out.println("");

        while (true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit:");
            String command = this.reader.nextLine();
            if (command.equals("jump")) {
                counter++;
                System.out.println("");
                System.out.println("Round " + counter);
                System.out.println("");
                System.out.println("Jumping order:");
                this.roundIth.printNamesPoints();
                System.out.println("");
                System.out.println("Results of round " + counter);
                this.roundIth.printLengthVotes();
            } else if (command.equals("quit")) {
                this.roundIth.sortRound();
                break;
            }
       }
        for (Players player : this.playersList) {
            System.out.println(player.xxx);
        }
        System.out.println("");
        this.showResult();
    }

    public void showResult() {
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        this.finalList.printFinal();
    }

}