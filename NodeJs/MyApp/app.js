const express = require('express');
const app = express();
const puerto = 3000;

app.get('/', (req, res) => {
    res.send('Hola Mundo desde Node JS');
});

app.listen(puerto, () => {
    console.log(`Servidor en funcionamiento en http://localhost:${puerto}`);
});
