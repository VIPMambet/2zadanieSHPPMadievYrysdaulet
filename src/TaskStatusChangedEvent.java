public class TaskStatusChangedEvent extends Event {
    public TaskStatusChangedEvent(String details) {
        super("Статус задачи изменён", details);
    }
}