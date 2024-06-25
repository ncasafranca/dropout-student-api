package com.tesis.dropout_student_api.controller;

import com.tesis.dropout_student_api.exception.UnKnownException;
import com.tesis.dropout_student_api.model.Prediction;
import com.tesis.dropout_student_api.repository.PredictionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {
        "http://localhost:4200",
        "http://dropout-student-api.azurewebsites.net",
        "https://dropout-student-api.azurewebsites.net"
})
@RestController
@RequestMapping("/api/v1/prediction")
@AllArgsConstructor
public class PredictionController {
    @Autowired
    PredictionRepository predictionRepository;

//    @CrossOrigin(origins = {"http://localhost:4200", "https://dropout-student-api.azurewebsites.net"})
    @PostMapping
    public ResponseEntity<Prediction> createPrediction
    (@RequestBody Prediction prediction) {
        try {
            Prediction newPrediction = new Prediction(
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
                    prediction.getGdp(),
                    prediction.getPredictRisk()
            );
            predictionRepository.save(newPrediction);
            return new ResponseEntity<>(newPrediction,
                    HttpStatus.CREATED);
        } catch (Exception e) {
            throw new UnKnownException(e.getMessage());
        }
    }
}
