package smplApp.utils.dao;

import java.util.List;

import smplApp.Device;

public interface DeviceDAO {
	
	List<Device> getAll();
	
	final String GET_ALL = "SELECT * FROM devices;";
}
