import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehmet
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int numberOfStarsPrinted;
    
    public NightSky(double density){
        this.density = density;
        if (this.density > 1) {
            this.density = 0.1;
        }
        this.width = 20;
        this.height = 10;
        this.numberOfStarsPrinted = 0;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.numberOfStarsPrinted = 0;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        if (this.density > 1) {
            this.density = 0.1;
        }
        this.width = width;
        this.height = height;
        this.numberOfStarsPrinted = 0;
    }
    
    public void printLine(){
        Random myRandom = new Random();
        
        
        int[] myRandomArray = new int[10];
        double numberOfOnes = this.density*10;
        double numberOfZeros = 10 - numberOfOnes;
        int index = 0;
        
        for (int i = 0; i < numberOfOnes; i++) {
            myRandomArray[index] = 1;
            index += 1;
        }
        
        for (int i = 0; i < numberOfZeros; i++) {
            myRandomArray[index] = 0;
            index += 1;
        }
        
        for (int i = 0; i < this.width; i++) {
            int randomNumber = myRandom.nextInt(10);
            int starValue = myRandomArray[randomNumber];
            if (starValue == 1) {
                System.out.print("*");
                this.numberOfStarsPrinted += 1;
            }
            else{
                System.out.print(" ");
            }
        }
    }
    
    public void print(){
        this.numberOfStarsPrinted = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint(){
        return this.numberOfStarsPrinted;
    }
    
}

