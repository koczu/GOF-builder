package pl.sternik.as.fso;

import pl.sternik.as.fso.car.Car;
import pl.sternik.as.fso.car.CarBuilder;
import pl.sternik.as.fso.car.CabrioBuilder;
import pl.sternik.as.fso.car.CombiBuilder;
import pl.sternik.as.fso.car.parts.ACType;
import pl.sternik.as.fso.car.parts.Color;
import pl.sternik.as.fso.car.parts.RadioType;
import pl.sternik.as.fso.car.parts.TyresType;

public class CarBuildDirector {
    private CarBuilder builder;

    public CarBuildDirector(CarBuilder builder) {
        this.builder = builder;
    }

    void setBuilder(CarBuilder builder) {
		this.builder = builder;
	}

	public Car constructSportVersion() {
        return builder
        		.withAC(ACType.AUTO)
        		.paintInColor(Color.RED)
        		.setSeats(2)
        		.mountTyresType(TyresType.SPORT)
        		.mountRadioSystem(RadioType.MP3)
        		.withGps(true)
        		.withComputer(true).build();
    }
    public Car constructStandardVersion() {
        return builder
        		.withAC(ACType.MANUAL)
        		.paintInColor(Color.BLUE)
        		.setSeats(5)
        		.mountTyresType(TyresType.SUMMER)
        		.mountRadioSystem(RadioType.CD)
        		.withGps(true)
        		.withComputer(false).build();
    }
    public static void main(final String[] arguments) {
        CarBuilder cabrioBuilder = new CabrioBuilder();
        CarBuilder combiBuilder = new CombiBuilder();
        CarBuildDirector carBuildDirector = new CarBuildDirector(cabrioBuilder);
        System.out.println(carBuildDirector.constructSportVersion());
        
        System.out.println("Switching prodution to Combi");
        carBuildDirector.setBuilder(combiBuilder);
        System.out.println(carBuildDirector.constructStandardVersion());
        
        Car notCompleted = cabrioBuilder
                .startNewCar()
        		.paintInColor(Color.BLACK)
        		.mountTyresType(TyresType.SPORT)
        		.build();
        System.out.println("Cabrio notcompleted");
        System.out.println(notCompleted);
    }
}
