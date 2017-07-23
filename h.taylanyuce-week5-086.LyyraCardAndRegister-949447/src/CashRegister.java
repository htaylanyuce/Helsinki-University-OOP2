
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        
        double lunchPrice = 2.5;                
        
        
        if(cashGiven >= lunchPrice)
        {
          
                this.cashInRegister += 2.5;
                this.economicalSold++;
          
          
                return cashGiven - lunchPrice;
            
        }
        else
            return cashGiven;
               
    }

    public double payGourmet(double cashGiven) {
        
        double lunchPrice = 4.0;                
        
        if(cashGiven >= lunchPrice)
        {
            this.cashInRegister += 4.0;
            this.gourmetSold++;
            return cashGiven - lunchPrice;
        }
        else
            return cashGiven;
               
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    public boolean payEconomical(LyyraCard card)
    {
        double price = 2.5;
        if( card.pay(price))
        {
        
            this.economicalSold++;
            return true;
        }
            
        return false;
    }
    public boolean payGourmet(LyyraCard card)
    {
        
        double price = 4.0;
        if( card.pay((price)))
        {
            this.gourmetSold++;
            return true;
        }
            
        return false;
    }
    public void loadMoneyToCard(LyyraCard card, double sum)
    {
        if(sum > 0)
        {
            this.cashInRegister +=sum;
            card.loadMoney(sum);
        }
    }
            
}