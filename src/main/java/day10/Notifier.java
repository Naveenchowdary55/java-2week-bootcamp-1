class EmailNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "EMAIL: " + message;
    }
}

class SmsNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "SMS: " + message;
    }
}

class PushNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "PUSH: " + message;
    }
}

