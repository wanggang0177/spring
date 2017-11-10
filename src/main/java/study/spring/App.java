package study.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.first.HelloWorld;
import com.test.ioc.Teacher;
import com.test.ioc.service.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml","SpringIoc.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
        //构造器注入
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher.toString());
        //setter注入(必须有默认构造方法)
        Teacher teacher1 = (Teacher) context.getBean("teacher1");
        System.out.println(teacher1.toString());
        //接口注入
        Service service = (Service) context.getBean("service");
        service.add("test interface 。。。");
    }
}
