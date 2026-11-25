# Guía de estudio: programar desde cero con Java

Punto de partida: **cero experiencia en programación**. Nada se da por sabido.
Profesor: Claude. Idioma: español.

## Método (cada tema)
1. **Idea** en lenguaje cotidiano, con una analogía.
2. **Ejemplo** pequeño que ves funcionar.
3. **Predice**: antes de ejecutar, escribes en papel qué crees que pasará.
4. **Ejercicio** que escribes tú (sin copiar).
5. **Revisión**: te señalo pistas, no la solución completa.
6. **Mini-examen oral**: me explicas con tus palabras qué hace tu código.

Regla de oro: *primero piensa en papel, después escribe código.*
Marca cada tema con [x] solo cuando puedas explicárselo a otra persona.

---

## Módulo 0: Pensar como programador (lógica)
Sin ordenador al principio. Es la base de todo lo demás.
- [ ] Qué es un programa: una receta de pasos exactos que obedece una máquina literal
- [ ] Algoritmo: descomponer un problema en pasos pequeños (ej. hacer un té, ordenar 3 cartas)
- [ ] Entrada → proceso → salida
- [ ] Secuencia: el orden de los pasos importa
- [ ] Decisiones: "si pasa esto, haz aquello, si no, lo otro"
- [ ] Repetición: "mientras pase esto, sigue haciendo aquello"
- [ ] Variables como cajas con nombre que guardan un valor
- [ ] **Traza a mano**: ejecutar un algoritmo en papel con una tabla de valores
- [ ] Pseudocódigo: escribir el algoritmo en español antes de programar
- **Ejercicios (papel):** algoritmo para decidir si un número es par; para encontrar el mayor de 3 números; para contar hasta 10; para adivinar un número del 1 al 100 en el mínimo de intentos (búsqueda binaria, sin nombre técnico todavía)

## Módulo 1: Primeros pasos con Java
- [ ] Qué es Java y qué hace el compilador (traduce tu texto a algo que la máquina ejecuta)
- [ ] Instalar el JDK; verificar con `java -version` y `javac -version`
- [ ] Anatomía de un programa: `class`, `main`, llaves `{ }`, punto y coma `;`
- [ ] Compilar y ejecutar (`javac` / `java`)
- [ ] Leer un mensaje de error del compilador (los errores son pistas, no castigos)
- [ ] `System.out.println` y `print`
- [ ] Comentarios
- **Ejercicio:** Hola mundo con tu nombre; luego provoca 3 errores a propósito y léelos

## Módulo 2: Variables y tipos de datos
- [ ] Variable: declarar, asignar, cambiar el valor
- [ ] Tipos: `int` (enteros), `double` (decimales), `boolean` (verdadero/falso), `char` (un carácter)
- [ ] `String` (texto) y métodos básicos: `length`, `toUpperCase`, `charAt`
- [ ] Operadores aritméticos: `+ - * / %` (el módulo `%` es clave para la lógica)
- [ ] División entera vs. decimal (trampa típica)
- [ ] Operadores de comparación (`== != < > <= >=`) y lógicos (`&& || !`)
- [ ] Leer datos del usuario con `Scanner`
- **Ejercicios:** área de un rectángulo; convertir °C a °F; calculadora de dos números; separar horas y minutos de un total de minutos usando `/` y `%`

## Módulo 3: Decisiones (`if`, `switch`)
- [ ] `if` / `else`
- [ ] `else if` encadenado
- [ ] Condiciones compuestas con `&&` y `||`
- [ ] `switch`
- [ ] Tablas de verdad (cuándo es `true` un `&&` y un `||`)
- **Ejercicios:** par o impar; mayor de 3 números; año bisiesto; calificación numérica → letra; piedra-papel-tijera entre dos entradas

## Módulo 4: Repetición (bucles)
- [ ] `while`
- [ ] `for` (cuándo usar cada uno)
- [ ] `do-while`
- [ ] `break` y `continue`
- [ ] Contadores y acumuladores (sumar, contar, buscar el mayor)
- [ ] Bucles dentro de bucles (anidados)
- [ ] Bucle infinito: por qué ocurre y cómo evitarlo
- **Ejercicios:** tabla de multiplicar; suma del 1 al N; factorial; contar dígitos de un número; número primo; triángulo de asteriscos; **adivina el número** (el que ya empezaste: lo retomamos aquí con la lógica ya sólida)

## Módulo 5: Métodos (dividir el problema)
- [ ] Qué es un método: una receta con nombre que puedes reutilizar
- [ ] Parámetros (entradas) y valor de retorno (salida)
- [ ] `void` vs. métodos que devuelven algo
- [ ] Alcance de variables (dónde "vive" cada variable)
- [ ] Sobrecarga de métodos
- [ ] Descomponer un programa grande en métodos pequeños
- **Ejercicios:** `esPar(n)`, `maximo(a, b)`, `esPrimo(n)`, `factorial(n)`; refactorizar el juego de adivinar usando métodos

## Módulo 6: Arrays (listas de valores)
- [ ] Qué es un array, índices desde 0
- [ ] Crear, leer y modificar elementos
- [ ] Recorrer con `for` y con `for-each`
- [ ] Errores típicos: `ArrayIndexOutOfBoundsException`
- [ ] Algoritmos clásicos: sumar, máximo/mínimo, buscar, invertir
- [ ] Ordenar a mano (burbuja) para entender cómo piensa un algoritmo
- [ ] Arrays bidimensionales (tablas)
- **Ejercicios:** promedio de notas; invertir un array; contar repetidos; ordenar; tres en raya (matriz 3x3)

## Módulo 7: Programación orientada a objetos
- [ ] Idea: modelar cosas del mundo real (un `Perro`, una `Cuenta`)
- [ ] Clases, objetos, atributos, constructores
- [ ] Métodos de un objeto y `this`
- [ ] Encapsulamiento (`private`, getters/setters)
- [ ] Herencia y `super`
- [ ] Polimorfismo, clases abstractas, interfaces
- **Ejercicio:** sistema de cuentas bancarias

## Módulo 8: Colecciones y errores
- [ ] `ArrayList`, `HashMap`, `HashSet`
- [ ] Genéricos (introducción)
- [ ] Excepciones: `try` / `catch` / `finally`, `throw`, `throws`
- [ ] Lectura y escritura de archivos
- **Ejercicio:** agenda de contactos

## Módulo 9: Java moderno
- [ ] Lambdas y Streams
- [ ] `Optional`
- [ ] Records y `var`

## Módulo 10: Proyecto final
- [ ] App de consola (gestor de tareas o biblioteca) que use todo lo anterior
- [ ] Introducción a Maven y a pruebas con JUnit

## Recursos de apoyo
- Documentación oficial: https://dev.java
- Curso gratuito MOOC Java (Universidad de Helsinki)
- Practicar: ejercicios en HackerRank o Exercism (pista de Java)

---

## Progreso
- 2026-11-16: guía reescrita desde cero. Se conserva `Adivina.java` como borrador; se retomará en el Módulo 4.
