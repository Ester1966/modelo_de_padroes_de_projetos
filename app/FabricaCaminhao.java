package app;

import app.Caminhao;
import Caminhao.Caminhao;

public class FabricaCaminhao extends FabricaTransporte {

    FabricaCaminhao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    FabricaCaminhao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    FabricaCaminhao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    FabricaCaminhao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Transporte criarTransporte() {
        return (Transporte) new Caminhao();
    }

}

  /* Este código é uma classe Java chamada "FabricaCaminhao" que estende a classe abstrata "FabricaTransporte".
A classe possui um único método público
"criarTransporte()" que retorna um objeto que implementa a interface "Transporte".

Na implementação deste método, é criado um novo objeto da classe "Caminhao" utilizando o operador "new",
e em seguida é feito um casting para a interface "Transporte", que é o tipo de retorno do método.

Dessa forma, esta classe é responsável por criar objetos da classe "Caminhao" como se fosse uma fábrica de caminhões. 
A classe abstrata "FabricaTransporte" provavelmente define um método abstrato "criarTransporte()" que deve ser implementado
por todas as classes que a estendem. Ao implementar esse método, a classe "FabricaCaminhao" está criando um objeto da classe "Caminhao", que implementa a interface "Transporte".

Assim, essa fábrica pode ser utilizada para criar objetos da classe "Caminhao" de forma padronizada e organizada, seguindo
um padrão de projeto conhecido como Factory Method (Método de Fábrica). */ 