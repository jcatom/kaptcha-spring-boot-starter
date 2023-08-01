package cc.jml1024.spring.boot.autoconfigure;


import cc.jml1024.kaptcha.Producer;
import cc.jml1024.kaptcha.impl.DefaultKaptcha;
import cc.jml1024.kaptcha.util.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.Properties;

@Configuration
@ConditionalOnClass({Producer.class, DefaultKaptcha.class})
@EnableConfigurationProperties({KaptchaProperties.class})
public class KaptchaAutoConfiguration{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean(name = "kaptchaProps")
    protected Properties kaptchaProps(KaptchaProperties kaptchaProperties) {
        logger.info("kaptchaProperties: {}", kaptchaProperties);
        return kaptchaProperties.toProperties();
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
}
