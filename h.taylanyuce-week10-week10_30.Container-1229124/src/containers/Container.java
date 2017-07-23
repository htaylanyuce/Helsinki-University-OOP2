package containers;

public class Container {

    private double capacity;
    private double volume;
    private String name;

    public Container(double tilavuus) {
        if (tilavuus > 0.0) {
            this.capacity = tilavuus;
        } else {
            this.capacity = 0.0;
        }

        volume = 0.0;
    }
public String getName()
    {
        
        return this.name;
    }

    public double getVolume() {
        return volume;
    }

    public double getOriginalCapacity() {
        return capacity;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

    public double getCurrentCapacity() {
        return capacity - volume;
    }

    public void addToTheContainer(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= getCurrentCapacity()) {
            volume = volume + amount;
        } else {
            volume = capacity;
        }
    }

    public double takeFromTheContainer(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > volume) {
            double everything = volume;
            volume = 0.0;
            return everything;
        }

        volume = volume - amount;
        return amount;
    }

    @Override
    public String toString() {
        return this.name+": volume = " + volume + ", free space " + getCurrentCapacity();
    }
}
