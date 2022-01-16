FROM openjdk:11-oracle
COPY demo-0.0.1-SNAPSHOT.jar /
COPY docker-entrypoint.sh /
RUN cp chmod +x docker-entrypoint.sh
ENTRYPOINT ["bash", "docker-entrypoint.sh"]
EXPOSE 8081
