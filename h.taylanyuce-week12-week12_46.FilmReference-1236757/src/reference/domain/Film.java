/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.List;

/**
 *
 * @author Cham
 */
public class Film {

    private String filmName;

    public Film(String name) {
        this.filmName = name;
    }

    public String getName() {
        return this.filmName;
    }

    public String toString(){
        return this.getName();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.filmName != null ? this.filmName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if ((this.filmName == null) ? (other.filmName != null) : !this.filmName.equals(other.filmName)) {
            return false;
        }
        return true;
    }
}