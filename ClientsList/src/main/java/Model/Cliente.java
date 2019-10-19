package Model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")

public class Cliente extends Pessoa implements Serializable {

    @Id
    @Column(name = "ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    
    
    public Cliente() {
    }

    public Cliente(long idCliente, String nome, Date nascimento, String cpf, long rg, Collection<Endereco> enderecos, Collection<Telefone> telefones) {
        super(nome, nascimento, cpf, rg, enderecos, telefones);
        this.idCliente = idCliente;
    } 

    
    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
}
