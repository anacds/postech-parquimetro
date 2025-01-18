FROM openjdk:17-jdk-slim
WORKDIR /app
COPY parquimetro/target/parquimetro-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
# Usar uma imagem base com o OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado pelo Maven para o diretório de trabalho
COPY target/parquimetro-0.0.1-SNAPSHOT.jar app.jar

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
