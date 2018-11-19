package com.github.dapeng.api.doc;

import com.github.dapeng.openapi.cache.ZkBootstrap;
import com.github.dapeng.api.doc.properties.ApiDocProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * desc: api doc config for metadata
 *
 * @author hz.lei
 * @since 2018年06月21日 下午12:25
 */
@Component
public class ApiDocConfig implements InitializingBean {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ApiDocProperties properties;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (System.getenv(ApiDocProperties.ENV_SOA_ZOOKEEPER_HOST) != null
                || System.getProperty(ApiDocProperties.PROP_SOA_ZOOKEEPER_HOST) != null) {

            logger.info("zk host in the environment is already set...");
        } else {
            System.setProperty(ApiDocProperties.PROP_SOA_ZOOKEEPER_HOST, properties.getHost());
            logger.info("zk host in the environment is not found,setting it with spring boot application, host is {}", properties.getHost());
        }

        ZkBootstrap zkBootstrap = new ZkBootstrap();
        zkBootstrap.openApiInit();
    }
}
