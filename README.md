# SpringCloud-Template
标准的SpringCloud项目模板,可下载直接使用

### 组件

> eureka
>
> feign
>
> hystrix
>
>ribbon
>
> zuul

### 子项目结构

> 最外层的项目springcloud-template-->父pom
>
> common--->提供一些公用的工具类
>
> provider--->生产者模块
>
> consumer--->消费者模块
>
> zuul----->网关
>
> eueka--->注册中心





### 具体文件解析



```java
.
├── README.md
├── springcloud-template
│   ├── pom.xml   父级pom,提供依赖版本控制
  
  
│   ├── ❣️ common   公共依赖,提供工具类
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── com
│   │   │   │   │       └── template
│   │   │   │   │           └── common
│   │   │   │   │               ├── CommonApplication.java
│   │   │   │   │               ├── PageVo
│   │   │   │   │               │   └── Page.java    ❣️分页类
│   │   │   │   │               ├── contant
│   │   │   │   │               │   └── CommonContants.java  ❣️静态常量
│   │   │   │   │               ├── result         ❣️返回结果集
│   │   │   │   │               │   ├── ReturnEnum.java
│   │   │   │   │               │   ├── ReturnResult.java
│   │   │   │   │               │   ├── ReturnResultContants.java
│   │   │   │   │               │   └── ReturnResultUtils.java
│   │   │   │   │               └── util
│   │   │   │   │                   ├── DateUtils.java   ❣️日期类
│   │   │   │   │                   ├── GetIpAddressUtil.java  ❣️ip地址
│   │   │   │   │                   ├── RandomGenerator.java   ❣️生成随机数/字符串
│   │   │   │   │                   └── RedisUtil.java        ❣️redis工具类
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       ├── static
│   │   │   │       └── templates


│   ├── 💓consumer   消费者
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── com
│   │   │   │   │       └── template
│   │   │   │   │           └── consumer
│   │   │   │   │               ├── ConsumerApplication.java
│   │   │   │   │               ├── annotationCustom         ❣️自定义注解/过滤器
│   │   │   │   │               │   ├── UserVo.java
│   │   │   │   │               │   ├── method
│   │   │   │   │               │   │   ├── RequireLoginMethod.java
│   │   │   │   │               │   │   └── RequireLoginMethodImpl.java
│   │   │   │   │               │   ├── parameter
│   │   │   │   │               │   │   ├── RequireLoginParam.java
│   │   │   │   │               │   │   └── RequireLoginParamImpl.java
│   │   │   │   │               │   └── webConfiguration.java
│   │   │   │   │               ├── config          
│   │   │   │   │               │   ├── AsyncTaskConfig.java     ❣️多线程配置
│   │   │   │   │               │   ├── RedisConfiguration.java    ❣️redis配置
│   │   │   │   │               │   └── SwaggerConfiguration.java    ❣️swagger配置
│   │   │   │   │               ├── controller
│   │   │   │   │               │   └── HelloController.java   
│   │   │   │   │               ├── dto
│   │   │   │   │               ├── feign        
│   │   │   │   │               │   ├── HelloFeign.java
│   │   │   │   │               │   └── HelloFeignImpl.java
│   │   │   │   │               ├── queue
│   │   │   │   │               │   ├── activeMQ    ❣️消息队列
│   │   │   │   │               │   │   ├── ActiveMQConsumer.java
│   │   │   │   │               │   │   └── ActiveMQUtils.java
│   │   │   │   │               │   └── redis
│   │   │   │   │               └── vo
│   │   │   │   └── resources
│   │   │   │       ├── application.yml    🛑核心配置文件
│   │   │   │       ├── static
│   │   │   │       └── templates
  
  
│   ├── 💞eureka   注册中心
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── com
│   │   │   │   │       └── gavin
│   │   │   │   │           └── eureka
│   │   │   │   │               └── EurekaApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.yml
│   │   │   │       ├── static
│   │   │   │       └── templates

│   ├── ✴️provider  生产者
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── com
│   │   │   │   │       └── template
│   │   │   │   │           └── provider
│   │   │   │   │               ├── ProviderApplication.java
│   │   │   │   │               ├── config
│   │   │   │   │               │   ├── AsyncTaskConfig.java
│   │   │   │   │               │   ├── MybatisConfiguration.java
│   │   │   │   │               │   └── RedisConfiguration.java
│   │   │   │   │               ├── controller
│   │   │   │   │               │   └── HelloController.java
│   │   │   │   │               ├── dto
│   │   │   │   │               ├── mapper
│   │   │   │   │               └── service
│   │   │   │   │                   └── HelloService.java
│   │   │   │   └── resources
│   │   │   │       ├── application.yml
│   │   │   │       ├── generatorConfig.xml      ❣️mapper自动生成的配置,里面需要改sql配置
│   │   │   │       ├── logback-spring.xml       ❣️logback配置,需要改路径
│   │   │   │       ├── static
│   │   │   │       └── templates
│   └── 💝zuul  网关
│       ├── pom.xml
│       ├── src
│       │   ├── main
│       │   │   ├── java
│       │   │   │   └── com
│       │   │   │       └── template
│       │   │   │           └── zuul
│       │   │   │               ├── ZuulApplication.java  
│       │   │   │               └── filter
│       │   │   │                   └── WebFilter.java     ❣️过滤器
│       │   │   └── resources
│       │   │       ├── application.yml       ❣️核心配置类,需要改配置
│       │   │       ├── static
│       │   │       └── templates

156 directories, 103 files

```

