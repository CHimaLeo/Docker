package main

import (
    "fmt"
    "net/http"
)

func holaMundoHandler(w http.ResponseWriter, r *http.Request) {
    fmt.Fprint(w, "Hola, Mundo!")
}

func main() {
    http.HandleFunc("/", holaMundoHandler)
    puerto := 8080
    fmt.Printf("Servidor en funcionamiento en http://localhost:%d\n", puerto)
    http.ListenAndServe(fmt.Sprintf(":%d", puerto), nil)
}