package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "survey_data_surveys")
public class SurveyDto {

    @Id
    @Column(name = "id")
    @Getter
    @Setter
    public Long id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "slug")
    @Getter
    @Setter
    private String slug;

    @Column(name = "id_author")
    @Getter
    @Setter
    private Long authorId;

    @Column(name = "id_status")
    @Getter
    @Setter
    private Long statusId;

    @Column(name = "time_seconds")
    @Getter
    @Setter
    private Integer timeSeconds;

    @Column(name = "create_date")
    @Getter
    @Setter
    private String createDate;

    @Column(name = "modify_date")
    @Getter
    @Setter
    private String modifyDate;

    @Column(name = "manual")
    @Getter
    @Setter
    private String manual;

    @Column(name = "wrong_message")
    @Getter
    @Setter
    private String wrongMessage;

    @Column(name = "required_number")
    @Getter
    @Setter
    private Integer requiredNumber;

    @Column(name = "number_attempts")
    @Getter
    @Setter
    private Integer numberAttempts;

    @Column(name = "is_show_right_answer")
    @Getter
    @Setter
    private Boolean isShowRightAnswer;

    @Column(name = "id_type")
    @Getter
    @Setter
    private Long typeId;

    @Column(name = "right_message")
    @Getter
    @Setter
    private String rightMessage;
//
//    @Column(name = "answer_type")
//    @Getter @Setter private AnswerType answerType;
//
//    @Column(name = "result_type")
//    @Getter @Setter private ResultType resultType;

    @Column(name = "id_microservice")
    @Getter
    @Setter
    private Long microServiceId;

    @Column(name = "id_entity_type")
    @Getter
    @Setter
    private Long entityTypeId;

    @Column(name = "description")
    @Getter
    @Setter
    private String description;

    @Column(name = "status")
    @Getter
    @Setter
    private String status;

    @Column(name = "calculation")
    @Getter
    @Setter
    private String calculation;

    /*@Getter @Setter
    @Column(name = "id")
    @JoinColumn(name = "id_survey")
    @JoinTable(
            name = "survey_data_questions_blocks",
            joinColumns = @JoinColumn(name = "id_survey")
    )
    private QuestionDto questionDto;*/


    public SurveyDto() {
    }

    @Override
    public String toString() {
        return "SurveyDto{" +
                "name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", authorId=" + authorId +
                ", statusId=" + statusId +
                ", timeSeconds=" + timeSeconds +
                ", createDate='" + createDate + '\'' +
                ", modifyDate=" + modifyDate +
                ", manual='" + manual + '\'' +
                ", wrongMessage='" + wrongMessage + '\'' +
                ", requiredNumber=" + requiredNumber +
                ", numberAttempts=" + numberAttempts +
                ", isShowRightAnswer=" + isShowRightAnswer +
                ", typeId=" + typeId +
                ", rightMessage='" + rightMessage + '\'' +
//                ", answerType='" + answerType + '\'' +
//                ", resultType='" + resultType + '\'' +
                ", microServiceId=" + microServiceId +
                ", entityTypeId=" + entityTypeId +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", calculation='" + calculation + '\'' +
                '}';
    }
}