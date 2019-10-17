# springbootmybatis
springboot集成Mybatis
1、配置文件pom.xml中加入依赖
2、实体类 User.java
3、在dao中建立BaseMapper.java，建UserMapper.java继承BaseMapper.java
4、在resources中建mapper文件夹建UserMapper.xml
5、在service中建立IBaseService.java建IUserService.java
6、在service.impl包中建立BaseServiceImpl.java建UserServiceImpl.java
7、在controller中建立UserController.java-@PutMapping @DeleteMapping @GetMapping
8、application.properties配置数据库信息及mapper  xml文件位置
9、SpringbootApplication.java文件运行
10、单元测试
