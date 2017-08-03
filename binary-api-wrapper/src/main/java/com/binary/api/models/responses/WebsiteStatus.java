package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class WebsiteStatus {

    /**
     * Latest terms and conditions version
     */
    @SerializedName("terms_conditions_version")
    private String termsConditionsVersion;

    /**
     * Limits for api call for each websocket connection
     */
    @SerializedName("api_call_limits")
    private Map<String, ApiCallLimit> apiCallLimits;

    /**
     * Country code of connected IP
     */
    @SerializedName("clients_country")
    private String clientsCountry;

    /**
     * Provides codes for languages supported
     */
    @SerializedName("supported_languages")
    private List<String> supportedLanguages;

    /**
     * Show fractional digits for supported currencies, for example USD have display of 2 fractional digits.
     * { USD => { fractional_digits => 2 } }
     */
    @SerializedName("currencies_config")
    private Map<String, CurrencyConfig> currenciesConfig;

    /**
     * Current status of the ico auction. closed or open
     */
    @SerializedName("ico_status")
    private String icoStatus;

    /**
     * Current status of the site. up or down
     */
    @SerializedName("site_status")
    private String siteStatus;

    /**
     * Text for site status banner. Contains problem description. Showed only if site_status is down
     */
    @SerializedName("message")
    @Nullable
    private String message;

    public String getTermsConditionsVersion() {
        return termsConditionsVersion;
    }

    public Map<String, ApiCallLimit> getApiCallLimits() {
        return apiCallLimits;
    }

    public String getClientsCountry() {
        return clientsCountry;
    }

    public List<String> getSupportedLanguages() {
        return supportedLanguages;
    }

    public Map<String, CurrencyConfig> getCurrenciesConfig() {
        return currenciesConfig;
    }

    public String getIcoStatus() {
        return icoStatus;
    }

    public String getSiteStatus() {
        return siteStatus;
    }

    public String getMessage() {
        return message;
    }
}
