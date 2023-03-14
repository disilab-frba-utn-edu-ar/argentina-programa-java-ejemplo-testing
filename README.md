# Ejemplo testing
Repositorio con ejemplos básicos sobre tests unitarios.

## Estructura de proyecto
```
├── README.md
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── argentinaprograma
    │               └── testing
    │                   └── Calculadora.java
    └── test
        └── java
            └── com
                └── argentinaprograma
                    └── testing
                        └── CalculadoraTest.java
```

La clase a testear unitariamente será Calculadora. La misma tiene definidos 3 métodos estáticos que son:

- Integer sumar(Integer numero1, Integer numero2)
- Integer dividr(Integer numero1, Integer numero2)
- boolean esMayorQue(Integer numero1, Integer numero2)

## Dependencias
Las dependencias de testeo unitario utilizadas, que se pueden ver en el pom.xml, son:

-  [junit-jupiter-engine](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine)
     ~~~ xml 
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.2.0</version>
    </dependency>
     ~~~

-   [junit-platform-runner](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-runner)
    ~~~ xml 
    <dependency>
        <groupId>org.junit.platform</groupId>
        <artifactId>junit-platform-runner</artifactId>
        <version>1.2.0</version>
    </dependency>
     ~~~


## Métodos de testing
En el ejemplo presente se hizo uso de 3 métodos de la librería de junit:

- assertEquals: este método recibe como primer parámetro el valor esperado y como segundo, el valor obtenido por el método que se está testeando unitariamente. Soporta todos los tipos primitivos de Java. Como su nombre indica, validará que ambos parámetros sean iguales.

- assertThrows: recibe como parámetros la clase de la expeción que se espera recibir y un ejecutable, en ese orden. Validará que al ejecutar la función a testear unitariamente se lance la excepción esperada.

- assertTrue: validará que el parámetro, booleano, recibido sea true.

Junit ofrece otros métodos. Por ejemplo, ofrece assertArrayEquals cuyo comportamiento es similar al assertEquals previamente mencionado. La diferencia será que permite recibir como parámetros arrays de tipos primitivos.

Al igual que assertTrue, existe un assertFalse.

En esta [documentación](https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html) encontrarán más métodos existentes y su correspondiente detalle.