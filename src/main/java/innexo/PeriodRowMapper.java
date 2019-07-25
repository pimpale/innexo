package innexo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PeriodRowMapper implements RowMapper<Period> {

  @Override
  public Period mapRow(ResultSet row, int rowNum) throws SQLException {
    Period period = new Period();
    period.id = row.getInt("id");
    period.startTime = row.getInt("start_time");
    period.endTime = row.getInt("end_time");
    period.period = row.getInt("period");
    return period;
  }
}