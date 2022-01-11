import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App {
    public static void main(String[] args) {
        //不能这么做,用SpringTest更好,方便启动测试
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        FirstService firstService = context.getBean("firstService", FirstService.class);
        System.out.println(firstService.getInfo());
    }
}