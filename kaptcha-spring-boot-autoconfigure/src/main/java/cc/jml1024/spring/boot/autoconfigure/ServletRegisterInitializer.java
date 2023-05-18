package cc.jml1024.spring.boot.autoconfigure;

import cc.jml1024.kaptcha.servlet.KaptchaServlet;
import cc.jml1024.spring.boot.autoconfigure.util.ConfigUtils;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Properties;

public class ServletRegisterInitializer implements ServletContextInitializer {
    private final static String KAPTCHA_SERVLET_BEAN_NAME_SUBFFIX = "KapthcaServlet";

    @Resource
    private KaptchaProperties kaptchaProperties;

    @Resource(name = "kaptchaProps")
    private Properties kaptchaProps;

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        Map<String, SingleKaptchaProperties> items = kaptchaProperties.getItems();

        if (items == null || items.isEmpty()) {
            return;
        }

        SingleKaptchaProperties props;

        for (Map.Entry<String, SingleKaptchaProperties> entry : items.entrySet()) {
            props = entry.getValue();
            if (StringUtils.isEmpty(props.getPath())) {
                return;
            }

            ServletRegistration.Dynamic serviceServlet = servletContext.addServlet(entry.getKey() + KAPTCHA_SERVLET_BEAN_NAME_SUBFFIX, new KaptchaServlet());
            serviceServlet.addMapping(props.getPath());
            serviceServlet.setAsyncSupported(true);
            Properties subProps = ConfigUtils.kaptchaSubPropertiesToProperties(entry.getKey(), props);

            for (Map.Entry<Object, Object> en : kaptchaProps.entrySet()) {
                boolean isSkip = subProps.containsKey(en.getKey()) && !StringUtils.isEmpty(String.valueOf(subProps.get(en.getKey())))
                        || StringUtils.isEmpty(en.getValue());
                if (isSkip) {
                    continue;
                }
                subProps.setProperty(String.valueOf(en.getKey()), String.valueOf(en.getValue()));
            }

            for (Map.Entry<Object, Object> en : subProps.entrySet()) {
                serviceServlet.setInitParameter(String.valueOf(en.getKey()), String.valueOf(en.getValue()));
            }
        }
    }
}
