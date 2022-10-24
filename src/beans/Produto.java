
package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codproduto;
    
    @Column(name = "nomeproduto", length = 80, nullable = false,unique=true)
    private String nomeproduto;
    
    @Column(name="valor")
    private Double valor;
    
    @Column(name="quantidade")
    private Double quantidade;

    public Produto() {
    }

    
    public Integer getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(Integer codproduto) {
        this.codproduto = codproduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    @Override
    public String toString() {
        return nomeproduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

  
    
}
