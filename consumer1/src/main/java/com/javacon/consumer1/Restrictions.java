package com.javacon.consumer1;

public enum Restrictions {
    VERY_IMPORTANT_RESTRICTION("Wszystkie osoby przybywające do Polski z państw nadbałtyckich motolotnią i skaczące na skakance są zobowiązane do odbycia kwarantanny przez 7 dni.");
    private String description;
    Restrictions(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}
