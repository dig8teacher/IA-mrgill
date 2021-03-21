FROM adoptopenjdk/openjdk11:latest
WORKDIR /
ADD automobile.jar automobile.jar
EXPOSE 8080
CMD java -jar automobile.jar

