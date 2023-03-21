package factories;

import button.Button;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
    	return new MacOSButton();
    }
    @Override
    public Checkbox createCheckbox() {
    	return new MacOSCheckbox();
    }
    
}
//O código apresentado define uma classe chamada "MacOSFactory" que implementa a interface "GUIFactory". Essa classe é responsável por criar objetos de interface
do usuário específicos do sistema operacional MacOS.

A classe "MacOSFactory" possui dois métodos que implementam os métodos abstratos definidos na interface "GUIFactory": "createButton()" e "createCheckbox()". Ambos
os métodos retornam objetos que implementam as interfaces "Button" e "Checkbox", respectivamente.

O método "createButton()" retorna um objeto "MacOSButton", que é específico do sistema operacional MacOS. Isso garante que o botão criado tenha uma aparência e 
comportamento coerentes com outros componentes de interface do usuário em um sistema MacOS.

O método "createCheckbox()" retorna um objeto "MacOSCheckbox", que também é específico do sistema operacional MacOS. Isso garante que a caixa de seleção criada 
tenha uma aparência e comportamento coerentes com outros componentes de interface do usuário em um sistema MacOS.

Essa abordagem de criar fábricas de interface do usuário para cada sistema operacional permite que aplicativos sejam criados de maneira portátil, pois cada factory é 
responsável por criar objetos de interface do usuário que são específicos do sistema operacional em que o aplicativo está sendo executado.    Isso ajuda a garantir que o aplicativo pareça e funcione de maneira consistente em diferentes plataformas.
