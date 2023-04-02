package com.suyh.parse.emport;

import org.springframework.context.annotation.Import;

/**
 * 它只是被识别成一个{@link Import @Import} ，spring 会解析这个注解
 * 但是它并没有被标注为一个bean 所以不会被spring 解析
 */
@Import({ExampleImportBean.class, ExampleImportConfiguration.class})
public class ExampleImport {
}
