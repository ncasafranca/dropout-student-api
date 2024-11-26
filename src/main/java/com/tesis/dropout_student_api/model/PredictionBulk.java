package com.tesis.dropout_student_api.model;

import java.util.List;

public class PredictionBulk {
    private List<Prediction> data;

    public List<Prediction> getData() {
        return data;
    }

    public void setData(List<Prediction> data) {
        this.data = data;
    }
}
