package phone_model;

public class SamsungGalaxyS20 extends Samsung{

    private static final int noOfCameras = 4;

    public SamsungGalaxyS20(String name, String color) {
        super(name, color);
    }

    public static int getNoOfCameras() {
        return noOfCameras;
    }

}
