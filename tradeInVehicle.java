public class tradeInVehicle {
    private int serialNO;
    private String name;
    private String model;
    private int year;
    private invoice invoice;
    private customer customer;

    public tradeInVehicle(String model, String name, int serialNO, int year) {
        this.model = model;
        this.name = name;
        this.serialNO = serialNO;
        this.year = year;
    }

}