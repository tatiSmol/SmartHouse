import java.util.ArrayList;

public class SmartHouse {
    private ArrayList<ElectricDevice> devices;

    public SmartHouse() {
        devices = new ArrayList<>();
        initLightingDevices();
    }

    private void initLightingDevices() {
        devices.add(new Lamp(100));
        devices.add(new Lamp(60));
        devices.add(new Lamp(40));
        devices.add(new Chandelier(100, 4));
        devices.add(new Chandelier(400, 10));
        devices.add(new Chandelier(250, 5));
        devices.add(new Chandelier(120, 3));
    }

    public void switchOffAllDevices() {
        devices.forEach(ElectricDevice::switchOff);
    }

    public void switchOnAllLight() {
        devices.stream().filter(device -> device instanceof LightingDevice).forEach(ElectricDevice::switchOn);
    }

    public double getTotalEnergyConsumption() {
        return devices.stream().mapToDouble(ElectricDevice::getEnergyConsumption).sum();
    }
}
