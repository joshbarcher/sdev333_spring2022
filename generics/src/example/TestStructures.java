package example;

import example.model.Car;
import example.model.Umbrella;
import example.multiple_types.Pair;
import example.storages.*;

public class TestStructures
{
    public static void main(String[] args)
    {
        IntStorage number = new IntStorage(10);
        StringStorage word = new StringStorage("apple");

        char letter = 'c';
        IntStorage letterStorage = new IntStorage(letter);

        short shortNum = 100;
        IntStorage anotherNumber = new IntStorage(shortNum);

        BooleanStorage flag = new BooleanStorage(true);

        //use ObjectStorage to store all reference types
        ObjectStorage carStorage = new ObjectStorage(new Car("Nissan", "Rogue"));
        ObjectStorage umbrellaStorage = new ObjectStorage(new Umbrella());
        ObjectStorage stringStorage = new ObjectStorage("orange");
        ObjectStorage numStorage = new ObjectStorage(111);
        ObjectStorage booleanStorage = new ObjectStorage(true);

        //what's the drawback of using ObjectStorage?
        Car storedCar = (Car) carStorage.getData();
        System.out.println(storedCar.getMake());

        //declaring a DataStorage that stores strings
        DataStorage<String> string = new DataStorage<String>("world");
        System.out.println(string.getData().toUpperCase());

        DataStorage<Car> car = new DataStorage<Car>(new Car("Ford", "Focus"));
        System.out.println(car.getData().getModel());

        Pair<Boolean, Car> pairOfNums = new Pair<Boolean, Car>(true, new Car("Nissan", "Rogue"));
        System.out.println(pairOfNums.getFirst());
        System.out.println(pairOfNums.getSecond());
    }
}
