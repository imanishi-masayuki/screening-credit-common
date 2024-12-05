package jp.co.paypaycard.screening.creditcommon.entity.db;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 審査履歴テーブルのエンティティクラス
 */
@Data
public class T00102Entity {
    /** 保管整理番号 */
    String reception_number;
    /** 連番 */
    int seq;
    /** 審査メモ区分 */
    String reception_memo_code;
    /** 審査メモ内容 */
    String reception_memo;
    /** 更新日時 */
    LocalDateTime update_date;
    /** 更新担当者コード */
    String update_user_code;
    /** 登録日時 */
    LocalDateTime registered_date;
    /** 登録担当者コード */
    String registered_user_code;
}