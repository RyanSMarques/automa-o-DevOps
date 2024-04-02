package atividade2;
import java.util.*;

public class CadastroCliente {
    Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> clienteLista = new ArrayList<Cliente>();

    public void adcionarClientes(Cliente cliente) {
        clienteLista.add(cliente);
        System.out.println("Cliente adcionado a lista!");
    }

    public void visualizarCliente(Cliente cliente) {
        System.out.println(cliente);
    }

    public void atualizarCliente(int opcao) {
        Cliente obj = new Cliente();
        System.out.println("Atualização de clientes: ");
        System.out.println("O que deseja atualizar? \n");
        System.out.println("Opção 1 - Nome");
        System.out.println("Opção 1 - E-mail");
        System.out.println("Opção 1 - Telefone");
        opcao = sc.nextInt();
        if (opcao == 1) {
            obj.setNome(clienteLista = sc.nextLine());
        }
    }

    public void excluirClient(Cliente cliente) {
        clienteLista.remove(cliente);
    }
    
}
