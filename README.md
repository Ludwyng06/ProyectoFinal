# ProyectoFinal
parcialfinal
# AeropuertoVuelos

Este proyecto es una aplicación Java que gestiona aeropuertos y vuelos. Permite cargar información de aeropuertos y vuelos directamente en el código y mostrar los vuelos de salida y llegada para cada aeropuerto.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- `Main`: Clase principal que ejecuta la aplicación.
- `Aeropuerto`: Representa un aeropuerto con código, nombre, población, país y GMT.
- `Vuelo`: Clase abstracta que representa un vuelo con origen, destino, plazas y duración.
  - `VueloRegular`: Subclase de `Vuelo` para vuelos regulares.
  - `VueloCharter`: Subclase de `Vuelo` para vuelos chárter.
- `Compania`: Representa una compañía aérea.

## Funcionalidad

1. Cargar datos de aeropuertos y vuelos directamente en el código.
2. Mostrar los vuelos de salida y llegada por cada aeropuerto.

## Ejecución

Para ejecutar la aplicación, sigue estos pasos:

1. Compila todas las clases Java:

```sh
javac *.java
