# Hub Central de Dispositivos Inteligentes

## Descripción

Este programa implementa un sistema de control para dispositivos inteligentes mediante una central (`hubCentral`). La central permite registrar dispositivos y ejecutar un **modo noche**, apagando automáticamente los dispositivos que estén conectados.

## Funcionamiento

### `dispositivoInteligente`

Representa un dispositivo inteligente.

Atributos:

* `nombre`: identifica el dispositivo.
* `encendido`: indica si está encendido.
* `conectado`: indica si está conectado a la central.

Métodos principales:

* `encender()`: enciende el dispositivo.
* `apagar()`: apaga el dispositivo.
* `configurar()`: permite configurar el dispositivo con un parámetro.
* `setConectado()`: modifica el estado de conexión.
* `getNombre()` e `isConectado()`: permiten consultar información del dispositivo.

### `hubCentral`

Representa la central que administra los dispositivos.

La clase utiliza una lista de objetos `dispositivoInteligente` para almacenar los dispositivos registrados.

Métodos principales:

* `agregarDispositivo()`: incorpora un dispositivo a la central.
* `activarModoNoche()`: recorre todos los dispositivos y los apaga si están conectados. Si un dispositivo está desconectado, informa que no puede recibir el comando y continúa con el siguiente.

## Ejemplo

<img width="526" height="477" alt="image" src="https://github.com/user-attachments/assets/f24aeee8-06d7-458d-ba55-3004a3b218c7" />

## Conceptos utilizados

* Clases y objetos
* Encapsulamiento
* Constructores
* Atributos privados
* Métodos
* Getters y setters
* `boolean`
* `ArrayList`
* `List`
* Colecciones de objetos
* `for` para recorrer una lista
* Condicionales `if`
* `continue`
* Relaciones entre clases
