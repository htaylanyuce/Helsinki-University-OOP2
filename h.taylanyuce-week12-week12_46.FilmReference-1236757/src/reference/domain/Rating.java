/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Cham
 */

public enum Rating {
    BAD(-5), // the constructor parameters are defined as constant values when they are read
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);

    private int value; // object variable

    private Rating(int value) { // constructor
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}