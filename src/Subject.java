// Subject.java
import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void attach(Subscriber subscriber); // Добавить подписчика
    void detach(Subscriber subscriber); // Удалить подписчика
    void notify(Event event);           // Уведомить подписчиков о событии
}
