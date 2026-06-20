package Service;

import Model.Usuario;
import repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

public class UsuarioService {
    private UsuarioRepository repository = new UsuarioRepository();

    public void cadastrar(String nome, String email) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro: nome não pode ser vazio.");
            return;

        }

        if (email == null || !email.contains("@")) {
            System.out.println("Erro: e-mail inválido.");
            return;
        }

        Usuario usuario = new Usuario(nome, 0, email);
        repository.salvar(usuario);
        System.out.println("Usuario cadastrado com sucesso" + usuario);


    }

    public void listarTodos() {
        List<Usuario> usuarios = repository.ListarUsuarios();
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario encontrado");
        } else {
            usuarios.forEach(System.out::println);


        }


    }


    public void buscarPorId(int id) {
        Optional<Usuario> usuario = repository.BuscarPorId(id);
        usuario.ifPresentOrElse(
                usuario1 -> System.out.println("Usuário encontrado")
                , () -> System.out.println("Usuário com id" + id + "não encontrado")
        );

    }


    public void atualizar(int id, String novoNome, String novoEmail) {
        boolean atualizado = repository.atualizar(id, novoNome, novoEmail);
        System.out.println(atualizado ? "Atualizado com sucesso!" : "Usuário não encontrado.");


    }

    public void deletar(int id) {
        boolean deletado = repository.deletar(id);
        System.out.println(deletado ? "Deletado com sucesso!" : "Usuário não encontrado.");


    }


}





