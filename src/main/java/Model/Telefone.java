
package Model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "TELEFONES")

public class Telefone implements Serializable {
    
    @Id
    @Column(name = "ID_TELEFONE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column (name = "DDD")
    private String ddd;
    
    @Column(name = "NUMERO")
    private String numero;

    
    public Telefone() {
    }

    public Telefone(long id, String ddd, String numero) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
