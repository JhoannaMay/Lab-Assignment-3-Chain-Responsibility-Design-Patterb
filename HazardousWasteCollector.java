public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector next;

    @Override
    public void setNext(WasteCollector next) {
        this.next = next;
    }

    @Override
    public void handleRequest(WasteContainer container) {
        if (container.getType() == WasteType.HAZARDOUS && container.needsDisposal()) {
            System.out.println("Hazardous waste collected (Capacity: " + container.getCapacity() + "L)");
            // Reset container fill level
        } else if (next != null) {
            next.handleRequest(container);
        }
    }
}