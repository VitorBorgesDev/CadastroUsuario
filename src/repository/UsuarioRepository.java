package repository;

import Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepository {
    private List<Usuario> lista = new ArrayList<>();
    private int proximoId = 1;


    public void salvar(Usuario usuario) {
        usuario.setId(proximoId++);
        lista.add(usuario);
    }

    public List<Usuario> ListarUsuarios() {
        return lista;
    }


    public Optional<Usuario> BuscarPorId(int id) {
        return lista
                .stream()
                .filter(
                        u -> u.getId() == id).findFirst();


    }

    public boolean atualizar(int id, String novoNome, String novoEmail) {
        Optional<Usuario> encontrado = BuscarPorId(id);
        if (encontrado.isPresent()) {
            encontrado.get().setNome(novoNome);
            encontrado.get().setEmail(novoEmail);
            return true;

        }
        return false;

    }

    public boolean deletar(int id) {
        return lista.removeIf(u -> u.getId() == id);

    }

}
