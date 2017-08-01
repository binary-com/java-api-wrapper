package com.binary.api.utils;

import com.binary.api.models.requests.ForgetAllRequest;
import com.binary.api.models.requests.ForgetAllResponse;
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
        }
        return null;
    }
}
