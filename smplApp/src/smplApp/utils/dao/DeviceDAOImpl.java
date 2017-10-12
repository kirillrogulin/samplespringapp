package smplApp.utils.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import smplApp.Device;

public class DeviceDAOImpl implements DeviceDAO {
	JdbcTemplate jdbcTemplate;
	DataSource dataSource;
	
	public DeviceDAOImpl(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public List<Device> getAll() {
		return this.jdbcTemplate.query(GET_ALL, new smplApp.utils.dao.mappers.DeviceMapper());
	}
}
