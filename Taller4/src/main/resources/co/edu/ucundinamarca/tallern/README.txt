
¿Que son los iteradores en java?

Es una abstracción sobre el concepto de bucle. La idea es tener una interfaz única que te permita recorrer cualquier estructura de datos de exactamente la misma forma, sin importar los detalles internos de la misma.
La idea aquí es que le solicites a tu estructura de datos que genere una nueva instancia de tipo iterador y luego hagas un bucle sobre este.
Es un patrón de diseño utilizado para recorrer las colecciones. En java es una interfaz denominada Iterador. Esta formado por 3 métodos.

1.	boolean hasNext(): retorna true en caso de haber más elementos y false en caso de llegar al final de iterator
2.	Object next(): retorna el siguiente elemento en la iteración
3.	void remove(): remueve el último elemento devuelto por la iteración

¿Como podríamos recorrer un colección en java sin la ayuda de in iterador?

La mayoría de las colecciones almacena sus elementos en simples listas, pero algunas de ellas se basan en pilas, árboles, grafos y otras estructuras complejas de datos.
Independientemente de cómo se estructure una colección, debe aportar una forma de acceder a sus elementos de modo que otro código pueda utilizar dichos elementos. Debe haber una forma de recorrer cada elemento de la colección sin acceder a los mismos elementos una y otra vez.
