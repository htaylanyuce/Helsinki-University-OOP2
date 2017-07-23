import java.util.*;
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString)
    {
        int len = (characterString.length())+2;
        int k = 3;
        
        if(len % 2 == 0)
            while((k > 0))
            {
                
        
                for(int i = 0; i < (len/2)+2 ; i++)
                {
                 
                    if(k == 2 )
                    {
                        System.out.print(":) "+characterString+" :)");
                        break;
                    }
                    else
                           System.out.print(":)");
                    
                        
                }
                k--;
                System.out.println("");
            }
        else
            while(k > 0)
            {
                
                for(int i = 0; i < (len+1)/2+2 ; i++)
                {
                    
                    if(k == 2)
                    {   
                        System.out.print(":) "+characterString+"  :)");
                        break;
                    }
                    else
                        System.out.print(":)");
                  
                }
                k--;
                System.out.println("");
            }
    }

}
