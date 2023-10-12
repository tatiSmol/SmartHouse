public interface ElectricDevice {
    double getEnergyConsumption();
    boolean isSwitchedOn();
    void switchOn();
    void switchOff();
    default void toggle() {
        if (isSwitchedOn()) {
            switchOff();
        } else {
            switchOn();
        }
    }
}
