package smplApp.utils.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import smplApp.Device;

@Component
public class DeviceMapper implements RowMapper<Device> {

	@Override
	public Device mapRow(ResultSet resultSet, int id) throws SQLException {
		Device d = new Device();
		d.setId(resultSet.getInt("id"));
		d.setName(resultSet.getString("name"));
		d.setLocation(String.valueOf(resultSet.getInt("port")));
		return d;
	}

}
