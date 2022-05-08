import com.jl.config.SpringConfig;
import com.jl.vo.Cat;
import com.jl.vo.Dog;
import com.jl.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student zsStudent =(Student) ac.getBean("zsStudent");
        System.out.println(zsStudent);
    }
    @Test
    public void Test02(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) ac.getBean("cat");
        System.out.println(cat);
    }
    @Test
    public void Test03(){
        ApplicationContext ac= new AnnotationConfigApplicationContext(SpringConfig.class);
        Dog dog = (Dog) ac.getBean("dog");
        System.out.println(dog);
    }
}
