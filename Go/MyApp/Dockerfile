# Usa la imagen oficial de Go como base
FROM golang:1.18.1
# Establece el directorio de trabajo en /app
WORKDIR /usr/src/app

# Copia los archivos locales al directorio de trabajo en la imagen
COPY . .

# Compila la aplicación
RUN go build -o main

# Expone el puerto en el que la aplicación se ejecuta
EXPOSE 3002

# Define el comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["./main"]
