- Consulta Veterinaria

Este sistema simula una consulta veterinaria 

- Diseño de Clases

1. Clase Abstracta: `Mascota`
- Define un método abstracto "hacerSonido()" que es implementado por cada tipo de mascota.
- Contiene el método `descansar()` que es comun en todas las mascotas.

2. Interfaces
- `AtencionEspecial`: que representa mascotas que requieren cuidados específicos.
- `Vacunable`: son las mascotas que pueden recibir vacunas.

3. Clases Concretas
- `Perro`: hereda de `Mascota` y tambien "implementa Vacunable".
- `Gato`: hereda de `Mascota`.
- `Conejo`: hereda de `Mascota` y tambien "implementa AtencionEspecial".
- `Tortuga`: hereda de `Mascota`.

-Principios Aplicados

1 Herencia y Polimorfismo
Se utiliza una clase abstracta base "Mascota" y todas las demás clases heredan de ella, sobrescribiendo el comportamientos según les corresponda.

2 Principio de Sustitución de Liskov
Se usa una lista de tipo `Mascota`, pero se almacenan objetos de sus subclases (Perro, Gato, etc.). Esto permite recorrer la lista e invocar métodos de manera polimórfica.

3 Uso de @Override
Todos los métodos sobrescritos en subclases e interfaces están correctamente anotados con "@Override" para garantizar que se están sobrescribiendo adecuadamente.

4 Uso Controlado de "instanceof"
Solo se usa "instanceof" cuando es necesario verificar si una mascota puede:
- Recibir atención especial (AtencionEspecial)
- o ser vacunada (Vacunable)

