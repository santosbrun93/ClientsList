package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")

public class Cliente extends Pessoa implements Serializable {
   
       
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_CLIENTE")
    private long id;
    
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

    public Cliente(long id, String rua, int numero, String bairro, String cidade, String estado, String pais, boolean status) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.status = status;
    }

    
    public Cliente(long id, String rua, int numero, String bairro, String cidade, String estado, String pais, boolean status, String nome, Date nascimento, String cpf, long rg, String tcelular, String tfixo) {
        super(nome, nascimento, cpf, rg, tcelular, tfixo);
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.status = status;
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
    
    
}
