package com.suyh.parse.scan;

import org.springframework.stereotype.Component;

/**
 * 它会被spring 扫描到，因为{@link ExampleScan ExampleScan} 扫描的包路径包含了当前包。
 * 同时由于类上面有{@link Component @Component} 注解，所以它会被spring 识别到。
 */
@Component
public class ExampleScanBean {
}
