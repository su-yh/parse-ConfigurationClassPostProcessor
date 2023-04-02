package com.suyh.parse;

import com.suyh.parse.configuration.ExampleConfiguration;
import com.suyh.parse.scan.ExampleScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSpringAnnotationApplication {
    public static void main(String[] args) {
        {
            new AnnotationConfigApplicationContext(ExampleScan.class);
        }
        {
            new AnnotationConfigApplicationContext(ExampleConfiguration.class);
        }
        {
            new AnnotationConfigApplicationContext("com.suyh.parse.emport");
        }
    }
}
