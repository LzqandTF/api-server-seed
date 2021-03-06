package seed.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * api配置文件 
 * @author 马兆永
 * @time 2016年9月14日上午11:42:45
 */
@Configuration
@ConfigurationProperties(prefix = "api")
public class APIProperties {
	
	private String prefix = "/api";
	
	/**
	 * 哪些url不做权限过滤
	 */
	private List<String> excludeUrls;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public List<String> getExcludeUrls() {
		return excludeUrls;
	}

	public void setExcludeUrls(List<String> excludeUrls) {
		this.excludeUrls = excludeUrls;
	}
	
	
	
	
}
