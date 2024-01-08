package com.sukk.boardback.common;

public interface ResponseCode {

    // HTTP Status 200
    public static final String SUCCESS = "SU";

    // HTTP Status 400
    String VALLIDATION_FAILED = "VF";
    String DUPLICATE_EMAIL = "DE";
    String DUPLICATE_NICKNAME = "DN";
    String DUPLICATE_TEL_NUMBER = "DT";
    String NOT_EXISTED_USER = "NE";
    String NOT_EXISTED_BOARD = "NB";

    // HTTP Status 401
    String SIGN_IN_FAIL = "SF";
    String AUTHRIZATION_FAILED = "AF";

    // HTTP Status 403
    String NO_PERMISSION = "NP";

    // HTTP Status 500
    String DATABASE_ERROR = "DBE";
}
