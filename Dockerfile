FROM openjdk:11-oracle
COPY /build/libs/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
COPY docker-entrypoint.sh /
RUN chmod +x docker-entrypoint.sh
ENTRYPOINT ["bash", "docker-entrypoint.sh"]
EXPOSE 8081
