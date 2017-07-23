/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.*;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Cham
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        double avg1 = 0;
        double avg2 = 0;
        
        for (Rating rate : this.ratings.get(o1)){
            avg1 += rate.getValue();
        }
        
        for (Rating rate : this.ratings.get(o2)){
            avg2 += rate.getValue();
        }
        avg1 = avg1/this.ratings.get(o1).size();
        
        avg2 = avg2/this.ratings.get(o2).size();
        
        return (int) (avg2 - avg1);
    }

}