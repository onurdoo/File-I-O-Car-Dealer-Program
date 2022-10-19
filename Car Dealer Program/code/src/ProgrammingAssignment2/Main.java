package ProgrammingAssignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

/**
 * Main.java execute few operations via your system.
 * @author Elif Gurkan
 * @version 1.0
 */
public class Main {
    /**
     * This is a main() method for the driver program.
     * @param args stores the incoming command line arguments for the program.
     */
    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer(); // created an object from CarDealer class for using round(double value) method
        ArrayList<Vehicles> vehicles = new ArrayList<>(); //created an array for store all vehicle that sold

        double totalPrice = 0;// Variable which holds price of whole vehicle sold


        Scanner fileIn = null; //An object from the scanner class was created to read from the file.

        try {
            fileIn = new Scanner(new FileInputStream("input.txt")); //name of the file to be read input.txt
            fileIn.useDelimiter(" ");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        /*
            The loop is created until there are no more lines to read in the file.
         */
        while (fileIn.hasNextLine()) {
            String[] line = fileIn.nextLine().split(" "); //Read file line separated by " ".
            String type = line[0]; //first data of the line read

            /*
            The first word in the line read determines what the program will do.
             If it is Vehicle type, the appropriate object is created and added to the array.
              If the first word is "print", the array and total price are reset by printing the output to the output.txt file.
             */
            switch (type) {/*
                    The appropriate object is created by evaluating the read data within the given constraints (min max values).
                    Conversion operations were performed for data of Integer and Double type.
                     */// The object was created with the values read and edited.
                case "Petrol": {
                    int age = Integer.parseInt(line[1]);
                    if (age > CarDealer.MAX_VEHICLE_AGE) {
                        age = CarDealer.MAX_VEHICLE_AGE;
                    } else if (age < CarDealer.MIN_VEHICLE_AGE) {
                        age = CarDealer.MIN_VEHICLE_AGE;
                    }
                    String model = line[2];
                    if (model.length() > CarDealer.MAX_VEHICLE_NAME_SIZE) {
                        model = model.substring(0, 14);
                    }
                    double price = Double.parseDouble(line[3]);
                    if (price > CarDealer.MAX_VEHICLE_PRICE) {
                        price = CarDealer.MAX_VEHICLE_PRICE;
                    } else if (price < CarDealer.MIN_VEHICLE_PRICE) {
                        price = CarDealer.MIN_VEHICLE_PRICE;
                    }
                    int doorNumbers = Integer.parseInt(line[4]);
                    ;
                    int fuelCapacity = Integer.parseInt(line[5]);
                    if (fuelCapacity > CarDealer.MAX_FUEL_CAPACITY) {
                        fuelCapacity = CarDealer.MAX_FUEL_CAPACITY;
                    } else if (fuelCapacity < CarDealer.MIN_FUEL_CAPACITY) {
                        fuelCapacity = CarDealer.MIN_FUEL_CAPACITY;
                    }
                    String stringPrice = carDealer.round(price);// values formatted with round(double value) method
                    PetrolCar newPetrolCar = new PetrolCar("Petrol Car", model, age, stringPrice, doorNumbers, fuelCapacity);
                    if (vehicles.size() < CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD) {
                        vehicles.add(newPetrolCar);// created object added to array
                        totalPrice += price;
                    }
                    break;
                }
/*
                    The appropriate object is created by evaluating the read data within the given constraints (min max values).
                    Conversion operations were performed for data of Integer and Double type.
                     */
// The object was created with the values read and edited.
                case "Electric": {
                    int age = Integer.parseInt(line[1]);
                    if (age > CarDealer.MAX_VEHICLE_AGE) {
                        age = CarDealer.MAX_VEHICLE_AGE;
                    } else if (age < CarDealer.MIN_VEHICLE_AGE) {
                        age = CarDealer.MIN_VEHICLE_AGE;
                    }
                    String model = line[2];
                    if (model.length() > CarDealer.MAX_VEHICLE_NAME_SIZE) {
                        model = model.substring(0, 14);
                    }
                    double price = Double.parseDouble(line[3]);
                    if (price > CarDealer.MAX_VEHICLE_PRICE) {
                        price = CarDealer.MAX_VEHICLE_PRICE;
                    } else if (price < CarDealer.MIN_VEHICLE_PRICE) {
                        price = CarDealer.MIN_VEHICLE_PRICE;
                    }
                    String stringPrice = carDealer.round(price); // values formatted with round(double value) method
                    int doorNumbers = Integer.parseInt(line[4]);
                    int batteryCapacity = Integer.parseInt(line[5]);
                    if (batteryCapacity > CarDealer.MAX_BATTERY_TONNAGE) {
                        batteryCapacity = CarDealer.MAX_BATTERY_TONNAGE;
                    } else if (batteryCapacity < CarDealer.MIN_BATTERY_TONNAGE) {
                        batteryCapacity = CarDealer.MIN_BATTERY_TONNAGE;
                    }
                    ElectricCar newElectricCar = new ElectricCar("Electric Car", model, age, stringPrice, doorNumbers, batteryCapacity);
                    if (vehicles.size() < CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD) {
                        vehicles.add(newElectricCar); // created object added to array
                        totalPrice += price;
                    }
                    break;
                }
/*
                    The appropriate object is created by evaluating the read data within the given constraints (min max values).
                     Conversion operations were performed for data of Integer and Double type.
                     */
// The object was created with the values read and edited.
                case "Bus": {
                    int age = Integer.parseInt(line[1]);
                    if (age > CarDealer.MAX_VEHICLE_AGE) {
                        age = CarDealer.MAX_VEHICLE_AGE;
                    } else if (age < CarDealer.MIN_VEHICLE_AGE) {
                        age = CarDealer.MIN_VEHICLE_AGE;
                    }
                    String model = line[2];
                    if (model.length() > CarDealer.MAX_VEHICLE_NAME_SIZE) {
                        model = model.substring(0, 14);
                    }
                    double price = Double.parseDouble(line[3]);
                    if (price > CarDealer.MAX_VEHICLE_PRICE) {
                        price = CarDealer.MAX_VEHICLE_PRICE;
                    } else if (price < CarDealer.MIN_VEHICLE_PRICE) {
                        price = CarDealer.MIN_VEHICLE_PRICE;
                    }
                    double taxRate = Double.parseDouble(line[4]);
                    price = (price * taxRate) / 100 + price;
                    String stringPrice = carDealer.round(price);// values formatted with round(double value) method
                    int capacity = Integer.parseInt(line[5]);
                    if (capacity > CarDealer.MAX_BUS_CAPACITY) {
                        capacity = CarDealer.MAX_BUS_CAPACITY;
                    } else if (capacity < CarDealer.MIN_BUS_CAPACITY) {
                        capacity = CarDealer.MIN_BUS_CAPACITY;
                    }
                    Bus newBus = new Bus("Bus", model, age, stringPrice, taxRate, capacity);
                    if (vehicles.size() < CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD) {
                        vehicles.add(newBus);// created object added to array
                        totalPrice += price;
                    }
                    break;
                }
/*
                    The appropriate object is created by evaluating the read data within the given constraints (min max values).
                     Conversion operations were performed for data of Integer and Double type.
                     */
// The object was created with the values read and edited.
                case "Truck": {
                    int age = Integer.parseInt(line[1]);
                    if (age > CarDealer.MAX_VEHICLE_AGE) {
                        age = CarDealer.MAX_VEHICLE_AGE;
                    } else if (age < CarDealer.MIN_VEHICLE_AGE) {
                        age = CarDealer.MIN_VEHICLE_AGE;
                    }
                    String model = line[2];
                    if (model.length() > CarDealer.MAX_VEHICLE_NAME_SIZE) {
                        model = model.substring(0, 14);
                    }
                    double price = Double.parseDouble(line[3]);
                    if (price > CarDealer.MAX_VEHICLE_PRICE) {
                        price = CarDealer.MAX_VEHICLE_PRICE;
                    } else if (price < CarDealer.MIN_VEHICLE_PRICE) {
                        price = CarDealer.MIN_VEHICLE_PRICE;
                    }
                    double taxRate = Double.parseDouble(line[4]);
                    price = (price * taxRate) / 100 + price;
                    String stringPrice = carDealer.round(price);// values formatted with round(double value) method
                    int tonnage = Integer.parseInt(line[5]);
                    if (tonnage > CarDealer.MAX_TRUCK_TONNAGE) {
                        tonnage = CarDealer.MAX_TRUCK_TONNAGE;
                    } else if (tonnage < CarDealer.MIN_TRUCK_TONNAGE) {
                        tonnage = CarDealer.MIN_TRUCK_TONNAGE;
                    }
                    Truck newTruck = new Truck("Truck", model, age, stringPrice, taxRate, tonnage);
                    if (vehicles.size() < CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD) {
                        vehicles.add(newTruck);// created object added to array
                        totalPrice += price;
                    }
                    break;
                }
//An object from the FileWriter class has been created to print the outputs.
//Stored data is deleted after each print command.
                case "print": {
                    FileWriter myWriter = null;
                    if (vehicles.size() == 0) {
                        /*If no vehicle is sold, this statement enters this if condition and the information is written to the output.txt file.
                         */
                        try {
                            myWriter = new FileWriter("output.txt", true);
                            myWriter.write("Number of Vehicles that are sold: 0\n" +
                                    "\n" +
                                    "No Vehicle that is sold\n" +
                                    "\n" +
                                    "Total Amount of Money : 0.00");

                            myWriter.write("\n");

                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //the information is written to the output.txt file.
                        try {
                            myWriter = new FileWriter("output.txt", true);
                            myWriter.write("Number of Vehicles that are sold: " + vehicles.size() + "\n\n");
                            for (Vehicles i : vehicles) {
                                myWriter.write(i + "\n\n");


                            }
                            myWriter.write("\nTotal Amount of Money : " + String.format("%.2f", totalPrice) + "\n\n");
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }
                    vehicles.clear();
                    totalPrice = 0;
                    break;
                }
            }
        }
    }

}

