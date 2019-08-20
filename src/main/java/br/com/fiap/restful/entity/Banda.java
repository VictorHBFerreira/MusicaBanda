package br.com.fiap.restful.entity;

import javax.persistence.*;

@Entity
@Table(name="T_BANDA")
@SequenceGenerator(name="banda", sequenceName = "SQ_T_BANDA", allocationSize = 1)
public class Banda {

    @Id
    @GeneratedValue(generator = "banda", strategy = GenerationType.SEQUENCE)
    @Column(name="cd_banda")
    private int codigo;
    @Column(name="nm_banda")
    private String nome;
    @Column(name="qt_componentes")
    private int componentes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }
}
