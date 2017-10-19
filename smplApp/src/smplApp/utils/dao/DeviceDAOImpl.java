package smplApp.utils.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import smplApp.Device;

@Component
@Qualifier("deviceDao")
public class DeviceDAOImpl implements DeviceDAO {
	JdbcTemplate jdbcTemplate;
	DataSource dataSource;
	
	@Autowired
	public DeviceDAOImpl(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public List<Device> getAll() {
		return this.jdbcTemplate.query(GET_ALL, new smplApp.utils.dao.mappers.DeviceMapper());
	}
}
