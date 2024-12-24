// EventNotifier.java
import java.util.ArrayList;
import java.util.List;

public class EventNotifier implements Subject {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notify(Event event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(event);
        }
    }
}
