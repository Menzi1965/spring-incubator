package entelect.training.incubator.spring.notification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import entelect.training.incubator.spring.notification.config.AppConfig;
import entelect.training.incubator.spring.notification.producer.MessageSender;

public class MessageProducerApp
{

    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MessageSender messageSender = context.getBean(MessageSender.class);

        messageSender.sendMessage("Hi Peter, How are you?");
        System.out.println("Message has been sent successfully...");

        ((AbstractApplicationContext) context).close();
    }

}
