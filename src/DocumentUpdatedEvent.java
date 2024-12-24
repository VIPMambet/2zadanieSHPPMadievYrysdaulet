public class DocumentUpdatedEvent extends Event {
    public DocumentUpdatedEvent(String details) {
        super("Документ обновлён", details);
    }
}