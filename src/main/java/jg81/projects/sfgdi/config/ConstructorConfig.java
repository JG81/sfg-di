package jg81.projects.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("jg81")
public class ConstructorConfig {
	
	private final String username;
	private final String password;
	private final String jdbcurl;
	
	public ConstructorConfig(String username, String password, String jdbcurl) {
		this.username = username;
		this.password = password;
		this.jdbcurl = jdbcurl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getJdbcurl() {
		return jdbcurl;
	}
	
	

}
