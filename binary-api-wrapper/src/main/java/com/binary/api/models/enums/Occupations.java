package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum Occupations {

    CHIEF_EXECUTIVES("Chief Executives, Senior Officials and Legislators"),
    MANAGERS("Managers"),
    PROFESSIONALS("Professionals"),
    CLERKS("Clerks"),
    PERSONAL_CARE_SALES_SERVICE_WORKERS("Personal Care, Sales and Service Workers"),
    AGRICULTURAL_FORESTRY_FISHERY_WORKERS("Agricultural, Forestry and Fishery Workers"),
    CRAFT_METAL_ELECTRICAL_ELECTRONICS_WORKERS("Craft, Metal, Electrical and Electronics Workers"),
    PLANT_MACHINE_OPERATORS_ASSEMBLERS("Plant and Machine Operators and Assemblers"),
    CLEANERS_HELPERS("Cleaners and Helpers"),
    MINING_CONSTRUCTION_MANUFACTURING_TRANSPORT_WORKERS("Mining, Construction, Manufacturing and Transport Workers"),
    ARMED_FORCES("Armed Forces"),
    GOVERNMENT_OFFICERS("Government Officers"),
    OTHERS("Others");

    private final String _value;

    Occupations(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }

}
