package Lessons.Week2.L232_FactorySender;

public class MailSender implements Sender{
    @Override
    public void Send() {
        System.out.println("This is a MailSender.");
    }
}
