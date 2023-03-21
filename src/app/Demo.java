package app;

import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo {
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} else {
		   factory = new WindowsFactory();
		}
	    app = new Application(factory);
		return app;
}
	public static void main(String[] args) {
	  Application app = configureApplication();
	  app.paint();
			    
		
	}

}
//O código apresentado define a classe "Demo" que contém um método estático "configureApplication()" e um método "main()".

O método "configureApplication()" é responsável por configurar e retornar uma instância de "Application" usando uma fábrica de GUI específica para o
sistema operacional. Dentro do método, são declaradas duas variáveis: "app" do tipo "Application" e "factory" do tipo "GUIFactory".
Em seguida, é obtido o nome do sistema operacional usando o método "System.getProperty("os.name")" e armazenado em uma variável "osName".

Depois, é feita uma verificação para determinar qual fábrica de GUI deve ser usada com base no nome do sistema operacional. Se o nome contiver a palavra "mac",
o factory utilizado será "MacOSFactory", caso contrário, será utilizada o factory "WindowsFactory". O factory escolhido é então atribuído à variável "factory".
	Em seguida, é criada uma instância de "Application" utilizando a fábrica escolhida e armazenada na variável "app".

O método "configureApplication()" retorna a instância de "Application" configurada com o factory adequado

O método "main()" cria uma instância de "Application" chamando o método "configureApplication()" e armazena na variável "app". 
Em seguida, chama o método "paint()" da instância de "Application" criada para exibir a interface de usuário.

Em resumo, o código apresentado demonstra o uso do padrão de projeto Abstract Factory para criar componentes de interface de usuário
específicos para diferentes sistemas operacionais. Isso permite que o mesmo código possa ser executado em diferentes plataformas sem precisar
alterar a implementação dos componentes.//
