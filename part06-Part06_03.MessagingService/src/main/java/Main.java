
public class Main {

    public static void main(String[] args) {

        MessagingService service = new MessagingService();

        Message message1 = new Message("Dave", "Meet at 6pm");
        service.add(message1);

        Message message2 = new Message("Keith", "Job is cancelled");
        service.add(message2);

        System.out.println(service.getMessages());
    }

}
