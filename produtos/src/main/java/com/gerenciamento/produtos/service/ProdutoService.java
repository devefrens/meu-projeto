package com.gerenciamento.produtos.service;

import com.gerenciamento.produtos.entities.Produto;
import com.gerenciamento.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ResponseEntity<Produto> createProduto(Produto produto) {
        Produto newProduto = produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduto);
    }

    public ResponseEntity<List<Produto>> getAllProdutos() {
        List<Produto> allProdutos = produtoRepository.findAll();
        return ResponseEntity.ok(allProdutos);
    }

    public ResponseEntity<Optional<Produto>> getProdutoById(Long id) {
        Optional<Produto> getProdutoById = produtoRepository.findById(id);
        return ResponseEntity.ok(getProdutoById);
    }

    public ResponseEntity<?> deleteProdutoById(Long id) {
        produtoRepository.deleteById(id);
        return ResponseEntity.ok("Deletado com sucesso!");
    }

    public ResponseEntity<Produto> updateProdutoById(Produto updateProduto, Long id) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(updateProduto.getNome());
            produto.setPreco(updateProduto.getPreco());
            produto.setQuantidadeEmEstoque(updateProduto.getQuantidadeEmEstoque());

            // Perceba a variável:  updatedProduto e não updateProduto, indica que já foi atualizado por isso UPDATED com D no final.
            Produto updatedProduto = produtoRepository.save(produto);
            return ResponseEntity.ok(updatedProduto);

        }).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

}
