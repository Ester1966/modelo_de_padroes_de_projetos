package factories;

import button.Button;


public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();

}
//O código apresentado define uma interface chamada "GUIFactory".

A interface "GUIFactory" define dois métodos abstratos: "createButton()" e "createCheckbox()". Ambos os métodos retornam objetos que implementam as interfaces "Button" e "Checkbox", respectivamente.

A ideia por trás dessa interface é que diferentes implementações da interface "GUIFactory" possam ser criadas para criar objetos de diferentes tipos de botões e 
caixas de seleção. Cada implementação da interface "GUIFactory" é responsável por criar uma família de objetos de 
interface do usuário (por exemplo, botões e caixas de seleção) que são coerentes em estilo e comportamento.

Ao criar uma nova implementação da interface "GUIFactory", as classes que usam essa nova implementação podem criar objetos de interface do usuário sem se preocupar
com a implementação específica de botões e caixas de seleção. Em vez disso, a criação desses objetos é delegada à implementação de "GUIFactory", que garante que os 
objetos criados sejam coerentes em estilo e comportamento.//

