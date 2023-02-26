package com.example.DynamicAutoWiredExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanFactoryDynamicAutowireService {
    private static final String SERVICE_NAME_SUFFIX = "regionService";
    private final BeanFactory beanFactory;

    @Autowired
    public BeanFactoryDynamicAutowireService() {
        this.beanFactory = null;
    }

    public boolean isServerActive(String isoCountryCode, int serverId) {
        RegionService service = beanFactory.getBean(getRegionServiceBeanName(isoCountryCode),
                RegionService.class);

        return service.isServerActive(serverId);
    }

    private String getRegionServiceBeanName(String isoCountryCode) {
        return isoCountryCode + SERVICE_NAME_SUFFIX;
    }
}
