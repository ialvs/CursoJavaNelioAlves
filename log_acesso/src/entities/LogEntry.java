package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class LogEntry {
	
	String userName;
	LocalDateTime logDate;
	
	public LogEntry() {}

	public LogEntry(String userName, LocalDateTime logDate) {
		this.userName = userName;
		this.logDate = logDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getLogDate() {
		return logDate;
	}

	public void setLogDate(LocalDateTime logDate) {
		this.logDate = logDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(userName, other.userName);
	}
	
	
	
	
	
	
}
