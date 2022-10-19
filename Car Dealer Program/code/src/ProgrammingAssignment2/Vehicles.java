package ProgrammingAssignment2;

/**
 * This class is abstract inheritor class for all vehicle type
 * @author Elif Gurkan
 */
public abstract class Vehicles {
    /**
     * Type holds type of vehicle
     * Model holds model of vehicle
     * Age holds age of vehicle
     * Price holds price of vehicle
     */
    private String type;
    private String model;
    private int age;
    private String  price;

    /**
     *
     * @param type Information about type of vehicle with just one word
     * @param model Information about brand of vehicle
     * @param age  Age of vehicle
     * @param price Price of vehicle. If vehicle type is bus or truck, price value with taxes
     */
    public Vehicles(String type, String model, int age, String price){
        this.type = type;
        this.model = model;
        this.age = age;
        this.price = price;
    }

    /**
     * Getter for {@link #type}
     * @return {@link #type}
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for {@link #type}
     * @param type the {@link #type} to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for {@link #model}
     * @return {@link #model}
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter for {@link #model}
     * @param model the {@link #model} to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter for {@link #age}
     * @return {@link #age}
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for {@link #age}
     * @param age the {@link #age} to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter for {@link #price}
     * @return {@link #price}
     */
    public String getPrice() {
        return price;
    }

    /**
     * Setter for {@link #price}
     * @param price the {@link #price} to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

}
