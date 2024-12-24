public class ManagerSubscriber implements Subscriber {
    @Override
    public void update(Event event) {
        if (event instanceof TaskStatusChangedEvent || event instanceof DocumentUpdatedEvent) {
            System.out.println("Менеджер получил уведомление: " + event.getName() + " - " + event.getDetails());
        }
    }
}