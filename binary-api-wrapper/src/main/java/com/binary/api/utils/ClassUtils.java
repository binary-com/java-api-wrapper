package com.binary.api.utils;

import com.binary.api.models.responses.ActiveSymbolResponse;
import com.binary.api.models.responses.AssetIndexResponse;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.TickResponse;

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
        }
        return null;
    }
}
