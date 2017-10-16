package smplApp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import smplApp.Device;
import smplApp.utils.dao.DeviceDAOImpl;

@Controller
@RequestMapping(value="/devices", method=RequestMethod.POST)
public class DeviceController {
	
	@RequestMapping(value="/viewall")
	public void viewAllDevices(Model model) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("datasource.xml");
		DeviceDAOImpl devDAO = (DeviceDAOImpl) ctx.getBean("deviceDao");
		List<Device> devs = devDAO.getAll();
		
		model.addAttribute("devices", devs);
	}
}
