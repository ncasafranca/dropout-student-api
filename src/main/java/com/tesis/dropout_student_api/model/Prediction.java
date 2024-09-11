package com.tesis.dropout_student_api.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import org.springframework.data.annotation.Id;

@Container(containerName = "Prediction")
public class Prediction {
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
    private long ts;

    public Prediction(String codeStudent, String firstName, String lastName, int maritalStatus, int applicationMode, int applicationOrder, int daytimeAttendance, int previousQualification, int mothersQualification, int mothersOccupation, int fathersOccupation, int displaced, int debtor, int tuition, int gender, int scholarshipHolder, int ageAtEnrollment, int curricularUnits1stSemEvaluations, double curricularUnits1stSemGrade, int curricularUnits1stSemWithoutEvaluations, int curricularUnits2ndSemCredited, int curricularUnits2ndSemEnrolled, int curricularUnits2ndSemEvaluations, int curricularUnits2ndSemApproved, double curricularUnits2ndSemGrade, int curricularUnits2ndWithoutEvaluations, double predictRisk, long ts) {
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
        this.ts = ts;
    }

    public int getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(int maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getApplicationMode() {
        return applicationMode;
    }

    public void setApplicationMode(int applicationMode) {
        this.applicationMode = applicationMode;
    }

    public int getApplicationOrder() {
        return applicationOrder;
    }

    public void setApplicationOrder(int applicationOrder) {
        this.applicationOrder = applicationOrder;
    }

    public int getDaytimeAttendance() {
        return daytimeAttendance;
    }

    public void setDaytimeAttendance(int daytimeAttendance) {
        this.daytimeAttendance = daytimeAttendance;
    }

    public int getPreviousQualification() {
        return previousQualification;
    }

    public void setPreviousQualification(int previousQualification) {
        this.previousQualification = previousQualification;
    }

    public int getMothersQualification() {
        return mothersQualification;
    }

    public void setMothersQualification(int mothersQualification) {
        this.mothersQualification = mothersQualification;
    }

    public int getMothersOccupation() {
        return mothersOccupation;
    }

    public void setMothersOccupation(int mothersOccupation) {
        this.mothersOccupation = mothersOccupation;
    }

    public int getFathersOccupation() {
        return fathersOccupation;
    }

    public void setFathersOccupation(int fathersOccupation) {
        this.fathersOccupation = fathersOccupation;
    }

    public int getDisplaced() {
        return displaced;
    }

    public void setDisplaced(int displaced) {
        this.displaced = displaced;
    }

    public int getDebtor() {
        return debtor;
    }

    public void setDebtor(int debtor) {
        this.debtor = debtor;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getScholarshipHolder() {
        return scholarshipHolder;
    }

    public void setScholarshipHolder(int scholarshipHolder) {
        this.scholarshipHolder = scholarshipHolder;
    }

    public int getAgeAtEnrollment() {
        return ageAtEnrollment;
    }

    public void setAgeAtEnrollment(int ageAtEnrollment) {
        this.ageAtEnrollment = ageAtEnrollment;
    }

    public int getCurricularUnits1stSemEvaluations() {
        return curricularUnits1stSemEvaluations;
    }

    public void setCurricularUnits1stSemEvaluations(int curricularUnits1stSemEvaluations) {
        this.curricularUnits1stSemEvaluations = curricularUnits1stSemEvaluations;
    }

    public double getCurricularUnits1stSemGrade() {
        return curricularUnits1stSemGrade;
    }

    public void setCurricularUnits1stSemGrade(double curricularUnits1stSemGrade) {
        this.curricularUnits1stSemGrade = curricularUnits1stSemGrade;
    }

    public int getCurricularUnits1stSemWithoutEvaluations() {
        return curricularUnits1stSemWithoutEvaluations;
    }

    public void setCurricularUnits1stSemWithoutEvaluations(int curricularUnits1stSemWithoutEvaluations) {
        this.curricularUnits1stSemWithoutEvaluations = curricularUnits1stSemWithoutEvaluations;
    }

    public int getCurricularUnits2ndSemCredited() {
        return curricularUnits2ndSemCredited;
    }

    public void setCurricularUnits2ndSemCredited(int curricularUnits2ndSemCredited) {
        this.curricularUnits2ndSemCredited = curricularUnits2ndSemCredited;
    }

    public int getCurricularUnits2ndSemEnrolled() {
        return curricularUnits2ndSemEnrolled;
    }

    public void setCurricularUnits2ndSemEnrolled(int curricularUnits2ndSemEnrolled) {
        this.curricularUnits2ndSemEnrolled = curricularUnits2ndSemEnrolled;
    }

    public int getCurricularUnits2ndSemEvaluations() {
        return curricularUnits2ndSemEvaluations;
    }

    public void setCurricularUnits2ndSemEvaluations(int curricularUnits2ndSemEvaluations) {
        this.curricularUnits2ndSemEvaluations = curricularUnits2ndSemEvaluations;
    }

    public int getCurricularUnits2ndSemApproved() {
        return curricularUnits2ndSemApproved;
    }

    public void setCurricularUnits2ndSemApproved(int curricularUnits2ndSemApproved) {
        this.curricularUnits2ndSemApproved = curricularUnits2ndSemApproved;
    }

    public double getCurricularUnits2ndSemGrade() {
        return curricularUnits2ndSemGrade;
    }

    public void setCurricularUnits2ndSemGrade(double curricularUnits2ndSemGrade) {
        this.curricularUnits2ndSemGrade = curricularUnits2ndSemGrade;
    }

    public int getCurricularUnits2ndWithoutEvaluations() {
        return curricularUnits2ndWithoutEvaluations;
    }

    public void setCurricularUnits2ndWithoutEvaluations(int curricularUnits2ndWithoutEvaluations) {
        this.curricularUnits2ndWithoutEvaluations = curricularUnits2ndWithoutEvaluations;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPredictRisk() {
        return predictRisk;
    }

    public void setPredictRisk(double predictRisk) {
        this.predictRisk = predictRisk;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }
}
