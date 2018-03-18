package cn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
		/*BeanFactory beanfactory=new XmlBeanFactory(new FileSystemResource("D:\\eclipse_workspace\\Pat\\spirngxml.xml"));*/
		BeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("spirngxml.xml"));
		Student student=(Student) beanfactory.getBean("Student");
		student.cardspeak();
		student.cardspeak();
	}

}
