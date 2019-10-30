
package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public abstract class Pessoa {
    
    @Column (name = "NOME")
    private String nome;
    
    @Column (name = "NASCIMENTO")
    private Date nascimento;
    
    @Column (name = "CPF")
    private String cpf;
    
    @Column (name = "RG")
    private long rg;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_ENDERECO",
        referencedColumnName = "ID_ENDERECO",
        foreignKey = @ForeignKey(name = "FK_ENDERECO_ID_ENDERECO"))
    private Collection <Endereco> enderecos = new ArrayList<Endereco>();
    
    @OneToMany
    @JoinColumn(name= "ID_PESSOA",
        foreignKey = @ForeignKey(name = "FK_PESSOA_ID_PESSOA"))
    private Collection <Telefone> telefones = new ArrayList<Telefone>();

    
    public Pessoa() {
    }
    
    public Pessoa( String nome, Date nascimento, String cpf, long rg, Collection <Endereco> enderecos, Collection <Telefone> telefones ) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.enderecos = enderecos;
        this.telefones = telefones;
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

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    public Collection<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Collection<Telefone> telefones) {
        this.telefones = telefones;
    }
}
