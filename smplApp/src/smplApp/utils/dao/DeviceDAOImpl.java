package smplApp.utils.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import smplApp.Device;

public class DeviceDAOImpl implements DeviceDAO {
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Device> getAll() {
		return null;
	}

}
