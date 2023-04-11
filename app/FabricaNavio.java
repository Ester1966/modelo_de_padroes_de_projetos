package app;

public class FabricaNavio implements FabricaTransporte{
    @Override
    public Transporte criarTransporte(){
        return new Navio();
    }
    
}

/* Este código é uma classe Java chamada "FabricaNavio" que estende a classe abstrata "FabricaTransporte". 
A classe possui um único método público "criarTransporte()" que retorna um objeto da classe "Navio", que implementa
a interface "Transporte". Assim como na classe "FabricaCaminhao" que comentei anteriormente, essa classe também

segue o padrão de projeto Factory Method, em que é criada uma fábrica para a criação de objetos da classe "Navio".

O método "criarTransporte()" simplesmente retorna um novo objeto da classe "Navio", que foi instanciado através do operador "new".

Portanto, essa fábrica pode ser utilizada para criar objetos da classe "Navio" de forma padronizada e organizada,
seguindo o mesmo padrão de projeto que a classe "FabricaCaminhao". Como a classe "Navio" implementa a interface
"Transporte", os objetos criados por essa fábrica também podem ser utilizados de forma polimórfica em
situações em que se espera um objeto que implemente a interface "Transporte".*/