package ProgrammingAssignment2;

/**
 * This class for Truck type vehicles.
 * @author Elif Gurkan
 */
public class Truck extends Vehicles{
    /**
     * taxRate holds taxRate of truck
     * tonnage holds tonnage capacity of truck
     */
    private double taxRate;
    private int tonnage;

    /**
     *
     * @param type Information about type of vehicle with just one word
     * @param model Information about brand of vehicle
     * @param age Age of vehicle
     * @param price Price of vehicle with taxes
     * @param taxRate Tax rate of vehicle
     * @param tonnage how many tons the truck can carry
     */
    public Truck(String type, String model, int age, String price, double taxRate,int tonnage) {
        super(type, model, age, price);
        this.taxRate = taxRate;
        this.tonnage = tonnage;
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
     * Getter for {@link #tonnage}
     * @return {@link #tonnage}
     */
    public int getTonnage() {
        return tonnage;
    }

    /**
     * Setter for {@link #tonnage}
     * @param tonnage the {@link #tonnage} to set
     */
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
    @Override
    public String toString() {
        return "Type : "+ getType()+
                "\nModel : "+ getModel()+
                "\nAge : " + getAge()+
                "\nTonnage : "+ getTonnage()+
                "\nPrice : "+getPrice();
    }

}
