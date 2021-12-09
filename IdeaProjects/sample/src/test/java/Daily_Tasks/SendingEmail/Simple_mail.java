package Daily_Tasks.SendingEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Simple_mail {
    public static void main(String[] args) throws EmailException {
        System.out.println("Sending email");
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");//through which we send the mail
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("harshakapila87@gmail.com", "Pari@2019"));
        email.setSSLOnConnect(true);
        email.setFrom("harshakapila87@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("harshakapila87@gmail.com");
        email.send();
        System.out.println("Email Sent");
    }
}
