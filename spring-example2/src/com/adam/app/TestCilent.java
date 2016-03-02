package com.adam.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCilent {
public static void main(String[] args) {
	
	//to Read Path Of xml file
	/*Resource resource=new ClassPathResource("person.xml");
	
	
	BeanFactory factory=new XmlBeanFactory(resource);
	*/
	
	ApplicationContext context=
		new ClassPathXmlApplicationContext("person.xml");
	
	Person person=(Person) context.getBean("p");//create Object
System.out.println(person);

	

	
	
}
}
