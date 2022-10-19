package ProgrammingAssignment2;

/**
 * This class for  bus type vehicles.
 * @author Elif Gurkan
 */
public class Bus extends Vehicles {
    /**
     * taxRate holds taxRate of bus
     * capacity holds passenger capacity of bus
      */
    private double taxRate;
    private int capacity;

    /**
     *
     * @param type Information about type of vehicle with just one word
     * @param model Information about brand of vehicle
     * @param age Age of vehicle
     * @param price Price of vehicle with taxes
     * @param taxRate Tax rate of vehicle
     * @param capacity Passenger capacity of bus
     */
    public Bus(String type, String model, int age, String price, double taxRate, int capacity) {
        super(type, model, age, price);
        this.taxRate = taxRate;
        this.capacity = capacity;

    }

    /**
     * Getter for {@link #taxRate}
     * @return {@link #taxRate}
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Setter for {@link #taxRate}
     * @param taxRate the {@link #taxRate} to set
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * Getter for {@link #capacity}
     * @return {@link #capacity}
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Setter for {@link #capacity}
     * @param capacity the {@link #capacity} to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *  toString() method for print the object
     * @return Information about bus with formatted form
     */
    @Override
    public String toString() {
        return "Type : "+ getType()+
                "\nModel : "+ getModel()+
                "\nAge : " + getAge()+
                "\nCapacity : "+ getCapacity()+
                "\nPrice : "+getPrice();
    }
}
