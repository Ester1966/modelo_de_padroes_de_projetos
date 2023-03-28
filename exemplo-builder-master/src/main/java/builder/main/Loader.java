package builder.main;

import padroes.builder.Usuario;
import padroes.builder.UsuarioBuilder;
import padroes.builder.UsuarioBuilderException;

/**
 * Created by diogomoreira on 20/07/16.
 */
public class Loader {

    public static void main(String[] args) throws UsuarioBuilderException {
        UsuarioBuilder usuario = new UsuarioBuilder();
//        builder.comIdade(27);
//        builder.comEndereco("Rua Etc, 212");
//        builder.comTelefone("9999-9999");

        usuario.comNome("Ester").comSobrenome("Leonardo").comIdade(57).comEndereco("Rua Eleonora Cintra").
                comTelefone("Etc").toUsuario();

        Usuario usuarioFinal = usuario.toUsuario();

        StringBuilder builder2 = new StringBuilder();
        builder2.append("Ester").append(" ").append("Leonardo");

    }
}
