package jp.co.paypaycard.screening.creditcommon.entity.db;

import lombok.Data;

/**
 * TODO テーブル名、カラムは仮
 * 外部DocBellテーブルのエンティティクラス
 */
@Data
public class DocbellOutsideEntity {
    /** 電話番号 */
    private String TEL_NO;

    /** 履歴・調査日付 */
    private String SRC_DATE;
    /** 履歴・ステータス */
    private String STATUS;
    /** 履歴・移転先電話番号 */
    private String TEL_NEW;
}