
import java.util.ArrayList;


public class salesperson {
    private int salespersonID;
    private String fname;
    private String lname;
    private ArrayList<invoice> invoices;
    private ArrayList<newVehicle> newVehicles;

    public salesperson (int salespersonID, String salespersonFname, String salespersonLname){
        this.salespersonID = salespersonID;
        this.fname = salespersonFname;
        this.lname = salespersonLname;
    } 
}