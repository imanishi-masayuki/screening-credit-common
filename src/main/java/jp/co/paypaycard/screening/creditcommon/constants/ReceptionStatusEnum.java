package jp.co.paypaycard.screening.creditcommon.constants;

import lombok.Getter;

/**
 * 審査システムの定数クラス
 */
@Getter
public enum ReceptionStatusEnum {
    SELECT("1", "セレクト"),
    GET_DOCBELL_INFO("2", "ＤｏｃＢｅｌｌ情報取得"),
    ;

    private final String code;
    private final String name;
    private ReceptionStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
