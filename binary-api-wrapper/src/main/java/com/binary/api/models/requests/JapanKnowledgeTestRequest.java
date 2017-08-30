package com.binary.api.models.requests;

import com.binary.api.models.enums.TestResult;
import com.binary.api.models.responses.JapanKnowledgeTestResponse;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/30/2017
 */
public class JapanKnowledgeTestRequest extends RequestBase {

    @SerializedName("jp_knowledge_test")
    private final int jpKnowledgeTest = 1;

    /**
     * Total score for knowledge test.
     */
    @SerializedName("score")
    private Integer score;

    /**
     * Result status of knowledge test, whether pass / fail.
     */
    @SerializedName("status")
    private String status;

    @SerializedName("questions")
    private List<JapanKnowledgeTestQuestion> questions;

    private JapanKnowledgeTestRequest() {
        this.responseType = JapanKnowledgeTestResponse.class;
    }

    public JapanKnowledgeTestRequest(Integer score, TestResult status){
        this();
        this.setScore(score);
        this.setStatus(status);
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(TestResult status) {
        this.status = status.toString();
    }

    public List<JapanKnowledgeTestQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<JapanKnowledgeTestQuestion> questions) {
        this.questions = questions;
    }
}
