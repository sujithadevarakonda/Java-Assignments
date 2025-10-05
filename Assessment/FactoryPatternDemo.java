package assesment;
    interface Notification {
        void notifyUser();
    }
    class EmailNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Sending an Email Notification...");
        }
    }

    class SMSNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Sending an SMS Notification...");
        }
    }

    class PushNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Sending a Push Notification...");
        }
    }
    class NotificationFactory {
        public Notification createNotification(String type) {
            if (type == null || type.isEmpty()) {
                return null;
            }
            switch (type.toLowerCase()) {
                case "email":
                    return new EmailNotification();
                case "sms":
                    return new SMSNotification();
                case "push":
                    return new PushNotification();
                default:
                    throw new IllegalArgumentException("Unknown notification type: " + type);
            }
        }
    }
    public class FactoryPatternDemo {
        public static void main(String[] args) {
            NotificationFactory factory = new NotificationFactory();
            Notification email = factory.createNotification("email");
            email.notifyUser();
            Notification sms = factory.createNotification("sms");
            sms.notifyUser();
            Notification push = factory.createNotification("push");
            push.notifyUser();
        }
    }

