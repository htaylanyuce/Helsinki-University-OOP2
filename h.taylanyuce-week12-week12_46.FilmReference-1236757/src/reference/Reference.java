/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;

/**
 *
 * @author Cham
 */
public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {

        int similarityValue = Integer.MIN_VALUE;
        Person similarPerson = null;
        List<Film> films = new ArrayList<Film>();
        List<Film> watchedFilms = new ArrayList<Film>();

        if (this.ratingRegister.reviewers().contains(person)) {
            for (Film film : this.ratingRegister.getPersonalRatings(person).keySet()) {
                watchedFilms.add(film);
            }

            for (Person simPerson : this.ratingRegister.reviewers()) {
                int sum = 0;
                if (simPerson != person) {
                    for (Film film : watchedFilms) {
                        sum += this.ratingRegister.getRating(person, film).getValue() * this.ratingRegister.getRating(simPerson, film).getValue();
                    }
                }
                if (sum > similarityValue) {
                    similarPerson = simPerson;
                    similarityValue = sum;
                }
            }
            Film recomFilm = null;
            int filmComp = 0;
            for (Film film : this.ratingRegister.getPersonalRatings(similarPerson).keySet()){
                int compIt = this.ratingRegister.getRating(similarPerson,film).getValue();
                if (!watchedFilms.contains(film) && compIt > filmComp && compIt > 1){
                    filmComp = compIt;
                    recomFilm = film;
                }
            }
            System.out.println(similarPerson);
            return recomFilm;
            
        } else {
            for (Film film : this.ratingRegister.filmRatings().keySet()) {
                films.add(film);
            }

            Collections.sort(films, new FilmComparator(this.ratingRegister.filmRatings()));
        }
        return films.get(0);
        
    }
}