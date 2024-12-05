package jp.co.paypaycard.screening.creditcommon.entity.db;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * T00101(審査状況)テーブルのエンティティクラス
 */
@Data
public class T00101Entity {
    /** 保管整理番号 */
    String reception_number;
    /** 申込日時 */
    LocalDateTime reception_datetime;
    /** 審査種別 */
    String reception_type;
    /** 申込経路区分 */
    String reception_route_code;
    /** 審査ステータス */
    String reception_status;
    /** 審査最終ステータス */
    String reception_last_status;
    /** 審査完了日時 */
    LocalDateTime reception_end_date;
    /** 更新日時 */
    LocalDateTime update_date;
    /** 更新担当者コード */
    String update_user_code;
    /** 登録日時 */
    LocalDateTime registered_date;
    /** 登録担当者コード */
    String registered_user_code;
}