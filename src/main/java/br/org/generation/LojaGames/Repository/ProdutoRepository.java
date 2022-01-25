package br.org.generation.LojaGames.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.LojaGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
	public List <Produto> findByValorGreaterThanOrderByPreco(BigDecimal valor);
	
	public List <Produto> findByValorLessThanOrderByPrecoDesc(BigDecimal valor);

}
