# 使用 JDK 21 作为基础镜像
FROM openjdk:21-jdk

# 作者信息（可选）
LABEL maintainer="yassinyrj@gmail.com"

# 创建一个工作目录
WORKDIR /app

# 将应用的 JAR 文件复制到容器中
COPY target/docker-spring-demo-0.0.1-SNAPSHOT.jar app.jar

# 暴露应用的端口（替换为你的实际应用端口）
EXPOSE 9876

# 容器启动时执行的命令
ENTRYPOINT ["java", "-jar", "app.jar"]