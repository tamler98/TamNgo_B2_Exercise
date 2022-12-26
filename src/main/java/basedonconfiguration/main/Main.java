package basedonconfiguration.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbasedconfiguration/bean.xml");
        Student student = applicationContext.getBean("student", Student.class);
        student.drawCicle("Tam", 2.4);
        student.drawRetangle("Dat", 1.2, 1.5);
        student.drawSquare("Trung", 2.0);
    }
}