
import java.util.ArrayList;

public class customer{
    private int customerID;
    private String fname;
    private String lname;
    private String address;
    private String phoneNO;
    private invoice invoice;
    private ArrayList<tradeInVehicle> tradeInVehicles;
    private ArrayList<installedOption> installedOptions;

    public customer(String address, int customerID, String fname, String lname, String phoneNO) {
        this.address = address;
        this.customerID = customerID;
        this.fname = fname;
        this.lname = lname;
        this.phoneNO = phoneNO;
    }

}