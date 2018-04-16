package pl.sternik.as.fso.car;

import pl.sternik.as.Thing;
import pl.sternik.as.fso.car.parts.ACType;
import pl.sternik.as.fso.car.parts.CarType;
import pl.sternik.as.fso.car.parts.Color;
import pl.sternik.as.fso.car.parts.RadioType;
import pl.sternik.as.fso.car.parts.TyresType;

public class Car extends Thing{

	private CarType carType;
    private Color color;
    private int seats;    
    private TyresType tyresType;
    private RadioType radio;
    private boolean withGps;
    private ACType withAC;
    private boolean withComputer;
    

    protected Car() {
    }

	void setCarType(CarType carType) {
		this.carType = carType;
	}

	void setColor(Color color) {
		this.color = color;
	}

	void setSeats(int seats) {
		this.seats = seats;
	}

	void setTyresType(TyresType tyresType) {
		this.tyresType = tyresType;
	}

	void setRadio(RadioType radio) {
		this.radio = radio;
	}

	void setWithGps(boolean withGps) {
		this.withGps = withGps;
	}

	void setWithAC(ACType withAC) {
		this.withAC = withAC;
	}

	void setWithComputer(boolean withComputer) {
		this.withComputer = withComputer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carType == null) ? 0 : carType.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((radio == null) ? 0 : radio.hashCode());
		result = prime * result + seats;
		result = prime * result + ((tyresType == null) ? 0 : tyresType.hashCode());
		result = prime * result + ((withAC == null) ? 0 : withAC.hashCode());
		result = prime * result + (withComputer ? 1231 : 1237);
		result = prime * result + (withGps ? 1231 : 1237);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carType != other.carType)
			return false;
		if (color != other.color)
			return false;
		if (radio != other.radio)
			return false;
		if (seats != other.seats)
			return false;
		if (tyresType != other.tyresType)
			return false;
		if (withAC != other.withAC)
			return false;
		if (withComputer != other.withComputer)
			return false;
		if (withGps != other.withGps)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Oject:"+super.hashCode()+ "->Car:"+hashCode()+":[carType=" + carType + ", color=" + color + ", seats=" + seats + ", tyresType=" + tyresType
				+ ", radio=" + radio + ", withGps=" + withGps + ", withAC=" + withAC + ", withComputer=" + withComputer
				+ "]";
	}


}
