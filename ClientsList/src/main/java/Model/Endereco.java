package Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author BRUNO SILVA
 * @FADERGS
 * @Análise e Desenvolvimento de Sistemas
 */
@Entity
@Table(name = "ENDERECOS")

public class Endereco implements Serializable {
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_ENDERECO")
    private long id;
    
    @Column (name = "RUA")
    private String rua;
    
    @Column (name = "NUMERO")
    private int numero;
    
    @Column (name = "COMPLEMENTO")
    private String complemento;
    
    @Column (name = "CEP")
    private String cep;

    
    public Endereco() {
    }

    public Endereco(long id, String rua, int numero, String complemento, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    } 
}
