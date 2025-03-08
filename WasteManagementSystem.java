import java.util.ArrayList;
import java.util.List;

public class WasteManagementSystem {
     private List<WasteContainer> containers;
    private WasteCollector collectionChain;
    
    public List<WasteContainer> getContainers() {
        return this.containers = containers; 
    }

    public WasteManagementSystem() {
        containers = new ArrayList<>();
        initializeCollectionChain();
    }

    private void initializeCollectionChain() {
        WasteCollector organic = new OrganicWasteCollector();
        WasteCollector recyclable = new RecyclableWasteCollector();
        WasteCollector hazardous = new HazardousWasteCollector();

        organic.setNext(recyclable);
        recyclable.setNext(hazardous);
        
        collectionChain = organic;
    }
    

    public void addContainer(WasteContainer container) {
        containers.add(container);
    }

    public void processDisposals() {
        for (WasteContainer container : containers) {
            if (container.needsDisposal()) {
                collectionChain.handleRequest(container);
            }
        }
    }
}
