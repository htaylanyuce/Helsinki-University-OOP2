/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Cham
 */
/*
 public void addRating(Person person, Film film, Rating rating) adds the rating of a specific film to the parameter person. 
 The same person can recommend a specific film only once. 
 The person rating has also to be added to the ratings connected to all the films.
 public Rating getRating(Person person, Film film) returns the rating the paramater person has assigned to the parameter film.
 If the person hasn't evaluated such film, the method returns Rating.NOT_WATCHED.
 public Map<Film, Rating> getPersonalRatings(Person person) returns a HashMap which contains the person's ratings. 
 The HashMap keys are the evaluated films, and their values are the ratings of these films.
 public List<Person> reviewers() returns a list of the people who have evaluate the films.
 People's ratings should be stored into a HashMap, and the people should act as keys. 
 The values of the HashMap is another HashMap, whose keys are films and whose values are ratings.
 */
public class RatingRegister {

    private Map<Film, List<Rating>> filmMap;
    private Map<Person, Map<Film, Rating>> personRates;
    private List<Person> persons;

    public RatingRegister() {
        this.filmMap = new HashMap<Film, List<Rating>>();
        this.personRates = new HashMap<Person, Map<Film, Rating>>();
        this.persons = new ArrayList<Person>();
    }

    public void addRating(Film film, Rating rating) {
        if (filmMap.get(film) == null) {
            filmMap.put(film, new ArrayList<Rating>());
        }
        filmMap.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        return filmMap.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.filmMap;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!persons.contains(person))
            persons.add(person);
        if (personRates.get(person) == null) {
            personRates.put(person, new HashMap<Film, Rating>());
        }
        if (personRates.get(person).get(film) == null) {
            personRates.get(person).put(film, rating);
        }

        this.addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {
        if (personRates.get(person).get(film) == null) {

            return Rating.NOT_WATCHED;
        }
        return personRates.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {

        if (this.personRates.get(person) == null) {
            personRates.put(person, new HashMap<Film, Rating>());
        }
        return this.personRates.get(person);
    }

    public List<Person> reviewers() {
        List<Person> pp = new ArrayList<Person>();
        for (Person perso : this.personRates.keySet()){
            pp.add(perso);
        }
        return pp;
    }
}