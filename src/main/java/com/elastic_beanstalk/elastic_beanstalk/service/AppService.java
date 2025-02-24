package com.elastic_beanstalk.elastic_beanstalk.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public String home() {
        return "Gideon Agbosu deploying Java App using Elastic Beanstalk LAB";
    }
}
