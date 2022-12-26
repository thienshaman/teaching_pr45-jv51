import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello1 = (Hello) context.getBean("hello1");
        Hello hello2 = (Hello) context.getBean("hello2");

        System.out.println(hello1.getName());
        System.out.println(hello2.getName());
    }
}
