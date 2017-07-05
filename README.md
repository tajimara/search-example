# README #

1) 
개발 환경

RDBMS : 

  IP - 192.168.0.164

  PORT - 3306

  DB NAME - spacedb

  USER - space_user

#JNDI-


```
#!xml

<Resource name="jdbc/space_connect" auth="Container"
              type="javax.sql.DataSource" driverClassName="com.mysql.jdbc.Driver"
              url="jdbc:mysql://192.168.0.164:3306/spacedb?useUnicode=yes&amp;characterEncoding=UTF-8&amp;autoReconnect=true"
              username="space_user" password="*****" maxActive="100" maxIdle="10"
              maxWait="-1" testOnBorrow="true" validationQuery="select 1"/>
```

WEB - WAS

아파치

  IP : 192.168.0.102
   
  PORT : 80

톰캣

  IP : 192.168.0.164

  PORT : 8080

DOMAIN
http://dev.searchspace.io

혹시 안되면 호스트 박고 하면 됨 
192.168.0.102 dev.searchspace.io


2) 
운영 환경

#커밋 규칙
1번째 줄 : @이름: 커밋 내의 변경 내용을 요약

2번째 줄 : 빈 칸

3번째 줄 : 변경한 이유