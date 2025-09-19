public class installedOption {
    private int optionCode;
    private String description;
    private float price;
    private invoice invoice;
    private customer customer;

    public installedOption(String description, int optionCode, float price) {
        this.description = description;
        this.optionCode = optionCode;
        this.price = price;
    }
}