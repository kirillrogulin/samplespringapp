package smplApp.utils.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import smplApp.Device;
import smplApp.Network;

public class NetworkMapper implements RowMapper<Network> {

	@Override
	public Network mapRow(ResultSet resultSet, int id) throws SQLException {
//		Network n = new Network();
//		n.setId(resultSet.getInt("id"));
//		n.setName(resultSet.getString("name"));
//		n.setLocation(String.valueOf(resultSet.getInt("port")));
		return null;
	}

}
