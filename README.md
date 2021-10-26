Java MyBatis H2 Demo
==============================

如何使用MyBatis向h2中添加数据

```
brew install httpie
./mvnw package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

```
http POST http://localhost:8080/api/messages text=aaa
http POST http://localhost:8080/api/messages text=bbb

http POST http://localhost:8080/api/messages text=aa##bb

http GET http://localhost:8080/api/messages

http GET http://localhost:8080/api/messages/0
```

Then

```
http://localhost:8080/h2
```

with

```
JDBC_URL: jdbc:h2:mem:demo
USER NAME: sa
PASSWORD: sa
```
