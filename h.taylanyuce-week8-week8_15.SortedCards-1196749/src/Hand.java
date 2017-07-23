
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cc ;
    
    
    public Hand() {
        this.cc = new ArrayList<Card>();
    }
 
    public void add(Card card)
    {
        this.cc.add(card);
    
    }
    public void print()
    {
        int len = cc.size();
        String str;
        for(int i = 0; i < len ; i++)
        {
            str = cc.get(i).toString();
            System.out.println(str);
        }
        
    }
    public void sort()
    {
       Collections.sort(cc);
        
          
    }
     public void sortAgainstSuit() {
         SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
         Collections.sort(this.cc, suitSorter );
     }

    @Override
    public int compareTo(Hand t) {

        int len1 = 0;
        int len2 = 0;
        for(Card c:this.cc)
        {
            len1 += c.getValue();
        }
        for(Card c:t.cc)
        {
            len2 += c.getValue();
        }
        return len1-len2;
    }
}
