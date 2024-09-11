package com.tesis.dropout_student_api.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.tesis.dropout_student_api.model.PredictionData;

public interface PredictionDataRepository extends CosmosRepository<PredictionData, String> {
}
