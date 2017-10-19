package smplApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import smplApp.utils.dao.DeviceDAO;

public class Program {
	@Autowired
	static DeviceDAO deviceDao;

	public static void main(String[] args) throws ClassNotFoundException {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		Network net1 = (Network) ctx.getBean("network");
//		net1.getDev().setId(144);
//		net1.getDev().setName("My Network device");
//		net1.getDev().setLocation(net1.getName());
//		System.out.println(net1);
//		System.out.println(net1.getDev());
		
//		ApplicationContext gtx = new ClassPathXmlApplicationContext("datasource.xml");
//		DeviceDAOImpl devDAO = (DeviceDAOImpl) gtx.getBean("deviceDao");
		System.out.println(deviceDao.toString());
		
		List<Device> devs;
		devs = deviceDao.getAll();
		System.out.println("ALL DEVICES:\n");
		for(Device d: devs) {
			System.out.println(d);
		}
	}

}
