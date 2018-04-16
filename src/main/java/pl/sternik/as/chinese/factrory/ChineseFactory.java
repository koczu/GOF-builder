package pl.sternik.as.chinese.factrory;

import pl.sternik.as.Thing;
import pl.sternik.as.fso.CarBuildDirector;
import pl.sternik.as.fso.car.Car;
import pl.sternik.as.fso.car.CarBuilder;
import pl.sternik.as.fso.car.CabrioBuilder;

class RaceCar extends Toy {
    public RaceCar() {
        super("Racing");
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "RaceCar [name=" + name + "]" + super.toString();
    }
}

class Bear extends Toy {
    public Bear() {
        super("Teddy Bear");
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "Bear [name=" + name + "]" + super.toString();
    }
}

public class ChineseFactory {
    private Thing toClone;

    public void setProductionLine(Thing thing) {
        toClone = thing;
    }

    public Thing produceNextItem() {
        return toClone.clone();
    }

    public static void main(String[] args) {
        ChineseFactory factory = new ChineseFactory();

        factory.setProductionLine(new RaceCar());
        for (int i = 1; i < 5; i++)
            System.out.println(factory.produceNextItem());

        factory.setProductionLine(new Bear());
        for (int i = 1; i < 5; i++)
            System.out.println(factory.produceNextItem());

        System.out.println("----------++++-------------");
        long start = System.nanoTime();
        CarBuilder cabrioBuilder = new CabrioBuilder();
        CarBuildDirector carBuildDirector = new CarBuildDirector(cabrioBuilder);
        
        Car car;
        System.out.println("Production of first car:" + (System.nanoTime() - start));
        start = System.nanoTime();
        car = carBuildDirector.constructSportVersion();
        System.out.println("Production of second car:" + (System.nanoTime() - start));

        start = System.nanoTime();
        factory.setProductionLine(car);
        Thing[] production = new Thing[5];
        for (int i = 0; i < 5; i++)
            production[i] = factory.produceNextItem();
        long duration = System.nanoTime() - start;
        System.out.println("Clone 5 cars:" + duration + " for one:" + duration / 5);
        
        for (int i = 0; i < production.length; i++) {
            System.out.println(production[i]);
        }
    }
}