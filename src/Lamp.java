public class Lamp extends LightingDevice {
    public Lamp(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }
}
