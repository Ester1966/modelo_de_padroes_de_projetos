package app;

public interface FabricaTransporte {
        Transporte criarTransporte();
    
}

/* Este código é uma interface Java chamada "FabricaTransporte" que define um único método público "criarTransporte()",
que retorna um objeto que implementa a interface "Transporte".

Essa interface pode ser utilizada para definir um contrato com as classes que a implementam. Ao implementar essa interface,
a classe deve obrigatoriamente implementar o método "criarTransporte()" com o mesmo nome, tipo de retorno e lista de 
argumentos definidos na interface.

O método "criarTransporte()" é um método de fábrica que deve ser implementado pelas classes que implementam a interface
"FabricaTransporte". Esse método é responsável por criar um objeto que implementa a interface "Transporte", que geralmente é uma classe que representa um meio de transporte, como um caminhão, um navio ou um avião.

Assim, essa interface pode ser utilizada como uma abstração para diferentes fábricas de transporte, que podem criar
objetos diferentes que implementam a interface "Transporte". Essa abstração permite que diferentes tipos de transporte 
possam ser criados de forma padronizada, seguindo um padrão de projeto conhecido como Abstract Factory (Fábrica Abstrata).*/
