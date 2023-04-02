package com.suyh.parse.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 它只是有扫描注解类，但自己并没有被标识为一个bean
 * 除非添加一个{@link Component @ComponentS} 注解。
 */
@ComponentScan("com.suyh.parse.scan")
public class ExampleScan {
}
