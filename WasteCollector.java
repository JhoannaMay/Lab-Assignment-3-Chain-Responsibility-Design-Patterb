public interface WasteCollector {

    void setNext(WasteCollector next);
    void handleRequest(WasteContainer container);
}
