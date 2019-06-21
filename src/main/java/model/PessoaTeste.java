package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PessoaTeste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public enum Sexo {
        M, F, O;
    }

    private Integer idade;
    private Sexo sexo;
    private String nome;
}
