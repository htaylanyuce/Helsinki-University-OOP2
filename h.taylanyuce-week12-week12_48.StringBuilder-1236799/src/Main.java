
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};//, 5 };  //, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(" {");
        sb.append("\n");
        int last = 0;
        for(int i = 1 ; i <= t.length; i++)
        {
            
            if(t.length == i)
            {
                 sb.append(" "+t[i-1]);
                 sb.append("\n");
                 sb.append(" }");
            }
            else if(i % 4 != 0)
                sb.append(" "+t[i-1]+",");
            else
            {
                sb.append(" "+t[i-1]+",");
                sb.append("\n");
                last = i;
            }
            
        
        }
        
        
        
        
        return sb.toString();
    }
}
