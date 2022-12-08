package dmitry.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = (TestBean) context.getBean("testBean");
        System.out.println(testBean.getName());

        context.close();
    }
}
