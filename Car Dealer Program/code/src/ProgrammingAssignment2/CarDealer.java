package ProgrammingAssignment2;

/**
 * This class for giving information about cars and its properties
 * @author Elif Gurkan
 */
public class CarDealer {
    /**
     * MAX_VEHICLE_AGE that hold maximum age of any vehicle
     * MIN_VEHICLE_AGE that hold minimum age of any vehicle
     * MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD that hold maximum number of vehicle that can be sold
     * MAX_VEHICLE_NAME_SIZE that hold max character length
     * MIN_VEHICLE_PRICE that hold min price of any vehicle
     * MAX_VEHICLE_PRICE that hold maximum price of any vehicle
     * MIN_TRUCK_TONNAGE that hold min tonnage of trucks
     *  MAX_TRUCK_TONNAGE that hold maximum tonnage of any trucks
     *  MIN_BUS_CAPACITY that hold min capacity of  buses
     *  MAX_BUS_CAPACITY that hold maximum capacity of any buses
     *  MIN_BATTERY_TONNAGE that hold min tonnage of trucks
     *  MAX_BATTERY_TONNAGE that hold max battery tonnage of electric cars
     *  MIN_FUEL_CAPACITY that hold min fuel capacity of petrol cars
     *  MAX_FUEL_CAPACITY that hold min fuel capacity of petrol cars
     */

    public static final int MAX_VEHICLE_AGE = 20;
    public static final int MIN_VEHICLE_AGE = 0;
    public final static int MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD = 10;
    public final static int MAX_VEHICLE_NAME_SIZE = 15;
    public final static int MIN_VEHICLE_PRICE = 0;
    public final static int MAX_VEHICLE_PRICE = 1000000;
    public static final int MIN_TRUCK_TONNAGE = 0;
    public static final int MAX_TRUCK_TONNAGE = 5000;
    public static final int MIN_BUS_CAPACITY = 0;
    public static final int MAX_BUS_CAPACITY = 100;
    public static final int MIN_BATTERY_TONNAGE = 0;
    public static final int MAX_BATTERY_TONNAGE = 600;
    public static final int MIN_FUEL_CAPACITY = 0;
    public static final int MAX_FUEL_CAPACITY = 80;

    /**
     * This method rounds double values and formats decimal digits to 2 digits.
     * @param value any double value that need to be format
     * @return Formatted string form of value
     */
    public static String round(double value) {
        return String.format("%.2f",value);
    }
}