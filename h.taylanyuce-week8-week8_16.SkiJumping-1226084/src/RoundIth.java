
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
public class RoundIth {

    private List<Players> playersProfile;

    public RoundIth(List players) {
        this.playersProfile = players;

    }

    public void printNamesPoints() {
        int i = 0;

        for (Players player : this.playersProfile) {
            player.oneRoundPoints();
        }
        Collections.sort(playersProfile);
        for (Players name : this.playersProfile) {
            i++;

            System.out.println("  " + i + ". " + name.getName() + " (" + name.getPoints().get(name.getPoints().size() - 2) + " points)");

        }

    }

    public void printLengthVotes() {

        for (Players name : this.playersProfile) {

            System.out.println("  " + name.getName());
            System.out.println("    length: " + name.getLength().get(name.getLength().size() - 1));
            System.out.print("    judge votes: ");
            System.out.println(Arrays.toString(name.getVotes()));;
        }
    }

    public List getProfile() {
        return this.playersProfile;
    }

    public void sortRound() {
        for (Players player : this.playersProfile) {
            player.xxx++;
        }
    }

}