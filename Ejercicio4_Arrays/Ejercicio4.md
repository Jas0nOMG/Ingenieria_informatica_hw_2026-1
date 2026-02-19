# Ejercicio 4: Depuración de Código (Debugging)

## Identificación de Errores

1.  **Excepción de Índice (`IndexOutOfBoundsException`)**:
    * *Código original:* `lista.get(3)`
    * *Causa:* La lista solo tiene 3 elementos (índices 0, 1 y 2). El índice 3 no existe.
    * *Solución:* Se corrigió accediendo a un índice válido o verificando el tamaño antes de acceder.

2.  **Límite del Bucle `for`**:
    * *Código original:* `i <= lista.size()`
    * *Causa:* Los índices en Java van de `0` a `size - 1`. Al usar `<=` el bucle intenta acceder a `lista.get(size)`, lo cual provoca un error.
    * *Solución:* Se cambió la condición a `i < lista.size()`.

3.  **Método de Tamaño Incorrecto**:
    * *Código original:* `lista.length()`
    * *Causa:* Los `ArrayList` no tienen una propiedad o método `length()`. `length` es para arreglos (arrays) nativos y `length()` para Strings.
    * *Solución:* Se reemplazó por el método correcto: `lista.size()`.
