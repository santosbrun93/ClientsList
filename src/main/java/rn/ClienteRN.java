package rn;

import dao.ClienteDAO;
import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRN {

    ClienteDAO clienteDAO = new ClienteDAO();

    public long createCliente(Cliente Cliente) {
        long id = 0;
        try {
            
            if (Cliente.getNome().length() > 5)
                id = clienteDAO.save(Cliente);
            else throw new Exception("Cliente invalido");
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return id;
    }

    public void alterCliente(Cliente Cliente) {
        try {
            clienteDAO.update(Cliente);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteCliente(Cliente Cliente) {
        try {
            clienteDAO.delete(Cliente);
        } catch (Exception e) {

            e.getMessage();
        }
    }

    public Cliente findCliente(long id) {
        Cliente Cliente = new Cliente();
        try {
            Cliente = (Cliente) clienteDAO.findObject(Cliente.class);
        } catch (Exception e) {
            e.getMessage();
        }
        return Cliente;
    }

    public List<Cliente> findAllCliente() {
        List<Cliente> Clientes = new ArrayList<Cliente>();
        try {
            Clientes = clienteDAO.findAll(Cliente.class);
        } catch (Exception e) {

            e.getMessage();
            e.printStackTrace();
        }
        return Clientes;
    }
}