import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getMessage());

        boolean beans = bean == bean1;
        System.out.println(beans);

        boolean cats = cat == cat1;
        System.out.println(cats);
    }
}