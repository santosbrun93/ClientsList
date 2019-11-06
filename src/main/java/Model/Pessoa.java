
package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "PESSOAS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_PESSOA")
    private long id;
    
    @Column (name = "NOME")
    private String nome;
    
    @Column (name = "NASCIMENTO")
    private Date nascimento;
    
    @Column (name = "CPF")
    private String cpf;
    
    @Column (name = "RG")
    private long rg;
    
    @Column (name = "CELULARES")
    private String tcelular;
    
    @Column (name = "FIXOS")
    private String tfixo;
    
    
    public Pessoa() {
    }

    public Pessoa(long id, String nome, Date nascimento, String cpf, long rg, String tcelular, String tfixo) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.tcelular = tcelular;
        this.tfixo = tfixo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getTcelular() {
        return tcelular;
    }

    public void setTcelular(String tcelular) {
        this.tcelular = tcelular;
    }

    public String getTfixo() {
        return tfixo;
    }

    public void setTfixo(String tfixo) {
        this.tfixo = tfixo;
    }

  
}
