package com.github.dapeng.api.doc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 外部tomcat容器支持
 *
 * @author leihuazhe
 * @date 2018-01-12 20:00
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiDocApplication.class);
    }

}
