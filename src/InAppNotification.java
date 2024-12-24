public class InAppNotification implements Subscriber {
    @Override
    public void update(Event event) {
        System.out.println("Внутреннее уведомление приложения: " + event.getName() + " - " + event.getDetails());
    }
}
