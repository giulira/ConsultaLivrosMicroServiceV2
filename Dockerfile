FROM java:openjdk-8-alpine


WORKDIR /app


COPY ./target/consultaLivros-micro-servico.jar /app/consultaLivros-micro-servico.jar

EXPOSE 8181

CMD java -jar /app/consultaLivros-micro-servico.jar
