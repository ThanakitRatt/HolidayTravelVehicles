public class newVehicle {
    private int serialNO;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;
    private salesperson salesperson;
    private admin admin;
    private invoice invoice;

    public newVehicle(float baseCost, String manufacturer, String model, String name, int serialNO, int year) {
        this.baseCost = baseCost;
        this.manufacturer = manufacturer;
        this.model = model;
        this.name = name;
        this.serialNO = serialNO;
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("serialNO = ").append(serialNO);
        sb.append(", name = ").append(name);
        sb.append(", model = ").append(model);
        sb.append(", year = ").append(year);
        sb.append(", manufacturer = ").append(manufacturer);
        sb.append(", baseCost = ").append(baseCost);
        return sb.toString();
    }

}