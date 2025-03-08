public class WasteContainer {
    private WasteType type;
    private double capacity;
    private double currentFillLevel;

    public WasteContainer(WasteType type, double capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentFillLevel = 0;
    }

    public void fill(double amount) {
        currentFillLevel += amount;
        if (currentFillLevel > capacity) {
            currentFillLevel = capacity;
        }
    }

    public boolean needsDisposal() {
        return currentFillLevel >= capacity * 0.9;
    }

    public WasteType getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }
}