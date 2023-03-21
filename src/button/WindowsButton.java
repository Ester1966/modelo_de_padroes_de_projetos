package button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
    	System.out.println("You have created WindowsButton.");
    }
}

// A classe "WindowsButton" sobrescreve o método "paint()" definido na interface "Button". Dentro do método, há uma instrução que imprime uma mensagem indicando que 
um botão do Windows foi criado.

Essa classe representa uma implementação concreta de um botão para o sistema operacional Windows. Ao chamar o método "paint()" em uma instância de "WindowsButton",
a mensagem "You have created WindowsButton, será exibida na saída padrão do sistema.

Essa implementação do método "paint()" é específica para o botão do Windows, ou seja, a mensagem impressa no console é referente à criação de um botão do Windows.

Ao implementar a interface "Button", a classe "WindowsButton" se compromete a implementar todos os métodos abstratos da interface. Isso é importante porque permite 
que diferentes implementações de botões possam ser criadas e usadas em diferentes partes do código, sem que as implementações específicas precisem ser conhecidas por
essas partes do código.

Em resumo, a classe "WindowsButton" é uma parte importante de um sistema de classes que implementa diferentes tipos de botões para uma interface de usuário, pois 
fornece uma implementação específica para um botão no sistema operacional Windows.
