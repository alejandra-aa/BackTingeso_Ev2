FROM openjdk:11-oracle
COPY docker-entrypoint.sh /
RUN cp chmod +x docker-entrypoint.sh
ENTRYPOINT ["bash", "docker-entrypoint.sh"]
EXPOSE 8081
