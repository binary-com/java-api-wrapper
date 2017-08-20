package com.binary.api.utils;

import com.binary.api.models.requests.ForgetAllResponse;
import com.binary.api.models.requests.SellContractForMultipleAccountsRequest;
import com.binary.api.models.responses.*;

import java.lang.reflect.Type;

/**
 * Created by morteza on 7/19/2017.
 */

public class ClassUtils {
    public static Type getClassType(String type){
        switch (type){
            case "tick":
                return TickResponse.class;
            case "authorize":
                return AuthorizeResponse.class;
            case "active_symbols":
                return ActiveSymbolResponse.class;
            case "asset_index":
                return AssetIndexResponse.class;
            case "contracts_for":
                return ContractsForSymbolResponse.class;
            case "forget":
                return ForgetResponse.class;
            case "forget_all":
                return ForgetAllResponse.class;
            case "landing_company":
                return LandingCompanyResponse.class;
            case "new_account_virtual":
                return NewVirtualAccountResponse.class;
            case "landing_company_details":
                return LandingCompanyDetailsResponse.class;
            case "ping":
                return PingResponse.class;
            case "paymentagent_list":
                return PaymentAgentListResponse.class;
            case "payout_currencies":
                return PayoutCurrenciesResponse.class;
            case "proposal":
                return PriceProposalResponse.class;
            case "residence_list":
                return ResidenceListResponce.class;
            case "states_list":
                return StatesListResponse.class;
            case "candles":
                return TickHistoryResponse.class;
            case "history":
                return TickHistoryResponse.class;
            case "time":
                return TimeResponse.class;
            case "trading_times":
                return TradingTimesResponse.class;
            case "verify_email":
                return EmailVerificationResponse.class;
            case "website_status":
                return WebsiteStatusResponse.class;
            // Read Scope
            case "get_limits":
                return AccountLimitsResponse.class;
            case "get_settings":
                return AccountSettingsResponse.class;
            case "get_account_status":
                return AccountStatusResponse.class;
            case "balance":
                return BalanceResponse.class;
            case "get_self_exclusion":
                return GetSelfExclusionResponse.class;
            case "login_history":
                return LoginHistoryResponse.class;
            case "logout":
                return LogoutResponse.class;
            case "oauth_apps":
                return OAuthApplicationResponse.class;
            case "statement":
                return StatementResponse.class;
            case "portfolio":
                return PortfolioResponse.class;
            case "profit_table":
                return ProfitTableResponse.class;
            case "proposal_open_contract":
                return ProposalOpenContractResponse.class;
            case "reality_check":
                return RealityCheckResponse.class;
            case "transaction":
                return TransactionsStreamResponse.class;
            // Trade Scope
            case "buy":
                return BuyContractResponse.class;
            case "buy_contract_for_multiple_accounts":
                return BuyContractForMultipleAccountsResponse.class;
            case "sell_contract_for_multiple_accounts":
                return SellContractForMultipleAccountsRequest.class;
            case "copy_start":
                return StartCopyTradeResponse.class;
            case "copy_stop":
                return StopCopyTradeResponse.class;
            case "sell":
                return SellContractResponse.class;
            case "sell_expired":
                return SellExpiredContractsResponse.class;
            case "topup_virtual":
                return TopUpVirtualMoneyAccountResponse.class;
            case "api_token":
                return ApiTokenManagementResponse.class;
            case "app_register":
                return ApplicationRegistrationResponse.class;
        }
        return null;
    }
}
