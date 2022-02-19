package br.com.desafio.ffit.tvsCatalog.controller;

import br.com.desafio.ffit.tvsCatalog.model.Tv;
import br.com.desafio.ffit.tvsCatalog.repository.TvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tvs")
public class TvController {

    @Autowired
    private TvRepository tvRepository;

    @GetMapping //Lista os dados armazenados no banco de dados
    public List<Tv> Listar(){
        return tvRepository.findAll();
    }

    @PostMapping //Inclui Tv no banco de dados
    public void Incluir(@RequestBody Tv tv){
        tvRepository.save(tv);
    }

    @PutMapping //Altera Tv do banco de dados
    public void Alterar(@RequestBody Tv tv){
        tvRepository.save(tv);
    }

    @DeleteMapping("/{cod}") //Exclui os dados de Tv do banco de dados
    public void Deletar(@PathVariable Long cod){
        tvRepository.deleteById(cod);
    }

    @GetMapping("/{cod}") //Filtra Tv pelo seu codigo.
    public Optional<Tv> Filtrar(@PathVariable Long cod){
        return tvRepository.findById(cod);
    }
}
