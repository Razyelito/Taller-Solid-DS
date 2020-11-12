# Taller-Solid-DS

Literal 1: En las clases de Helado y Pastel habría que hacer modificaciones en cada uno de ellas al querer añadir algo nuevo, al hacerlas depender de una clase padre como Postre, simplemente las subclases implementan los métodos constructores con sus precios respectivos. Con esto se estaria cumpliendo el principio LSP ya que las clases hijas pueden utilizarse como si fueran el padre.

Lieral 2:  la clase OperacionesAderezo realizaba operaciones concretas para las clases Helado y Pastel pero estas operaciones se pueden poner como metodos en la clase Postre.Es decir no se cumple el principio de dependencia

Literal 3: Los metodos calcularPrecioFinal() y showPrecioFinal() deben de estar en otra clase para cumplir con el principio de Abierto Cerrrado OCP. Con esto quiero decir que si existe algun cambio en el calculo, solo se tendria que modificar el metodo en una clase y no en varias como se tenia anteriormente.
