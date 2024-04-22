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

        boolean a = bean == bean1;
        System.out.println(a);

        Cat bean11 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean11.getMessage());

        Cat bean22 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean22.getMessage());

        boolean b = bean11 == bean22;
        System.out.println(b);
    }
}