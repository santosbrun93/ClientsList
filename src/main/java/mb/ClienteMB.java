package mb;

import controller.Util;
import model.*;
import rn.ClienteRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class ClienteMB {

    private Cliente cliente;
    private ClienteRN clienteRN;

    public ClienteMB() {
        cliente = new Cliente();
        clienteRN = new ClienteRN();

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String saveCliente() {

        System.out.println(cliente);
        long  id = clienteRN.createCliente(cliente);
        if (id > 0 ) {
            Util.mensages("Usuário", "Salvo com Sucesso");
            return "listaCliente.xhtml";
        }
        Util.mensages("Usuário", "Erro ao Salvar");
        return "";
    }

    public Cliente buscaCliente(Long id) {

        Cliente cliente = clienteRN.findCliente(id);
        System.out.println(cliente);

        return cliente;
    }

    public List<Cliente> getClientes(){
        List<Cliente> cs  = clienteRN.findAllCliente();
        System.out.println(cs);
        return cs;

}
}