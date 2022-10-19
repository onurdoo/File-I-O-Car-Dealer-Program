package ProgrammingAssignment2;

/**
 * This class for  Electric Car type vehicles.
 * @author Elif Gurkan
 */
public class ElectricCar extends Vehicles {
    /**
     * doorNumbers  stores how many doors are in the vehicle
     * batteryCapacity stores how much battery capacity is
     */
    private int doorNumbers;
    private int batteryCapacity;

    /**
     *
     * @param type Information about type of vehicle with just one word
     * @param model Information about brand of vehicle
     * @param age Age of vehicle
     * @param price Price of vehicle
     * @param doorNumbers number of doors the vehicle has
     * @param batteryCapacity battery capacity of the vehicle
     */
    public ElectricCar(String type, String model, int age, String price, int doorNumbers, int batteryCapacity) {
        super(type, model, age, price);
        this.doorNumbers = doorNumbers;
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Getter for {@link #doorNumbers}
     * @return {@link #doorNumbers}
     */
    public int getDoorNumbers() {
        return doorNumbers;
    }

    /**
     * Setter for {@link #doorNumbers}
     * @param doorNumbers the {@link #doorNumbers} to set
     */
    public void setDoorNumbers(int doorNumbers) {
        this.doorNumbers = doorNumbers;
    }

    /**
     * Getter for {@link #batteryCapacity}
     * @return {@link #batteryCapacity}
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Setter for {@link #batteryCapacity}
     * @param batteryCapacity the {@link #batteryCapacity} to set
     */
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     *  toString() method for print the object
     * @return Information about Electic Car with formatted form
     */
    @Override
    public String toString() {
        return "Type : "+ getType()+
                "\nModel : "+ getModel()+
                "\nAge : " + getAge()+
                "\nBattery Capacity : "+ getBatteryCapacity()+
                "\nNumber of Doors : " + getDoorNumbers() +
                "\nPrice : "+getPrice();
    }
}
