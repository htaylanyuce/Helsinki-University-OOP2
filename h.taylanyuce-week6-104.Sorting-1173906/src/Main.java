
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int smallest(int [] array)
    {
        int min = array[0];
        
        for(int i = 1; i < array.length;i++)
        {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static int indexOfTheSmallest(int [] array)
    {
        int min = array[0];
        int index = 0;
        
        for(int i = 1; i < array.length;i++)
        {
            if(array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        
        for(int i = index; i < array.length;i++)
        {
            if(array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        return index;
        
        
    }
    public static void swap(int[] array, int index1, int index2) {
        
        int tmp = array[index1];
        array[index1 ]=array[index2];
        array[index2] = tmp;
        
        
    }
    public static void sort(int[] array) {
        
        int smallest;
        
        for(int i = 0; i < array.length;i++)
        {
            smallest = indexOfTheSmallestStartingFrom(array,i);
            swap(array,smallest ,i) ;
        }
    
    }
  
  
}
