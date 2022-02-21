package br.com.desafio.ffit.tvsCatalog.beans;

import br.com.desafio.ffit.tvsCatalog.model.Tv;
import br.com.desafio.ffit.tvsCatalog.repository.TvRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "tvMB")
@ViewScoped
public class TvMB {

    @Getter
    @Setter
    private List<Tv> tvs = new ArrayList<>();

    @Getter
    @Setter
    private Tv tv;

    @Autowired
    private TvRepository tvRepository;

    @PostConstruct
    public List<Tv> listarTudo() {
        tvs = tvRepository.findAll();
        return tvs;
    }

    public Integer getTamanhoDaLista() {
        return tvs.size();
    }

    public void setTamanhoDaLista(Integer size) {
        // Método criado para ser utilizado pelo primefaces
    }
}
