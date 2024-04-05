FROM eclipse-temurin:17
ENV TZ=Asia/Seoul
EXPOSE 7070
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=dev"]
