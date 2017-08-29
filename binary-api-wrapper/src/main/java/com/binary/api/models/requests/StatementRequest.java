package com.binary.api.models.requests;

import com.binary.api.models.enums.TransactionType;
import com.binary.api.models.responses.StatementResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>StatementRequest</h1>
 * <p>
 * <h2>Statement Send</h2>
 * <p>
 * Retrieve a summary of account transactions, according to given search criteria
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class StatementRequest extends RequestBase {

    @SerializedName("statement")
    private final int statement = 1;

    /**
     * If set to 1, will return full contracts description.
     */
    @SerializedName("description")
    @Nullable
    private Integer description;

    /**
     * Apply upper limit to count of transactions received
     */
    @SerializedName("limit")
    @Nullable
    private Integer limit;

    /**
     * Skip this many transactions
     */
    @SerializedName("offset")
    @Nullable
    private Integer offset;

    /**
     * Optional start date (epoch)
     */
    @SerializedName("date_from")
    @Nullable
    private Integer dateFrom;

    /**
     * Optional end date (epoch)
     */
    @SerializedName("date_end")
    @Nullable
    private Integer dateEnd;

    /**
     * Optional filter for statement (deposit,withdrawal,buy,sell)
     */
    @SerializedName("action_type")
    @Nullable
    private String actionType;

    public StatementRequest() {
        this.responseType = StatementResponse.class;
    }

    public boolean getDescription() {
        return description == 1 ? true : false;
    }

    public void setDescription(boolean description) {
        this.description = description ? 1 : 0;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        Validator.checkPattern("^\\d{1,3}$", offset.toString(),
                "Offset does not match the regex pattern /^\\d{1,3}/");
        this.offset = offset;
    }

    public Integer getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Integer dateFrom) {
        Validator.checkPattern("^\\d{1,10}$", dateFrom.toString(),
                "DateFrom does not match the regex pattern /^\\d{1,10}/");
        this.dateFrom = dateFrom;
    }

    public Integer getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Integer dateEnd) {
        Validator.checkPattern("^\\d{1,10}$", dateEnd.toString(),
                "DateEnd does not match the regex pattern /^\\d{1,10}/");
        this.dateEnd = dateEnd;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(TransactionType actionType) {
        this.actionType = actionType.toString();
    }
}