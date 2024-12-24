public class PushNotification implements Subscriber {
    @Override
    public void update(Event event) {
        System.out.println("Push-уведомление: " + event.getName() + " - " + event.getDetails());
    }
}
