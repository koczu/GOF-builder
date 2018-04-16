package pl.sternik.as.fso.car;

import pl.sternik.as.fso.car.parts.ACType;
import pl.sternik.as.fso.car.parts.CarType;
import pl.sternik.as.fso.car.parts.Color;
import pl.sternik.as.fso.car.parts.RadioType;
import pl.sternik.as.fso.car.parts.TyresType;

public class CabrioBuilder implements CarBuilder {
	private Car car;

	public CabrioBuilder() {
		car = new Car();
		car.setCarType(CarType.KABRIO);
	}

	public CarBuilder startNewCar() {
		car = new Car();
		car.setCarType(CarType.KABRIO);
		return this;
	}
	
	public CarBuilder withAC(ACType withAC) {
		car.setWithAC(withAC);
		return this;
	}

	public CarBuilder paintInColor(Color color) {
		car.setColor(color);
		return this;
	}

	public CarBuilder setSeats(int seats) {
		car.setSeats(seats);
		return this;
	}

	public CarBuilder mountTyresType(TyresType tyresType) {
		car.setTyresType(tyresType);
		return this;
	}

	public CarBuilder mountRadioSystem(RadioType radio) {
		car.setRadio(radio);
		return this;
	}

	public CarBuilder withGps(boolean withGps) {
		car.setWithGps(withGps);
		return this;
	}

	public CarBuilder withComputer(boolean withComputer) {
		car.setWithComputer(withComputer);
		return this;
	}

	public Car build() {
		return car;
	}


}