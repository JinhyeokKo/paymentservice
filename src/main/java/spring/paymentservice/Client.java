package spring.paymentservice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(ObjectFactory.class);
        PaymentService paymentService = beanFactory.getBean(PaymentService.class);
        OrderService orderService = beanFactory.getBean(OrderService.class);

        System.out.println(
        paymentService.exRateProvider == orderService.exRateProvider
        );
        Payment payment = paymentService.prepare(100L, "USD", java.math.BigDecimal.valueOf(50.7));
        System.out.println(payment);
    }
}
