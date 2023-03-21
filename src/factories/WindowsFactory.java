package factories;

import button.Button;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
    	return new WindowsButton();
    }
    @Overrride
    public Checkbox createCheckbox() {
    	return new WindowsCheckbox();
    }
}
// O código apresentado define uma classe chamada "WindowsFactory" que implementa a interface "GUIFactory". Essa classe é responsável por criar objetos 

de interface do usuário específicos do sistema operacional Windows.

A classe "WindowsFactory" possui dois métodos que implementam os métodos abstratos definidos na interface "GUIFactory": "createButton()" e "createCheckbox()". 
    Ambos os métodos retornam objetos que implementam as interfaces "Button" e "Checkbox", respectivamente.

O método "createButton()" retorna um objeto "WindowsButton", que é específico do sistema operacional Windows. Isso garante que o botão criado tenha uma aparência 
e comportamento coerentes com outros componentes de interface do usuário em um sistema Windows.

O método "createCheckbox()" retorna um objeto "WindowsCheckbox", que também é específico do sistema operacional Windows. Isso garante que a caixa de seleção 
criada tenha uma aparência e comportamento coerentes com outros componentes de interface do usuário em um sistema Windows.

Essa abordagem de criar fábricas de interface do usuário para cada sistema operacional permite que aplicativos sejam criados de maneira portátil, pois cada
fábrica é responsável por criar objetos de interface do usuário que são específicos do sistema operacional em que o aplicativo está sendo executado. Isso ajuda
a garantir que o aplicativo pareça e funcione de maneira consistente em diferentes plataformas.







