package br.com.fiap.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Produto;

@Getter
@Setter
public class ProdutoRequestUpdateDto {
	private String nome;
    public Produto toModel(Long id) {
        Produto result = new ModelMapper().map(this, Produto.class);
        result.setId(id);
        return result;
    }   
}
