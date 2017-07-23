
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
public class Players implements Comparable<Players> {

    private String name;
    private ArrayList<Integer> lengthList;
    private List<Integer> points;
    int[] vote;
    int[] sortedVotes;
    private Random val;
    private int votePoints;
    int xxx = 0;

    public Players(String name) {
        this.name = name;
        this.lengthList = new ArrayList<Integer>();
        this.points = new ArrayList<Integer>();
        this.vote = new int[5];
        this.sortedVotes = new int[5];
        this.votePoints = 0;
        this.points.add(0);
        this.val = new Random();
    }

    public String getName() {
        return this.name;
    }

    public List<Integer> getPoints() {

        return this.points;
    }

    public List<Integer> getLength() {

        return this.lengthList;
    }

    public void Length() {
        int len = val.nextInt(60) + 60;
        this.lengthList.add(len);
    }

    public void votes() {
        for (int i = 0; i < 5; i++) {
            this.vote[i] = val.nextInt(10) + 10;
        }

    }

    public int[] getVotes() {
        return this.vote;
    }

    public void sortIt() {
        int a;
        for (int i = 0; i < 5; i++) {
            a = this.vote[i];
            this.sortedVotes[i] = a;
        }

        Arrays.sort(this.sortedVotes);

    }

    public void oneRoundPoints() {
        this.votes();
        this.Length();
        this.sortIt();
        this.votePoints += this.lengthList.get(this.lengthList.size() - 1);
        for (int i = 1; i < this.sortedVotes.length - 1; i++) {
            this.votePoints += this.sortedVotes[i];
        }
        this.points.add(this.votePoints);
    }

    @Override
    public int compareTo(Players comparePlayers) {
        int a = 0;
        int b = 0;
        if (this.xxx > 0) {
            a = this.getPoints().get(this.getPoints().size() - 1);
            b = comparePlayers.getPoints().get(this.getPoints().size() - 1);
        } else {
            a = this.getPoints().get(this.getPoints().size() - 2);
            b = comparePlayers.getPoints().get(this.getPoints().size() - 2);
        }
        return a - b;
    }

}