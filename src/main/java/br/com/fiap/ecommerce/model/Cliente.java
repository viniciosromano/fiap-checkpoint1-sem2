package br.com.fiap.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50,nullable = false)
    private String nome;
    @Column(length = 9,nullable = false)
    private String cep;
    @Column(length = 100,nullable = false)
    private String logradouro;
    @Column(length = 10)
    private String numero;
    @Column(length = 50)
    private String complemento;
    @Column(length = 50,nullable = false)
    private String bairro;
    @Column(length = 50,nullable = false)
    private String municipio;
    @Column(length = 2,nullable = false)
    private String uf;

}
