public class Main {
    public static void main(String[] args) {
        // Создаем уведомитель событий
        EventNotifier notifier = new EventNotifier();

        // Создаем подписчиков
        ManagerSubscriber manager = new ManagerSubscriber();
        EmployeeSubscriber employee = new EmployeeSubscriber();
        ClientSubscriber client = new ClientSubscriber();

        // Создаем каналы уведомлений
        EmailNotification emailNotification = new EmailNotification();
        PushNotification pushNotification = new PushNotification();
        InAppNotification inAppNotification = new InAppNotification();

        // Подписываем их на события
        notifier.attach(manager);
        notifier.attach(employee);
        notifier.attach(client);
        notifier.attach(emailNotification);  // Подписка на email уведомления
        notifier.attach(pushNotification);   // Подписка на push уведомления
        notifier.attach(inAppNotification);  // Подписка на внутренние уведомления

        // Генерируем событие обновления документа
        Event documentEvent = new DocumentUpdatedEvent("Документ 'План проекта' был обновлён.");
        notifier.notify(documentEvent);

        // Отписываем клиента
        notifier.detach(client);

        // Генерируем событие изменения статуса задачи
        Event taskEvent = new TaskStatusChangedEvent("Задача 'Разработка' переведена в статус 'В работе'.");
        notifier.notify(taskEvent);
    }
}
