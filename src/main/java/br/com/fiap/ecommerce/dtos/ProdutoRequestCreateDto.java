package br.com.fiap.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Produto;

@Getter
@Setter
public class ProdutoRequestCreateDto {
    private String nome;

    public Produto toModel() {
        return new ModelMapper().map(this, Produto.class);
    }
    
}
