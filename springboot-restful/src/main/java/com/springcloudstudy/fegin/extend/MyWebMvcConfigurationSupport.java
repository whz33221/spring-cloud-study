package com.springcloudstudy.fegin.extend;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;
@Configuration
public class MyWebMvcConfigurationSupport extends WebMvcConfigurationSupport {
    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new PropertiesConverter());
        super.extendMessageConverters(converters);
    }
}
