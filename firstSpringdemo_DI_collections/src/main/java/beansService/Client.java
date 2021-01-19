package beansService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import beans.continent;

public class Client {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("spring.xml");

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Object o = ac.getBean("c");
		
		continent continent = (continent)o;
		
		continent.allVehicleInfo();

	}

}
