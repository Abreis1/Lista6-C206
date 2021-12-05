package br.inatel.cdg.game;

import lombok.Data;

@Data
public class Game {
    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private String na_sales;
    private String eu_sales;
    private String jp_sales;
    private String other_sales;
    private String global_sales;

}
