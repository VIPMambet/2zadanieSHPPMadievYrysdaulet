public class EmailNotification implements Subscriber {
    @Override
    public void update(Event event) {
        System.out.println("Email-уведомление: " + event.getName() + " - " + event.getDetails());
    }
}
