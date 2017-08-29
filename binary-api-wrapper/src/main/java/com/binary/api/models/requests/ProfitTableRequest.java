package com.binary.api.models.requests;

import com.binary.api.models.enums.SortTypes;
import com.binary.api.models.responses.ProfitTableResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>ProfitTableRequest</h1>
 *
 * <h2>Profit Table Send</h2>
 * <p>
 *     Retrieve a summary of account Profit Table, according to given search criteria
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class ProfitTableRequest extends RequestBase {

    @SerializedName("profit_table")
    private final int profitTable = 1;

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
     * Optional start date (epoch or YYYY-MM-DD)
     */
    @SerializedName("date_from")
    @Nullable
    private String date_from;

    /**
     * Optional end date (epoch or YYYY-MM-DD)
     */
    @SerializedName("date_to")
    @Nullable
    private String date_to;

    /**
     * sort direction, default DESC
     */
    @SerializedName("sort")
    @Nullable
    private String sort;

    public ProfitTableRequest() {
        this.responseType = ProfitTableResponse.class;
    }

    public boolean getDescription() {
        return description == 1 ? true : false;
    }

    public void setDescription(boolean description) {
        this.description = description ? 1 : null;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        Validator.checkPattern("^\\d{1,3}$", limit.toString(),
                "Limit does not match the regex pattern /^\\d{1,3}$/");
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        Validator.checkPattern("^(\\d{4}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])|\\d{1,10})$",
                date_from,
                "DateFrom does not match the regex pattern /^(\\d{4}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])|\\d{1,10})$/");
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        Validator.checkPattern("^(\\d{4}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])|\\d{1,10})$",
                date_to,
                "DateTo does not match the regex pattern /^(\\d{4}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])|\\d{1,10})$/");
        this.date_to = date_to;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(SortTypes sort) {
        this.sort = sort.toString();
    }
}
