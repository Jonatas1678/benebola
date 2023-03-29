package br.com.fiap.model;

import jakarta.persistence.*;

/**
 * @author Benefrancis do Nascimento
 * <p>
 * Fundamento do esporte Ex:
 * Cabeceio,
 * finalização com pé direito,
 * finalização com pé esquerdo,
 * domínio direcionado,
 * chute com peito do pé,
 * chute com a chapa do pé
 */

@Entity
@Table(name = "TB_FUNDAMENTO")
public class Fundamento {

    @Id
    @SequenceGenerator(name = "SQ_FUNDAMENTO", sequenceName = "SQ_FUNDAMENTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FUNDAMENTO")
    @Column(name = "ID_FUNDAMENTO")
    private long id;

    @Column(name = "NM_FUNDAMENTO")
    private String nome;

    public Fundamento() {
    }

    public Fundamento(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public long getId() {
        return id;
    }

    public Fundamento setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Fundamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundamento{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
