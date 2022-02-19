package br.com.desafio.ffit.tvsCatalog.repository;

import br.com.desafio.ffit.tvsCatalog.model.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TvRepository extends JpaRepository<Tv, Long>  {
}
