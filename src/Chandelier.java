public class Chandelier {
    public static final double MAX_BRIGHTNESS = 1D, MIN_BRIGHTNESS = 0D;
    private static final int LAMP_BRIGHTNESS_STEPS = 2;
    private static final double CONSUMPTION_COEFFICIENT = 1.095;

    private final int power, lampsCount;
    private double brightness;

    public Chandelier(int power, int lampsCount) {
        this.power = power;
        this.lampsCount = lampsCount;
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            double step = 1.0/(lampsCount * LAMP_BRIGHTNESS_STEPS);
            int stepsCount = (int) Math.round(level/step);
            brightness = stepsCount * step;
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
        return power * Math.pow(brightness, CONSUMPTION_COEFFICIENT);
    }
}
