package cc.jml1024.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("kaptcha")
public class KaptchaProperties {
    private String height;
}
