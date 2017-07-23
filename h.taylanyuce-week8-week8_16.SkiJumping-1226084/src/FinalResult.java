
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cham
 */
public class FinalResult {

    UserInterface user;
    List<Players> playersProfile;

    public FinalResult(List<Players> list) {
        this.playersProfile = list;
    }

    public void printFinal() {
        int i = 0, j = 0;
        Collections.sort(playersProfile);

        Collections.reverse(playersProfile);
        for (Players player : this.playersProfile) {
            j = 0;
            i++;

            System.out.println(i + "           " + player.getName() + "(" + player.getPoints().get(player.getPoints().size() - 1) + ")");
            System.out.print("            jump lengths: ");
            for (int length : player.getLength()) {
                j++;
                if (j == player.getLength().size()) {
                    System.out.print(length + " m ");
                } else {
                    System.out.print(length + " m, ");
                }
            }
            System.out.println("");

        }
    }

}