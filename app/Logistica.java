package app;

import app.FabricaTransporte;
import app.FabricaNavio;
import app.FabricaCaminhao;

        public class Logistica {
    public static void main(String[] args) {
        FabricaCaminhao fabricaCaminhao = new FabricaCaminhao();
        FabricaTransporte fabricaNavio = new FabricaNavio();

        Transporte caminhao = fabricaCaminhao.criarTransporte();
        caminhao.entregar();

        Transporte navio = fabricaNavio.criarTransporte();
        navio.entregar();
    }
}
    
    
/* Este código é uma classe Java chamada "Logistica" que contém um método "main" responsável por instanciar duas
fábricas de transporte, "FabricaCaminhao" e "FabricaNavio", e criar objetos que implementam a interface "Transporte" 
a partir dessas fábricas.

Primeiramente, a classe cria uma instância da fábrica de caminhões, "FabricaCaminhao", e uma instância da fábrica de navios,
"FabricaNavio".

Em seguida, a classe utiliza a fábrica de caminhões para criar um objeto que implementa a interface "Transporte"
através do método "criarTransporte()", e armazena esse objeto em uma variável chamada "caminhao".

A seguir, a classe chama o método "entregar()" do objeto "caminhao", que exibe uma mensagem na saída padrão indicando 
que a entrega está sendo realizada por um caminhão.

Por fim, a classe utiliza a fábrica de navios para criar outro objeto que implementa a interface "Transporte" através
do método "criarTransporte()", e armazena esse objeto em uma variável chamada "navio". No entanto, não há chamada
ao método "entregar()" para este objeto, então não há indicação de que a entrega está sendo realizada por um navio.*/