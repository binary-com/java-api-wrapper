package com.binary.api.models.requests;

import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/30/2017
 */
public class JapanKnowledgeTestQuestion {

    /**
     * question id
     */
    @SerializedName("id")
    private Integer id;

    /**
     * The question
     */
    @SerializedName("question")
    private String question;

    /**
     * Given answer
     */
    @SerializedName("answer")
    private Integer answer;

    /**
     * Whether given answer is correct
     */
    @SerializedName("pass")
    private Integer pass;

    /**
     * Category of the question
     */
    @SerializedName("category")
    private Integer category;
}
