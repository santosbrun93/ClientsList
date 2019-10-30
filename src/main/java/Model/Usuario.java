package Model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;



@Entity
@Table(name = "USUARIOS")

public class Usuario extends Pessoa implements Serializable {
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_USUARIO")
    private long idUsuario;
    
    @Column (name = "USERS")
    private String user;
    
    @Column (name = "PASSWORDS")
    private String senha;

    public Usuario() {
    }

    public Usuario(long idUsuario, String user, String senha) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.senha = senha;
    }

    public Usuario(long idUsuario, String user, String senha, String nome, Date nascimento, String cpf, long rg, Collection<Endereco> enderecos, Collection<Telefone> telefones) {
        super(nome, nascimento, cpf, rg, enderecos, telefones);
        this.idUsuario = idUsuario;
        this.user = user;
        this.senha = senha;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
