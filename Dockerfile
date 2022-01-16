FROM openjdk:11-oracle
ENV ARTIFACT_NAME=demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT exec java -jar ${ARTIFACT_NAME}
WORKDIR /BackTingeso_Ev2/demo
COPY demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar
EXPOSE $PORT
