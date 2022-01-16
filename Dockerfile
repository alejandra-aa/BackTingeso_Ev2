FROM openjdk:11-oracle
ENV ARTIFACT_NAME=demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT exec java -jar ${ARTIFACT_NAME}
WORKDIR /var/lib/jenkins/workspace/Tingeso/demo
COPY demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar
EXPOSE $PORT
