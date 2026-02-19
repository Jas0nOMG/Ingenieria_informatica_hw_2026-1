

## 1. ¿Cuál es la diferencia entre entrada y salida en un programa?

* **Entrada (Input):** Son los datos que el programa recibe para procesar.
    * *Ejemplo:* Asignaciones directas (`firstNum = 4`) o lectura de datos del usuario mediante la clase `Scanner` (ej. `console.nextInt()`).
* **Salida (Output):** Son los resultados que el programa envía al exterior
    * *Ejemplo:* Uso del objeto `System.out` y sus métodos `print` o `println`.

## 2. ¿Por qué es importante declarar correctamente el tipo de una variable?

Es crucial por razones de **sintaxis** y **semántica**:
* **Métodos de entrada:** Define qué método del `Scanner` usar (ej. `nextInt` vs `nextDouble`).
* **Comportamiento de operaciones:** Determina cómo se evalúan las expresiones. Dos expresiones idénticas pueden dar resultados diferentes según el tipo de dato.
* **Prevención de errores:** Permite al compilador detectar intentos de asignar valores incompatibles antes de ejecutar el programa.

## 3. Explica con tus palabras qué es una clase y qué es un método

| Concepto | Definición |
| :--- | :--- |
| **Clase** | Es la unidad básica o "plantilla" en Java. Agrupa operaciones relacionadas y definiciones de tipos de datos. Todo programa en Java es una colección de una o más clases. |
| **Método** | Es un conjunto de instrucciones diseñadas para realizar una **tarea específica**. Es la "acción" que ocurre dentro de la clase (ej. `pow` para calcular potencias). |

## 4. ¿Qué problema resuelve el uso de packages?

Los **packages** (paquetes) resuelven la limitación de las operaciones nativas de Java.
> Dado que Java define pocas operaciones explícitas, los paquetes agrupan **colecciones de clases y librerías** relacionadas (como `java.util` o `java.lang`) que proveen herramientas pre-construidas necesarias para desarrollar programas complejos.

## 5. Menciona dos reglas de estilo que mejoren la legibilidad del código

1.  **Uso de líneas de indicación:**
    * Incluir mensajes claros antes de solicitar una entrada (ej. *"Por favor ingrese un número"*). Esto evita que el usuario se confunda ante un cursor parpadeante sin instrucciones.
2.  **Indentación y Formato:**
    * Estructurar el código con sangrías y saltos de línea lógicos. Aunque el compilador entiende el código sin formato, la indentación adecuada hace que el programa sea legible y mantenible para los humanos.
