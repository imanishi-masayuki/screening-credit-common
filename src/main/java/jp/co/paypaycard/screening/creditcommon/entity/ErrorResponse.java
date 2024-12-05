package jp.co.paypaycard.screening.creditcommon.entity;

import lombok.Data;

/**
 * HttpResponseのエラー応答時のBody部情報を保持するクラス
 */
@Data
public class ErrorResponse {
    /** HTTPステータス */
    private int status;
    /** メッセージ */
    private String message;
}
