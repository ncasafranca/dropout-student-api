package com.tesis.dropout_student_api.model;

public class PredictionQuantity {
    private int month;
    private int quantity;
    private int quantityRisk;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityRisk() {
        return quantityRisk;
    }

    public void setQuantityRisk(int quantityRisk) {
        this.quantityRisk = quantityRisk;
    }
}
