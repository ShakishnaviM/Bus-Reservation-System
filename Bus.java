package busReserve;

public class Bus {
    private boolean AC;
    private int VehicleNo;
    private int capacity;

    public Bus(int cap, int VNo, boolean AC) {
        this.AC = AC;
        this.VehicleNo = VNo;
        this.capacity = cap;
    }

    public boolean getAc() {
        return AC;
    }

    public void setAc(boolean Ac) {
        AC = Ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVehicleNo() {
        return VehicleNo;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public void displayBusInfo() {
        System.out.println("Bus No: " + VehicleNo + ", AC: " + AC + ", Total Capacity: " + capacity);
    }
}
