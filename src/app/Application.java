package app;
// 
import button.Button;
import factories.GUIFactory;

public class Application {
	private Button button;
	private Checkbox checkbox;
	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}
		
	public void paint() {
		button.paint();
		checkbox.paint();
	}

}
//Este código representa a classe "Application" que é responsável por criar uma interface de usuário com um botão e uma caixa de seleção (checkbox). 
A interface de usuário é criada através de um factory  GUI (GUIFactory) que é fornecida ao construtor da classe.

A primeira coisa que é feita na classe é importar as classes Button e GUIFactory, que são utilizadas posteriormente. Em seguida, a classe declara duas variáveis
privadas: button e checkbox.

O construtor da classe recebe como parâmetro uma instância de GUIFactory que será utilizada para criar os componentes da interface de usuário. O método "createButton()" é chamado na fábrica e o resultado é armazenado na variável "button". O mesmo é feito para a criação da caixa de seleção (checkbox), que é armazenada na variável "checkbox".
