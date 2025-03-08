public class Main {
    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();
        
        // Create different waste containers
        system.addContainer(new WasteContainer(WasteType.ORGANIC, 100));
        system.addContainer(new WasteContainer(WasteType.RECYCLABLE, 200));
        system.addContainer(new WasteContainer(WasteType.HAZARDOUS, 50));
        
        // Fill containers
        system.getContainers().get(0).fill(95);  // Organic
        system.getContainers().get(1).fill(190); // Recyclable
        system.getContainers().get(2).fill(48);  // Hazardous (not full)
        
        // Process disposals
        system.processDisposals();
    }
}