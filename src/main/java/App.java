import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanOne.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        System.out.println(beanOne == beanTwo);
        Cat catOne =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catOne.getValue());
        Cat catTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catTwo.getValue());
        System.out.println(catOne == catTwo);
    }
}
