package com.github.dapeng.api.doc;

import com.github.dapeng.api.doc.properties.ApiDocProperties;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.*;

/**
 * 启动类
 *
 * @author maple.lei
 * @date 2018-01-12 20:00
 */
@SpringBootApplication
@EnableConfigurationProperties(ApiDocProperties.class)
public class ApiDocApplication /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .web(true)
                .sources(ApiDocApplication.class)
                .run(args);
    }

    /**
     * 针对前端ajax的消息转换器
     *
     * @return
     */
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter mappingConverter = new MappingJackson2HttpMessageConverter();
        List<MediaType> list = new ArrayList();
        list.add(MediaType.TEXT_HTML);
        list.add(MediaType.TEXT_PLAIN);
        list.add(MediaType.APPLICATION_JSON_UTF8);
        mappingConverter.setSupportedMediaTypes(list);
        return mappingConverter;
    }
}
