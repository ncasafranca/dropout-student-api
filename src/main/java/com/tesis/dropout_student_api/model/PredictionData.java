package com.tesis.dropout_student_api.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import org.springframework.data.annotation.Id;

@Container(containerName = "Prediction")
public class PredictionData {
    @Id
    @GeneratedValue
    private String id;
    private String codeStudent;
    private String firstName;
    private String lastName;
    private int maritalStatus;
    private int applicationMode;
    private int applicationOrder;
    private int daytimeAttendance;
    private int previousQualification;
    private int mothersQualification;
    private int mothersOccupation;
    private int fathersOccupation;
    private int displaced;
    private int debtor;
    private int tuition;
    private int gender;
    private int scholarshipHolder;
    private int ageAtEnrollment;
    private int curricularUnits1stSemEvaluations;
    private double curricularUnits1stSemGrade;
    private int curricularUnits1stSemWithoutEvaluations;
    private int curricularUnits2ndSemCredited;
    private int curricularUnits2ndSemEnrolled;
    private int curricularUnits2ndSemEvaluations;
    private int curricularUnits2ndSemApproved;
    private double curricularUnits2ndSemGrade;
    private int curricularUnits2ndWithoutEvaluations;
    private double predictRisk;

    public PredictionData(String codeStudent, String firstName, String lastName, int maritalStatus, int applicationMode, int applicationOrder, int daytimeAttendance, int previousQualification, int mothersQualification, int mothersOccupation, int fathersOccupation, int displaced, int debtor, int tuition, int gender, int scholarshipHolder, int ageAtEnrollment, int curricularUnits1stSemEvaluations, double curricularUnits1stSemGrade, int curricularUnits1stSemWithoutEvaluations, int curricularUnits2ndSemCredited, int curricularUnits2ndSemEnrolled, int curricularUnits2ndSemEvaluations, int curricularUnits2ndSemApproved, double curricularUnits2ndSemGrade, int curricularUnits2ndWithoutEvaluations, double predictRisk) {
        this.codeStudent = codeStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.applicationMode = applicationMode;
        this.applicationOrder = applicationOrder;
        this.daytimeAttendance = daytimeAttendance;
        this.previousQualification = previousQualification;
        this.mothersQualification = mothersQualification;
        this.mothersOccupation = mothersOccupation;
        this.fathersOccupation = fathersOccupation;
        this.displaced = displaced;
        this.debtor = debtor;
        this.tuition = tuition;
        this.gender = gender;
        this.scholarshipHolder = scholarshipHolder;
        this.ageAtEnrollment = ageAtEnrollment;
        this.curricularUnits1stSemEvaluations = curricularUnits1stSemEvaluations;
        this.curricularUnits1stSemGrade = curricularUnits1stSemGrade;
        this.curricularUnits1stSemWithoutEvaluations = curricularUnits1stSemWithoutEvaluations;
        this.curricularUnits2ndSemCredited = curricularUnits2ndSemCredited;
        this.curricularUnits2ndSemEnrolled = curricularUnits2ndSemEnrolled;
        this.curricularUnits2ndSemEvaluations = curricularUnits2ndSemEvaluations;
        this.curricularUnits2ndSemApproved = curricularUnits2ndSemApproved;
        this.curricularUnits2ndSemGrade = curricularUnits2ndSemGrade;
        this.curricularUnits2ndWithoutEvaluations = curricularUnits2ndWithoutEvaluations;
        this.predictRisk = predictRisk;
    }
}
