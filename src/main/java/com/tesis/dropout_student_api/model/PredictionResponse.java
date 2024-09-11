package com.tesis.dropout_student_api.model;

import com.azure.spring.data.cosmos.core.mapping.Container;

import java.util.List;

public class PredictionResponse {
    private String status;
    private List<Prediction> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Prediction> getData() {
        return data;
    }

    public void setData(List<Prediction> data) {
        this.data = data;
    }
}
