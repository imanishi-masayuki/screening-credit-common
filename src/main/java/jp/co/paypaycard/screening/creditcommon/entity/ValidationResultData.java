package jp.co.paypaycard.screening.creditcommon.entity;

import lombok.Data;

/**
 * バリデーション違反データの詳細情報を保持するクラス
 */
@Data
public class ValidationResultData {
    /** フィールド名 */
    private String field;
    /** メッセージ */
    private String message;
}
