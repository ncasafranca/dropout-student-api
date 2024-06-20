package com.tesis.dropout_student_api.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.tesis.dropout_student_api.model.Prediction;

public interface PredictionRepository extends CosmosRepository<Prediction, String> {

}
