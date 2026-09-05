Arina Tarasova 
2026092894
Programación Orientada a Objetos

Programa Mutante

Descripción

Este proyecto es un ejemplo de Programación Orientada a Objetos (POO) desarrollado en Java. El programa trabaja con personas que pueden tener diferentes profesiones y poderes mutantes.

El ejercicio demuestra conceptos fundamentales de POO como herencia, encapsulamiento, abstracción, polimorfismo y organización mediante paquetes.

Estructura del proyecto

El proyecto está organizado en los siguientes paquetes:

- personas: contiene la clase Persona.
- profesiones: contiene las clases Productor, Pintor y Cantante.
- poderes: contiene la interfaz IPower y las diferentes clases de poderes.
- programaMutante: contiene la clase principal quickstart.

Clases principales

Persona
Es la clase base de las diferentes profesiones. Contiene atributos como nombre, edad, deudas y poder. También incluye métodos para modificar y consultar los datos de una persona y para utilizar su poder.

Productor
Hereda de Persona. Representa la profesión de productor y permite realizar producciones, venderlas y manejar el dinero obtenido.

Pintor
Hereda de Persona. Permite comprar y vender propiedades y llevar el control del dinero invertido.

Cantante
Hereda de Persona. Puede contratar productores y pintores, demostrando relaciones entre diferentes objetos.

IPower
Es una interfaz que representa el comportamiento común de los poderes mutantes. Cada poder implementa el método dispararPoder() de una manera diferente.

Poderes
El programa contiene cinco poderes diferentes:

* Telequinesis
* Telepatía
* Hielo
* Regeneración
* Rayos

Cada poder muestra un mensaje diferente cuando es utilizado.

Conceptos de POO utilizados

Herencia
Las clases Productor, Pintor y Cantante heredan atributos y métodos de Persona.

Encapsulamiento
Los atributos se mantienen privados o protegidos y se utilizan métodos getters y setters para controlar el acceso a los datos.

Abstracción
La interfaz IPower define el comportamiento que deben tener los diferentes poderes sin especificar cómo funciona cada uno internamente.

Polimorfismo
Los diferentes poderes pueden ser tratados mediante el tipo común IPower. Al ejecutar dispararPoder(), cada objeto ejecuta su propia versión del método.

Paquetes
Las clases están organizadas en los paquetes personas, profesiones, poderes y programaMutante para mantener el código organizado.

Ejecución

El programa principal se encuentra en:
src/programaMutante/quickstart.java

Para compilar y ejecutar desde la carpeta src:
javac programaMutante/quickstart.java
java programaMutante.quickstart

El programa crea cinco personas, asigna diferentes profesiones y asigna un poder diferente a cada una. Luego demuestra el funcionamiento del polimorfismo al ejecutar los poderes.

Diagrama de clases
El siguiente diagrama representa las relaciones entre las clases del proyecto, incluyendo herencia, implementación de la interfaz, asociaciones y organización mediante paquetes.

@startuml
package personas {
    class Persona {
        - edad : byte
        # nombre : String
        - deudasAPagar : double
        - power : IPower
        - DEUDA_INICIAL : double
        + Persona()
        + Persona(pEdad : byte, pNombre : String)
        + Persona(pNombre : String, pEdad : byte)
        + Persona(pNombre : String)
        + getNombre() : String
        + setNombre(pNombre : String)
        + getEdad() : byte
        + setEdad(pEdad : byte)
        + reducirDeudaConIngreso(pIngreso : double)
        + cantar()
        + setPower(pPower : IPower)
        + atacar()
    }
}
package profesiones {
    class Productor
    class Pintor
    class Cantante
}
package poderes {
    interface IPower
    class PoderTelequinesis
    class PoderTelepatia
    class PoderHielo
    class PoderRegeneracion
    class PoderRayos
}
package programaMutante {
    class quickstart
}
Persona <|-- Productor
Persona <|-- Pintor
Persona <|-- Cantante
IPower <|.. PoderTelequinesis
IPower <|.. PoderTelepatia
IPower <|.. PoderHielo
IPower <|.. PoderRegeneracion
IPower <|.. PoderRayos
Persona --> IPower
Cantante --> Productor
Cantante --> Pintor
quickstart --> Persona
quickstart --> Productor
quickstart --> Pintor
quickstart --> Cantante
quickstart --> IPower
@enduml