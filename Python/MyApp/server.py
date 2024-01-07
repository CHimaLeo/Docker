from http.server import SimpleHTTPRequestHandler
from socketserver import TCPServer

class HolaMundoHandler(SimpleHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()
        self.wfile.write(b'Hola Mundo desde Python')

if __name__ == "__main__":
    puerto = 3001
    with TCPServer(("", puerto), HolaMundoHandler) as httpd:
        print(f"Servidor en ejecución en el puerto {puerto}")
        httpd.serve_forever()
