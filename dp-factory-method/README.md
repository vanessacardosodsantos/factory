# Factory Method
### IVehicle — Interface  
* Product: Esta é uma interface para criar os objetos.

### Car, Bike e Moto — ConcreateProduct
* ConcreteProduct: Esta é uma classe que implementa a interface do produto.

### Creator
* Creator: Esta é uma classe abstrata e declara o método factory, que retorna um objeto do tipo Product.


### Concreate Creator
* ConcreteCreator: Esta é uma classe que implementa a classe Creator e substitui o método factory para retornar uma instância de um ConcreteProduct.