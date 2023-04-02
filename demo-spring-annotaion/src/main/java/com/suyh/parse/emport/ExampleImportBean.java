package com.suyh.parse.emport;

import org.springframework.stereotype.Component;

/**
 * 它会被识别成一个bean 对象。
 * 因为它上面有一个{@link Component @Component} 注解
 * 如果这个注解被删除，那么它就不会被识别成一个bean 对象了。
 */
@Component
public class ExampleImportBean {
}
