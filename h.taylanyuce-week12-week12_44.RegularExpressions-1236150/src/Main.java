
import java.util.Scanner;


public class Main {

   
    
    public static void main(String[] args) {
    
        System.out.print("Give a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        clockTime(str);
    }
    
    public static boolean isAWeekDay(String string){
        
            

    if(string.matches("mon|tue|wed|thu|fri|sat|sun")) 
    {
        System.out.println("The form is fine.");
        return true;
    }
     else 
        System.out.println("The form is wrong.");
    return false;
    
        
    }
    public static boolean allVowels(String string)
    {
        int count = 0;
        
        string = string.toLowerCase();
        if(string.matches("[aeiouäöAEIOU]*"))
        {
            System.out.println("The form is fine.");
            return true;
        }
        
    return false;
    
     
        
    }
   
        
    public static boolean clockTime(String string) {
        if ((string.matches("[0-2][0-4]:[0-5][0-9]:[0-5][0-9]")) && !(string.matches("[2][4]:[1-5][0-9]:[0-5][0-9]")))
            return true;
        return false;
    }
        
        
        
  
}