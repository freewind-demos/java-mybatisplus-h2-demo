Java MyBatisPlus H2 Demo
==============================

MyBatisPlus可以简化CRUD，自动提供一些相应方法，不用每个都手写SQL

```
brew install httpie
./mvnw package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

```
http POST http://localhost:8099/api/messages text=aaa
http POST http://localhost:8099/api/messages text=bbb

http POST http://localhost:8099/api/messages text=aa##bb

http GET http://localhost:8099/api/messages

http GET http://localhost:8099/api/messages/0
```

Then

```
http://localhost:8099/h2
```

with

```
JDBC_URL: jdbc:h2:mem:demo
USER NAME: sa
PASSWORD: sa
```
