
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        int i = 0;
        while(true)
        {
             System.out.print("name: ");
             String name = reader.nextLine();
             
             if(name.equals(""))
                break;
             System.out.print("studentnumber: ");                
             String ID = reader.nextLine();
                         
                students.add(new Student(name,ID ));
            
             
        }
        for(Student s : students)
        {
            System.out.println(s.toString());
        }
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        
        int len = students.size();
        int index = 0;
        Student check ;
        System.out.println("Result:");
        while(index < len)
        {
            check = students.get(index);
            String checkname = check.getName();
            if(checkname.contains(search))
                System.out.println(check.toString());
              
            index++;
        }
        
        
    }
}