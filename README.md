# dubbo
spring+maven+dubbo整合
spring版本：4.2.5.RELEASE
dubbo版本：2.5.3
zookeeper版本：3.4.8

此版本为Tomcat容器启动的时候自动启动服务

并且模拟启动客户端，也即是消费者

dubbo_api 是发布的服务纯接口
dubbo_service 是接口的服务类
dubbo_provider 主要是用来加载和注册服务的配置文件
dubbo_customer 也就是上面所有的服务调用端，消费者，consumer