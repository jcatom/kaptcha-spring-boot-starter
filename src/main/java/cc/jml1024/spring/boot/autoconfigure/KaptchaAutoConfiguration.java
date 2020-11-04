package cc.jml1024.spring.boot.autoconfigure;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.util.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@EnableConfigurationProperties({KaptchaProperties.class})
public class KaptchaAutoConfiguration implements InitializingBean {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private KaptchaProperties kaptchaProperties;

    public KaptchaAutoConfiguration(KaptchaProperties kaptchaProperties) {
        this.kaptchaProperties = kaptchaProperties;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("nothing for checking");
    }

    @Bean
    @ConditionalOnMissingBean
    public Producer getKaptchaProducer() {
        Config config = getCofig();
        Producer producer = config.getProducerImpl();
        return producer;
    }

    private Config getCofig() {
        Properties properties = new Properties();
        properties.put(Constants.KAPTCHA_SESSION_CONFIG_KEY, kaptchaProperties.getSessionKey());
        properties.put(Constants.KAPTCHA_SESSION_CONFIG_DATE, kaptchaProperties.getSessionDate());
        properties.put(Constants.KAPTCHA_BORDER, kaptchaProperties.getBorder());
        properties.put(Constants.KAPTCHA_BORDER_COLOR, kaptchaProperties.getBorderColor());
        properties.put(Constants.KAPTCHA_BORDER_THICKNESS, kaptchaProperties.getBorderThickness());
        properties.put(Constants.KAPTCHA_NOISE_COLOR, kaptchaProperties.getNoiseColor());
        properties.put(Constants.KAPTCHA_NOISE_IMPL, kaptchaProperties.getNoiseImpl());
        properties.put(Constants.KAPTCHA_OBSCURIFICATOR_IMPL, kaptchaProperties.getObscurificatorImpl());
        properties.put(Constants.KAPTCHA_PRODUCER_IMPL, kaptchaProperties.getProducerImpl());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_IMPL, kaptchaProperties.getTextproducerImpl());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING, kaptchaProperties.getTextproducerCharString());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, kaptchaProperties.getTextproducerCharLength());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_NAMES, kaptchaProperties.getTextproducerFontNames());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, kaptchaProperties.getTextproducerFontColor());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_SIZE, kaptchaProperties.getTextproducerFontSize());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_SPACE, kaptchaProperties.getTextproducerCharSpace());
        properties.put(Constants.KAPTCHA_WORDRENDERER_IMPL, kaptchaProperties.getWordImpl());
        properties.put(Constants.KAPTCHA_BACKGROUND_IMPL, kaptchaProperties.getBackgroundImpl());
        properties.put(Constants.KAPTCHA_BACKGROUND_CLR_FROM, kaptchaProperties.getBackgroundClearFrom());
        properties.put(Constants.KAPTCHA_BACKGROUND_CLR_TO, kaptchaProperties.getBackgroundClearTo());
        properties.put(Constants.KAPTCHA_IMAGE_WIDTH, kaptchaProperties.getImageWidth());
        properties.put(Constants.KAPTCHA_IMAGE_HEIGHT, kaptchaProperties.getImageHeight());
        return new Config(properties);
    }
}
