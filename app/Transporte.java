package app;

public interface Transporte {
    void entregar ();
    
    
}

/* Este código é uma interface Java chamada "Transporte" que define um único método público "entregar()", que
não possui implementação e não retorna nenhum valor.

Essa interface é utilizada para definir um contrato que as classes que a implementam devem seguir. Ao implementar
essa interface, a classe deve obrigatoriamente implementar o método "entregar()" com o mesmo nome e lista de argumentos 
definidos na interface.

O método "entregar()" é um método que deve ser implementado pelas classes que implementam a interface "Transporte". 
Esse método é responsável por realizar a entrega de alguma carga ou produto utilizando o meio de transporte específico 

que a classe representa, 
como um caminhão, um navio ou um avião.

Assim, essa interface pode ser utilizada como uma abstração para diferentes tipos de transporte, permitindo que 
diferentes implementações da interface possam ser utilizadas de forma polimórfica em situações em que se espera um objeto
que implemente a interface "Transporte".*/