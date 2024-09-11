package com.tesis.dropout_student_api.controller;

import com.tesis.dropout_student_api.exception.UnKnownException;
import com.tesis.dropout_student_api.exception.UserNotFound;
import com.tesis.dropout_student_api.model.Prediction;
import com.tesis.dropout_student_api.model.PredictionData;
import com.tesis.dropout_student_api.model.PredictionResponse;
import com.tesis.dropout_student_api.repository.PredictionDataRepository;
import com.tesis.dropout_student_api.repository.PredictionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;

@CrossOrigin(origins = {
        "http://localhost:4200",
        "https://dropout-student-fe.azurewebsites.net"
})
@RestController
@RequestMapping("/api/v1/prediction")
@AllArgsConstructor
public class PredictionController {
    @Autowired
    PredictionRepository predictionRepository;
    @Autowired
    PredictionDataRepository predictionDataRepository;
    // Create prediction
    @PostMapping
    public ResponseEntity<Prediction> createPrediction
    (@RequestBody Prediction prediction) {
        try {
            Instant instant = Instant.now();
            long timeStampMillis = instant.toEpochMilli();

            Prediction newPrediction = new Prediction(
                    prediction.getCodeStudent(),
                    prediction.getFirstName(),
                    prediction.getLastName(),
                    prediction.getMaritalStatus(),
                    prediction.getApplicationMode(),
                    prediction.getApplicationOrder(),
                    prediction.getDaytimeAttendance(),
                    prediction.getPreviousQualification(),
                    prediction.getMothersQualification(),
                    prediction.getMothersOccupation(),
                    prediction.getFathersOccupation(),
                    prediction.getDisplaced(),
                    prediction.getDebtor(),
                    prediction.getTuition(),
                    prediction.getGender(),
                    prediction.getScholarshipHolder(),
                    prediction.getAgeAtEnrollment(),
                    prediction.getCurricularUnits1stSemEvaluations(),
                    prediction.getCurricularUnits1stSemGrade(),
                    prediction.getCurricularUnits1stSemWithoutEvaluations(),
                    prediction.getCurricularUnits2ndSemCredited(),
                    prediction.getCurricularUnits2ndSemEnrolled(),
                    prediction.getCurricularUnits2ndSemEvaluations(),
                    prediction.getCurricularUnits2ndSemApproved(),
                    prediction.getCurricularUnits2ndSemGrade(),
                    prediction.getCurricularUnits2ndWithoutEvaluations(),
                    prediction.getPredictRisk(),
                    timeStampMillis
            );
            predictionRepository.save(newPrediction);
            return new ResponseEntity<>(newPrediction,
                    HttpStatus.CREATED);
        } catch (Exception e) {
            throw new UnKnownException(e.getMessage());
        }
    }

    // Get all Predictions
    @GetMapping
    public ResponseEntity<List<Prediction>> getAllPredictions() {
        try {
            List<Prediction> predictions = new ArrayList<Prediction>();
            predictionRepository.findAll().forEach(predictions::add);

            return new ResponseEntity<>
                    (predictions, HttpStatus.OK);
        } catch (Exception e) {
            throw new UnKnownException(e.getMessage());
        }
    }

    // Get all and return in JSON
//    @GetMapping
//    public ResponseEntity<Object> getAllPredictions() {
//        try {
//            PredictionResponse predictionResponse = new PredictionResponse();
//            predictionResponse.setStatus("OK");
//
//            List<Prediction> predictionsData = new ArrayList<Prediction>();
//            predictionRepository.findAll().forEach(predictionsData::add);
//
//            predictionResponse.setData(predictionsData);
//
//            return new ResponseEntity<>
//                    (predictionResponse, HttpStatus.OK);
//        } catch (Exception e) {
//            throw new UnKnownException(e.getMessage());
//        }
//    }
}
