package HW4;

public class Tanker {
    private String serialNumber;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    protected String getFuelType(){
        return "A500";
    }
    public void refuel(int amount){
        System.out.println("Add "+amount+" of "+getFuelType()+", tanker serial number is "+serialNumber);
    }
}
class XFuelTanker extends Tanker {
    protected String getFuelType(){
        return "XFuel";
    }
}
class MX200Tanker extends Tanker{
    protected String getFuelType(){
        return "MX200";
    }
}
