package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;



@Entity
@Table(name = "USUARIOS")

public class Usuario extends Pessoa implements Serializable {
    
    @Column (name = "USERS")
    private String user;
    
    @Column (name = "PASSWORDS")
    private String senha;
    
    
    public Usuario() {
    }

    public Usuario(long idUsuario, String user, String senha, long id, String nome, Date nascimento, String cpf, long rg, String tcelular, String tfixo) {
        super(id, nome, nascimento, cpf, rg, tcelular, tfixo);
        this.user = user;
        this.senha = senha;
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
