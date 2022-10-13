package com.devmountain.training.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = {"com.ascending.training"})
//@ServletComponentScan(basePackages = {"com.ascending.training.filter"})
//@ServletComponentScan(value = {"com.ascending.training.filter"})
@ServletComponentScan("com.ascending.training.filter")
public class SpringBootAppInitializer {
    private Logger logger = LoggerFactory.getLogger(SpringBootAppInitializer.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppInitializer.class, args);
//        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AppInitializer.class, args);
//        EmployeeService employeeService = configurableApplicationContext.getBean(EmployeeService.class);
    }

//    @Bean
//    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public Logger logger(InjectionPoint injectionPoint) {
//        logger.debug("debug information");
//        return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
//    }


}
