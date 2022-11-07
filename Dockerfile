FROM openjdk:11

RUN mkdir /app

COPY src/com/rgfDev/ /app

WORKDIR /app

CMD java Main.java
