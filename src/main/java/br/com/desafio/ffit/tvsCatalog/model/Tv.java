package br.com.desafio.ffit.tvsCatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Tv {

    @Id
    private Long cod; //Código da TV.
    private String marca; //AOC, LG, PHILIPS, TCL, SEMP TOSHIBA, SANSUNG.
    private double preco; //Preço da Tv.
    private String tec; //Led, Lcd, Plamas, Crystal.
    private String res; //HD, FULL HD, 4K, 8K, IA.
    private String SO; //Tizen, WebOs, Roku, Android Tv.
    private Instant dataCadastro;
}
