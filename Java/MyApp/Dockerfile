# Usa la imagen oficial de OpenJDK como base
FROM openjdk:11

# Establece el directorio de trabajo en /app
WORKDIR /usr/src/app

# Copia los archivos locales al directorio de trabajo en la imagen
COPY . .

# Expone el puerto en el que la aplicación se ejecuta
EXPOSE 3003

# Define el comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "Main"]