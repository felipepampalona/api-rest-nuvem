package me.dio.controller.dto;

import me.dio.domain.model.Card;

import java.math.BigDecimal;

public record CardDto(Long id, String number, BigDecimal limit) {

    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(id);
        model.setNumber(number);
        model.setLimit(limit);
        return model;
    }
}
