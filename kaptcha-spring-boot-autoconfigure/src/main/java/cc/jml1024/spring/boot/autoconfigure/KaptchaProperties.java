package cc.jml1024.spring.boot.autoconfigure;

import cc.jml1024.spring.boot.autoconfigure.constant.Constants;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = Constants.AUTO_CONFIG_PREFIX)
public class KaptchaProperties extends BaseProperties {
    private Map<String, SingleKaptchaProperties> items = new HashMap<>();

    public Map<String, SingleKaptchaProperties> getItems() {
        return items;
    }

    public void setItems(Map<String, SingleKaptchaProperties> items) {
        this.items = items;
    }
}
