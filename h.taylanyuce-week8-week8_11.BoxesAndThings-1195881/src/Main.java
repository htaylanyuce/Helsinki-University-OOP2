public class Main {
       public static void main(String[] args) {
        Box box = new Box(1000);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        
        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        
        box.add(new Box(100));
        
        System.out.println( box );
    }
            
}
