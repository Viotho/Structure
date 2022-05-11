package com.jackyzeng.structure.common.config;

import com.jackyzeng.structure.common.converter.CustomMessageConverter;
import com.jackyzeng.structure.common.model.ConverterTarget;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebMvcConfiguration {
    
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, ConverterTarget>() {
                    @Override
                    public ConverterTarget convert(String s) {
                        return new ConverterTarget();
                    }
                });
            }

            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new CustomMessageConverter());
            }
        };
    }
}
