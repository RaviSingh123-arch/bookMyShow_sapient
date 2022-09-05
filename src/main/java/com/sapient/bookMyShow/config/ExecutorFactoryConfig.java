package com.sapient.bookMyShow.config;

import com.sapient.bookMyShow.service.booking.orchestration.BookingExecutionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExecutorFactoryConfig {

    @Bean("bookingExecutionFactory")
    public FactoryBean bookingExecutionFactory() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(BookingExecutionFactory.class);
        return factoryBean;
    }
}
