
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    
        
    public int differenceInYears(MyDate comparedDate)
    {
              
         
        int myDifference = 0;
        int yearDifference = this.year - comparedDate.year;
        
        if (yearDifference > 0) {
            if (this.month > comparedDate.month) {
                 myDifference = yearDifference;
            }
            else if(this.month == comparedDate.month){
                if (this.day > comparedDate.day) {
                    myDifference = yearDifference;
                }
                else if(this.day == comparedDate.day){
                    myDifference = yearDifference;
                }
                else{
                    myDifference = yearDifference - 1;
                }
            }
            else{
                myDifference = yearDifference - 1;
            }
        }
        else if(yearDifference == 0){
            myDifference = 0;
        }
        else{ //if(yearDifference < 0){
            if (this.month < comparedDate.month) {
                myDifference = -yearDifference;
            }
            else if(this.month == comparedDate.month){
                if (this.day < comparedDate.day) {
                    myDifference = -yearDifference;
                }
                else if(this.day == comparedDate.day){
                    myDifference = -yearDifference;
                }
                else{
                    myDifference = -yearDifference - 1;
                }
            }
            else{
                myDifference = -yearDifference - 1;
            }
        }
        if (myDifference >= 0) {
            return myDifference;
        }
        else{
            return 0;
        }
    }

  
}