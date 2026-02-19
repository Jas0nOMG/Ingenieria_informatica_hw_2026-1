# Ejercicio 2: Modificación y Eliminación

## Descripción
Este ejercicio explora la mutabilidad de los `ArrayList`, permitiendo cambiar valores y eliminar entradas dinámicamente.

## Pasos Realizados
1. Se llena la lista `numeros` con valores del 1 al 10.
2. Se usa `.set(index, value)` para cambiar el valor en el índice 4.
3. Se usa `.remove(index)` para eliminar el elemento en el índice 2.

## Preguntas de Reflexión
**1. ¿Qué sucede con los índices después de eliminar un elemento?**
Cuando se elimina un elemento, **todos los elementos a su derecha se desplazan una posición hacia la izquierda**. Por ejemplo, si eliminas el índice 2, el elemento que estaba en el índice 3 pasa a ser el nuevo índice 2. Los índices no dejan "huecos".

**2. ¿Cómo cambia el tamaño del ArrayList?**
El tamaño (`size()`) disminuye dinámicamente en 1 cada vez que se llama a `.remove()`. No es necesario redimensionar el arreglo manualmente como en los arrays estáticos.
