package main

import (
	"fmt"
	"net/http"
)

func holaMundoHandler(w http.ResponseWriter, r *http.Request) {
	fmt.Fprint(w, "Hola Mundo desde GO!")
}

func main() {
	http.HandleFunc("/", holaMundoHandler)
	puerto := 3002
	fmt.Printf("Servidor en funcionamiento en http://localhost:%d\n", puerto)
	http.ListenAndServe(fmt.Sprintf(":%d", puerto), nil)
}
