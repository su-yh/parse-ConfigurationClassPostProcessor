package com.suyh.parse.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * 它是一个{@link Configuration @Configuration}
 * 并且它还是一个bean 对象，除了会被spring 识别成一个bean 以外。
 * 还会按一个Configuration 类来处理。
 * 不过，首先，它需要被spring 扫描到，或者被提前添加到spring 上下文中。
 */
@Configuration
public class ExampleConfiguration {
}
