package Main;

import Service.UsuarioService;

public class Test {
    public static void main(String[] args) {
        UsuarioService service = new UsuarioService();

        System.out.println("--------------------------------");

        service.cadastrar("Ana Silva", "ana@email.com");
        service.cadastrar("Bruno Costa", "bruno@email.com");
        service.cadastrar("", "invalido");

        System.out.println("\n--- Lista de usuários ---");
        service.listarTodos();

        System.out.println("\n--- Buscar id 1 ---");
        service.buscarPorId(1);

        System.out.println("\n--- Atualizar id 2 ---");
        service.atualizar(2, "Bruno Souza", "bruno.novo@email.com");
        service.listarTodos();

        System.out.println("\n--- Deletar id 1 ---");
        service.deletar(1);
        service.listarTodos();
    }
}