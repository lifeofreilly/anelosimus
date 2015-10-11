FROM java:8

RUN mkdir /anelosimus
WORKDIR /anelosimus
ADD target/artifacts /anelosimus

EXPOSE 9080
EXPOSE 9081

CMD java $JAVA_OPTS -Xmx128m -jar anelosimus-1.0-SNAPSHOT.jar server anelosimus.yml