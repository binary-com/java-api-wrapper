package com.binary.api;

import com.binary.api.TestBase;
import com.binary.api.models.enums.*;
import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.SetFinancialAssessmentRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.SetFinancialAssessmentResponse;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/11/2017
 */
public class SetFinancialAssessmentRequestTest extends TestBase {

    @Test
    public void setFinancialAssessmentTest() throws Exception {
        AuthorizeRequest authRequest =  new AuthorizeRequest(properties.getProperty("CR_ADMIN"));
        SetFinancialAssessmentRequest request = new SetFinancialAssessmentRequest();
        request.setForexTradingExperience(ExperienceDuration.ONE_TO_TWO_YEARS);
        request.setForexTradingFrequency(TradeFrequency.OVER_FORTY_TRANSACTIONS);
        request.setIndicesTradingExperience(ExperienceDuration.ONE_TO_TWO_YEARS);
        request.setIndicesTradingFrequency(TradeFrequency.OVER_FORTY_TRANSACTIONS);
        request.setCommoditiesTradingExperience(ExperienceDuration.ONE_TO_TWO_YEARS);
        request.setCommoditiesTradingFrequency(TradeFrequency.OVER_FORTY_TRANSACTIONS);
        request.setStocksTradingExperience(ExperienceDuration.ONE_TO_TWO_YEARS);
        request.setStocksTradingFrequency(TradeFrequency.OVER_FORTY_TRANSACTIONS);
        request.setOtherDerivativesTradingExperience(ExperienceDuration.ONE_TO_TWO_YEARS);
        request.setOtherDerivativesTradingFrequency(TradeFrequency.OVER_FORTY_TRANSACTIONS);
        request.setOtherInstrumentsTradingExperience(ExperienceDuration.ONE_TO_TWO_YEARS);
        request.setOtherInstrumentsTradingFrequency(TradeFrequency.OVER_FORTY_TRANSACTIONS);
        request.setEmploymentIndustry(EmploymentIndustries.CONSTRUCTION);
        request.setEducationLevel(EducationLevels.PRIMARY);
        request.setIncomeSource(IncomeSources.INVESTMENTS_AND_DIVIDENDS);
        request.setNetIncome(TurnoverRanges.FIFTY_TO_ONE_HUNDRED);
        request.setEstimatedWorth(EstimatedWorth.FIVE_HUNDREDS_TO_ONE_MILLION);
        request.setAccountTurnover(TurnoverRanges.FIFTY_TO_ONE_HUNDRED);
        request.setOccupation(Occupations.AGRICULTURAL_FORESTRY_FISHERY_WORKERS);
        request.setEmploymentStatus(EmploymentStatuses.EMPLOYED);
        request.setSourceOfWealth(WealthSources.ACCUMULATION_INCOME_SAVINGS);

        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        SetFinancialAssessmentResponse response = (SetFinancialAssessmentResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "set_financial_assessment");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getResult(), null);
    }
}
