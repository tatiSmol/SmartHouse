public abstract class LightingDevice implements ElectricDevice {
    public static final double MAX_BRIGHTNESS = 1D, MIN_BRIGHTNESS = 0D;
    protected final int power;
    protected double brightness;

    public LightingDevice(int power) {
        this.power = power;
    }

    @Override
    public boolean isSwitchedOn() {
        return brightness > 0;
    }

    @Override
    public void switchOn() {
        setBrightness(MAX_BRIGHTNESS);
    }

    @Override
    public void switchOff() {
        setBrightness(MIN_BRIGHTNESS);
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

//    public abstract double getEnergyConsumption();
}
