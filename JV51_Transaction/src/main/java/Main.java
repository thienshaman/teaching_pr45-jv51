import config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

public class Main {
    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        AccountService accountService = (AccountService) context.getBean("accountService");
        System.out.println(accountService.transfer(1, 2, 100));
        // System.out.println(accountService.withdraw(1, 100));
    }
}
