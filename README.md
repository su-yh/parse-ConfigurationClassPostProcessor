# parse-ConfigurationClassPostProcessor
spring 的源码解析：ConfigurationClassPostProcessor

ConfigurationClassPostProcessor 是spring 提供的专门处理注解的。

包括递归、继承、方法等上面的注解。

ConfigurationClassPostProcessor 它实现了 BeanDefinitionRegistryPostProcessor 所以他的入口方法是: postProcessBeanDefinitionRegistry(..)


