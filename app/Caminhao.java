package app;

public class Caminhao implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entregando por caminhão....");
    }
    
}
/*Este código é uma classe Java chamada "Caminhao" que implementa a interface "Transporte". 
A classe possui um único método público "entregar()" que, quando chamado, imprime no console a
mensagem "Entregando por caminhão....".

A interface "Transporte" provavelmente é uma interface que define um método "entregar()" que
deve ser implementado por todas as classes que a utilizam. Isso significa que, ao implementar
a interface "Transporte", a classe "Caminhao" deve obrigatoriamente implementar o método "entregar()"
com o mesmo nome, tipo de retorno e lista de argumentos definidos na interface.

No caso específico da classe "Caminhao", o método "entregar()" simplesmente imprime uma mensagem
no console indicando que a entrega está sendo feita por caminhão.

Assim, essa classe pode ser utilizada para representar um caminhão que realiza entregas, e sua implementação
da interface "Transporte" permite que objetos dessa classe possam ser utilizados de forma polimórfica em situações
em que se espera um objeto que implemente a interface "Transporte".*/