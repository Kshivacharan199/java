package project1;

class DeviceErrorException extends Exception {
    public DeviceErrorException(String message) {
        super(message);
    }
}

public class DeviceStatusSystem {

    public void checkDevice(String deviceName) throws DeviceErrorException {
        if (deviceName.equalsIgnoreCase("printer1") || deviceName.equalsIgnoreCase("printer3")) {
            System.out.println("Available");
        } else {
            throw new DeviceErrorException("Device failure: Not Available");
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("No device name provided.");
            }

            String deviceName = args[0];
            DeviceStatusSystem device = new DeviceStatusSystem();
            device.checkDevice(deviceName);

        } catch (DeviceErrorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
