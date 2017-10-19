package smplApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import smplApp.Device;
import smplApp.Config.AppConfig;
import smplApp.Config.WebAppConfig;
import smplApp.utils.dao.DeviceDAO;
import smplApp.utils.dao.DeviceDAOImpl;

@Controller
@RequestMapping(value="/devices", method=RequestMethod.GET)
public class DeviceController {
	@Autowired
	DeviceDAO deviceDao;
	
	@RequestMapping(value="/viewall", method=RequestMethod.GET)
	public void viewAllDevices(Model model) {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, WebAppConfig.class);
////		ApplicationContext ctx = new ClassPathXmlApplicationContext("datasource.xml");
//		DeviceDAOImpl devDAO = (DeviceDAOImpl) ctx.getBean("deviceDao");
		List<Device> devs = deviceDao.getAll();
		System.out.println("devs length: " + devs.size());
		
		model.addAttribute("devices", devs);
	}
}
