package pl.sternik.as;

public class Thing implements Cloneable {

    public Thing clone() {
        Thing clone = null;
        try {
            clone = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
