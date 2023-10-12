public class Lamp extends LightingDevice implements Comparable<Lamp> {
    public Lamp(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }

    @Override
    public int compareTo(Lamp o) {
        Lamp lamp = (Lamp) o;
        return Integer.compare(power, lamp.power);
    }

    @Override
    public String toString() {
        return "Lamp with power: " + power;
    }
}
