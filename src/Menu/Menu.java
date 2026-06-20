package Menu;


import Service.UsuarioService;


import java.util.Scanner;

public class Menu {

    UsuarioService usuarioService = new UsuarioService();
    Scanner entrada = new Scanner(System.in);

    public void iniciarMenu() {
        boolean continuar = true;


        do {

            System.out.println("Menu de cadastro");
            System.out.println("1 - Cadastrar um novo usuario");
            System.out.println("2 - Listar todos os usuarios");
            System.out.println("3 - Atualizar um usuario");
            System.out.println("4 - Deletar um usuario");
            System.out.println("5 - Buscar por id");
            System.out.println("0 - Sair");

            int opcaoEscolhida = entrada.nextInt();


            switch (opcaoEscolhida) {
                case 1:

                    entrada.nextLine();

                    System.out.println("Digite o e-mail: ");
                    String email = entrada.nextLine();

                    System.out.println("Digite o nome do usuario: ");
                    String nome = entrada.nextLine();


                    usuarioService.cadastrar(nome, email);
                    break;


                case 2:
                    usuarioService.listarTodos();
                    break;


                case 3:



                    System.out.println("Digite o id que quer atualizar: ");
                    int id = entrada.nextInt();

                    entrada.nextLine();

                    System.out.println("Digite o novo nome do usuario: ");
                    String nomeNovo = entrada.nextLine();

                    entrada.nextLine();

                    System.out.println("Digite o novo e-mail: ");
                    String emailNovo = entrada.nextLine();


                    usuarioService.atualizar(id, nomeNovo, emailNovo);
                    break;


                case 4:
                    System.out.println("Digite o id que quer deletar: ");
                    int idDeletar = entrada.nextInt();

                    usuarioService.deletar(idDeletar);
                    break;


                case 5:
                    System.out.println("Digite o id que está procurando: ");
                    int idProcurar = entrada.nextInt();

                    usuarioService.buscarPorId(idProcurar);
                    break;


                case 0:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

            }


        } while (continuar);


    }
}

