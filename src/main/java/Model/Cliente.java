package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")

public class Cliente extends Pessoa implements Serializable {

    @Column (name = "RUA")
    private String rua;
    
    @Column (name = "NUMEROS")
    private int numero;
    
    @Column (name = "BAIRROS")
    private String bairro;
    
    @Column (name = "CIDADES")
    private String cidade;
    
    @Column (name = "ESTADOS")
    private String estado;
    
    @Column (name = "PAISES")
    private String pais;
    
    public Cliente() {
    }

    public Cliente(String rua, int numero, String bairro, String cidade, String estado, String pais, long id, String nome, Date nascimento, String cpf, long rg, String tcelular, String tfixo) {
        super(id, nome, nascimento, cpf, rg, tcelular, tfixo);
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
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
    
    
}
