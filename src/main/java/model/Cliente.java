package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")

public class Cliente implements Serializable {
   
       
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_CLIENTE")
    private long id;
   
     @Column (name = "NOME")
    private String nome;
    
    @Column (name = "NASCIMENTO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nascimento;
    
    @Column (name = "CPF")
    private String cpf;
    
    @Column (name = "RG")
    private long rg;
    
    @Column (name = "CELULARES")
    private String tcelular;
    
    @Column (name = "FIXOS")
    private String tfixo;

    @Column (name = "RUA")
    private String rua;
    
    @Column (name = "NUMEROS")
    private int numero;
    
    @Column (name = "BAIRROS")
    private String bairro;
    
    @Column (name = "CIDADES")
    private String cidade;
    
    @Column (name = "ESTADO")
    private String estado;
    
    @Column (name = "PAISE")
    private String pais;
    
    @Column (name = "STATUS")
    private boolean status;
    
    
    public Cliente() {
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
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + "nome" + nome + "nascimento" + nascimento + "cpf" + cpf + "rg" + rg + "tcelular" + tcelular + "tfixo"+ tfixo+ ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", status=" + status + '}';
    }
    
    
}
