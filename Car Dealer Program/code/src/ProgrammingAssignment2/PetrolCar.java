package ProgrammingAssignment2;

/**
 * This class for Petrol Car type vehicles.
 */
public class PetrolCar extends Vehicles{
    /**
     * doorNumbers  stores how many doors are in the vehicle
     * fuelCapacity stores how much fuel capacity is
     */
    private int doorNumbers;
    private int fuelCapacity;

    /**
     *
     * @param type Information about type of vehicle with just one word
     * @param model Information about brand of vehicle
     * @param age Age of vehicle
     * @param price Price of vehicle
     * @param doorNumbers number of doors the vehicle has
     * @param fuelCapacity fuel capacity of the vehicle
     */
    public PetrolCar(String type, String model, int age, String price, int doorNumbers, int fuelCapacity) {
        super(type, model, age, price);
        this.doorNumbers = doorNumbers;
        this.fuelCapacity = fuelCapacity;
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
     * Getter for {@link #fuelCapacity}
     * @return {@link #fuelCapacity}
     */
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * Setter for {@link #fuelCapacity}
     * @param fuelCapacity the {@link #fuelCapacity} to set
     */
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     *  toString() method for print the object
     * @return Information about Petrol Car with formatted form
     */
    @Override
    public String toString() {
        return "Type : "+ getType()+
        "\nModel : "+ getModel()+
        "\nAge : " + getAge()+
        "\nFuel Capacity : "+ getFuelCapacity()+
        "\nNumber of Doors : " + getDoorNumbers() +
        "\nPrice : "+getPrice();
    }
}
