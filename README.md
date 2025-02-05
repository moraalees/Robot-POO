# Robot-POO
***Descripción ¿Dónde está R2D2?***
Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cuadrícula representada por los ejes "x" e "y".

El robot comienza en la coordenada (0, 0).
Para indicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos) que indican la secuencia de pasos a dar. Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene, luego 5, se detiene, y finalmente 2. El resultado en este caso sería (x: -5, y: 12)
Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
Los primeros pasos los hace en el eje "y". Interpretamos que está mirando hacia la parte positiva del eje "y".
El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos gira 90 grados en el sentido contrario a las agujas del reloj.
No te olvides lo aprendido en las primeras unidades. Estructura condicionales, repetitivas, comentarios, etc.

Tras los siguientes movimientos:
```
[10, 5, -2]
[0, 0, 0]
[]
[-10, -5, 2]
[-10, -5, 2, 4, -8]
```
Las salidas son estas:
```
x: -5, y: 12, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEY
x: 5, y: -12, direction: POSITIVEX
x: 9, y: -20, direction: NEGATIVEX
```
# PARTE 1
Crear una versión del programa ¿Dónde está R2D2?, pero ORIENTADO A OBJETOS.

La clase Robot debe tener 4 propiedades: nombre, posX, posY y direccion. También tendrá un comportamiento por medio de 3 métodos: mover(), obtenerPosicion() y obtenerDireccion().

El método mover() debe recibir un array de elementos enteros y no retornará nada, ya que los cambios quedarán almacenados en las propiedades del mismo.

El método obtenerDireccion() no recibe parámetros y retorna una cadena de caracteres con la dirección PositiveX, NegativeX, PositiveY o NegativeY. (Posible mejora con enum class Enum classes)

El método obtenerPosicion() debe devolver la posición. Ejemplo: (10, -5).

Describe la posición actual del robot en el método toString(). (Pulsa Ctrl+o) Ejemplo: R2D2 está en (10, -5) PositiveX

Un objeto de la clase Robot debe inicializarse siempre en la posición (0, 0) y la dirección eje Y positivo (hacia arriba) PositiveY cuando se instancia. En esta versión ya no va a moverse siempre desde la posición (0,0), sino que lo hará desde la última posición y dirección dónde se quedó al realizar su último movimiento.

En este programa, vamos a realizar los mismos movimientos, pero el robot comenzará cada movimiento en la posición final después de realizar el movimiento anterior.

En el main debes crear un objeto de Robot (o una variable de tipo Robot) con el nombre R2D2. El nombre de la variable que utilices para crearlo puede ser robot1.

La clase Robot debe obligar a introducir un nombre que no esté vacío.

Cread los movimientos en un array de arrays y recorrerlos para realizar en cada iteración los movimientos del robot y mostrar la posición del mismo al finalizar cada uno. En cada iteración del bucle llamaremos al método mover() y mostraremos por consola el contenido del robot, es decir, el método toString().

Un ejemplo de una estructura que podéis utilizar para los movimientos sería la siguiente:
```
[
   [1, -5, 0, -9],
   [3, 3, 5, 6, 1, 0, 0, -7],
   [2, 1, 0, -1, 1, 1, -4],
   [],
   [3, 5]
]
```
La salida correcta del programa sería la siguiente:
```
R2D2 está en (-4, 1) PositiveY
R2D2 está en (-8, 0) PositiveY
R2D2 está en (-11, 7) PositiveX
R2D2 está en (-11, 7) PositiveX
R2D2 está en (-8, 12) NegativeX
```
# PARTE 2
Crear varios robots en una estructura de datos.

Los robots serán R2D2, DAW1A, DAW1B y DAM1.

***RETO***: En la clase Robot debéis realizar una modificación para que la clase reciba una función tipo que modifique la dirección del mismo según la info siguiente:

R2D2 sigue igual, comienza en (0, 0) y PositiveY cuando se instancia el objeto y realiza un giro de -90º al detenerse en cada movimiento.

DAW1A comienza en una posición aleatoria entre -5 y 5 para x y en el eje y en 0. La dirección será PositiveX. Al detenerse, si su valor de la posición x es positiva gira 180º y si su valor de la posición x es negativa gira 90º.

DAW1B comienza en la posición x = 0, pero la posición y es aleatoria entre -10 y 10. Su dirección inicial será aleatoria. La dirección que toma al detenerse será -90º si el valor de su posición y es positivo y 270º si el valor de su posición y es negativo.

DAM1 comienza en en una posición aleatoria entre -5 y 5 en cada eje. La dirección inicial es aleatoria. Debe tomar una también una dirección totalmente aleatoria al detenerse entre cada movimiento, siempre que no sea la misma en la que estaba.

Si no sois capaces de realizar estos cambios pasándole una función como parámetro a la clase, podéis realizarlo de otra forma (con sentido), pero que cada robot tenga el comportamiento que se indica al moverse con la dirección.

El programa debe pedirme un número de movimientos por consola y ejecutar esos movimientos con todos los robots, indicando su posición y dirección final. Los movimientos deben ser números enteros comprendidos entre -20 y 20.
