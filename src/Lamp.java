public class Lamp {
    public static final double MAX_BRIGHTNESS = 1D, MIN_BRIGHTNESS = 0D;
    private final int power;
    private double brightness;

    public Lamp(int power) {
        this.power = power;
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = level;
        }
    }

    public double getBrightness() {
        return brightness;
    }

    public void changeBrightness(double rate) {
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }

    public double getEnergyConsumption() {
        return power * brightness;
    }
}
