
import java.util.ArrayList;

public class invoice {
    private int invoiceID;
    private String tradeInInfo;
    private float tradeInAllowance;
    private String purchasedVehicleInfo;
    private String installedOptions;
    private float taxes;
    private float fees;
    private float finalPrice;
    private String customerSignature;
    private salesperson salesperson;
    private newVehicle newVehicle;
    private ArrayList<tradeInVehicle> tradeInVehicles;
    private customer customer;
    private ArrayList<installedOption> instOptions;

    public invoice(String customerSignature, float fees, float finalPrice, String installedOptions, int invoiceID, String purchasedVehicleInfo, float taxes, float tradeInAllowance, String tradeInInfo) {
        this.customerSignature = customerSignature;
        this.fees = fees;
        this.finalPrice = finalPrice;
        this.installedOptions = installedOptions;
        this.invoiceID = invoiceID;
        this.purchasedVehicleInfo = purchasedVehicleInfo;
        this.taxes = taxes;
        this.tradeInAllowance = tradeInAllowance;
        this.tradeInInfo = tradeInInfo;
    }

}