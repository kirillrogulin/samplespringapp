package smplApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Network net1 = (Network) ctx.getBean("network");
		net1.getDev().setId(144);
		net1.getDev().setName("My Network device");
		net1.getDev().setLocation(net1.getName());
		System.out.println(net1);
		System.out.println(net1.getDev());
	}

}
