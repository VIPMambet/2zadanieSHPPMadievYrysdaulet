public class ClientSubscriber implements Subscriber {
    @Override
    public void update(Event event) {
        if (event instanceof SystemNotificationEvent) {
            System.out.println("Клиент получил системное уведомление: " + event.getName() + " - " + event.getDetails());
        }
    }
}