# Usa la imagen oficial de Python como base
FROM python:3.10.12

# Establece el directorio de trabajo en /app
WORKDIR /usr/src/app

# Copia el archivo Python al contenedor
COPY server.py .

# Expone el puerto en el que la aplicación se ejecuta
EXPOSE 3001

# Define el comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["python", "server.py"]
