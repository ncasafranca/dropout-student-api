package com.tesis.dropout_student_api.controller;

import com.tesis.dropout_student_api.exception.UnKnownException;
import com.tesis.dropout_student_api.model.Prediction;
import com.tesis.dropout_student_api.model.PredictionQuantity;
import com.tesis.dropout_student_api.repository.PredictionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
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
    // Create prediction
    @PostMapping
    public ResponseEntity<Prediction> createPrediction
    (@RequestBody Prediction prediction) {
        try {
            Instant instant = Instant.now();
            long timeStampMillis = instant.toEpochMilli()/1000;

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

    @GetMapping("/{id}")
    public ResponseEntity<List<Prediction>> getAllPredictionsByYear(@PathVariable("id") String id) {
        try {
            List<Prediction> predictions = new ArrayList<Prediction>();
            List<Prediction> predictionsFilter = new ArrayList<Prediction>();

            predictionRepository.findAll().forEach(predictions::add);

            for (Prediction prediction: predictions) {
                long epochSeconds = prediction.getTs();
                Instant instant = Instant.ofEpochSecond(epochSeconds);

                LocalDate date = instant.atOffset(ZoneOffset.UTC).toLocalDate();

                int year = Integer.parseInt(id);

                if (date.getYear() == year) {
                    predictionsFilter.add(prediction);
                }
            }

            return new ResponseEntity<>
                    (predictionsFilter, HttpStatus.OK);
        } catch (Exception e) {
            throw new UnKnownException(e.getMessage());
        }
    }

    @GetMapping("/count/{id}")
    public ResponseEntity<List<PredictionQuantity>> getAllPredictionsByMonth(@PathVariable("id") String id) {
        try {
            List<Prediction> predictions = new ArrayList<Prediction>();
            List<PredictionQuantity> predictionQuantities = new ArrayList<PredictionQuantity>();

            int qtyJanuary = 0, qtyFebruary = 0, qtyMarch = 0, qtyApril = 0, qtyMay = 0, qtyJune = 0, qtyJuly = 0, qtyAugust = 0,
                    qtySeptember = 0, qtyOctober = 0, qtyNovember = 0, qtyDecember = 0;

            int qtyRiskJanuary = 0, qtyRiskFebruary = 0, qtyRiskMarch = 0, qtyRiskApril = 0, qtyRiskMay = 0, qtyRiskJune = 0,
                    qtyRiskJuly = 0, qtyRiskAugust = 0, qtyRiskSeptember = 0, qtyRiskOctober = 0, qtyRiskNovember = 0,
                    qtyRiskDecember = 0;

            predictionRepository.findAll().forEach(predictions::add);

            for (Prediction prediction: predictions) {
                long epochSeconds = prediction.getTs();
                Instant instant = Instant.ofEpochSecond(epochSeconds);

                LocalDate date = instant.atOffset(ZoneOffset.UTC).toLocalDate();

                int year = Integer.parseInt(id);
                int month = date.getMonthValue();

                if (date.getYear() == year) {

                    switch(month) {
                        case 1:
                            qtyJanuary++; break;
                        case 2:
                            qtyFebruary++; break;
                        case 3:
                            qtyMarch++; break;
                        case 4:
                            qtyApril++; break;
                        case 5:
                            qtyMay++; break;
                        case 6:
                            qtyJune++; break;
                        case 7:
                            qtyJuly++; break;
                        case 8:
                            qtyAugust++; break;
                        case 9:
                            qtySeptember++; break;
                        case 10:
                            qtyOctober++; break;
                        case 11:
                            qtyNovember++; break;
                        case 12:
                            qtyDecember++; break;
                    }
                }

                if (date.getYear() == year && prediction.getPredictRisk() >= 0.5) {

                    switch(month) {
                        case 1:
                            qtyRiskJanuary++; break;
                        case 2:
                            qtyRiskFebruary++; break;
                        case 3:
                            qtyRiskMarch++; break;
                        case 4:
                            qtyRiskApril++; break;
                        case 5:
                            qtyRiskMay++; break;
                        case 6:
                            qtyRiskJune++; break;
                        case 7:
                            qtyRiskJuly++; break;
                        case 8:
                            qtyRiskAugust++; break;
                        case 9:
                            qtyRiskSeptember++; break;
                        case 10:
                            qtyRiskOctober++; break;
                        case 11:
                            qtyRiskNovember++; break;
                        case 12:
                            qtyRiskDecember++; break;
                    }
                }
            }

            for (int i = 1; i <= 12; i++ ) {
                PredictionQuantity predictionQuantity = new PredictionQuantity();
                predictionQuantity.setMonth(i);

                switch (i) {
                    case 1:
                        predictionQuantity.setQuantity(qtyJanuary);
                        predictionQuantity.setQuantityRisk(qtyRiskJanuary); break;
                    case 2:
                        predictionQuantity.setQuantity(qtyFebruary);
                        predictionQuantity.setQuantityRisk(qtyRiskFebruary); break;
                    case 3:
                        predictionQuantity.setQuantity(qtyMarch);
                        predictionQuantity.setQuantityRisk(qtyRiskMarch); break;
                    case 4:
                        predictionQuantity.setQuantity(qtyApril);
                        predictionQuantity.setQuantityRisk(qtyRiskApril); break;
                    case 5:
                        predictionQuantity.setQuantity(qtyMay);
                        predictionQuantity.setQuantityRisk(qtyRiskMay); break;
                    case 6:
                        predictionQuantity.setQuantity(qtyJune);
                        predictionQuantity.setQuantityRisk(qtyRiskJune); break;
                    case 7:
                        predictionQuantity.setQuantity(qtyJuly);
                        predictionQuantity.setQuantityRisk(qtyRiskJuly); break;
                    case 8:
                        predictionQuantity.setQuantity(qtyAugust);
                        predictionQuantity.setQuantityRisk(qtyRiskAugust); break;
                    case 9:
                        predictionQuantity.setQuantity(qtySeptember);
                        predictionQuantity.setQuantityRisk(qtyRiskSeptember); break;
                    case 10:
                        predictionQuantity.setQuantity(qtyOctober);
                        predictionQuantity.setQuantityRisk(qtyRiskOctober); break;
                    case 11:
                        predictionQuantity.setQuantity(qtyNovember);
                        predictionQuantity.setQuantityRisk(qtyRiskNovember); break;
                    case 12:
                        predictionQuantity.setQuantity(qtyDecember);
                        predictionQuantity.setQuantityRisk(qtyRiskDecember); break;
                }

                predictionQuantities.add(predictionQuantity);
            }

            return new ResponseEntity<>
                    (predictionQuantities, HttpStatus.OK);
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
