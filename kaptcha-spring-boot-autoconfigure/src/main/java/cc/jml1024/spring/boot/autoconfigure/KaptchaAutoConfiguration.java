package cc.jml1024.spring.boot.autoconfigure;


import cc.jml1024.kaptcha.Producer;
import cc.jml1024.kaptcha.impl.DefaultKaptcha;
import cc.jml1024.kaptcha.util.Config;
import cc.jml1024.spring.boot.autoconfigure.util.ConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.Properties;

@Configuration
@EnableConfigurationProperties({KaptchaProperties.class})
public class KaptchaAutoConfiguration{
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Bean(name = "kaptchaProps")
    protected Properties kaptchaProps(KaptchaProperties kaptchaProperties) {
        return ConfigUtils.kaptchaPropertiesToProperties(kaptchaProperties);
    }

    @Bean
    @ConditionalOnMissingBean(Producer.class)
    @DependsOn({"kaptchaProps"})
    public Producer defaultKaptcha(Properties kaptchaProps) {
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        Config config = new Config(kaptchaProps);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }

    @Bean
    @DependsOn({"kaptchaProps"})
    public ServletContextInitializer webConfig() {
        return new ServletRegisterInitializer();
    }
}
