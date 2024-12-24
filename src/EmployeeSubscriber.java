public class EmployeeSubscriber implements Subscriber {
    @Override
    public void update(Event event) {
        if (event instanceof TaskStatusChangedEvent) {
            System.out.println("Сотрудник получил уведомление: " + event.getName() + " - " + event.getDetails());
        }
    }
}