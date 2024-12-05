package jp.co.paypaycard.screening.creditcommon.entity.db;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * T00001(初期申込情報)テーブルのエンティティクラス
 */
@Data
public class T00001Entity {
    /** 保管整理番号 */
    String reception_number;
    /** 自宅電話番号（市外） */
    String home_tel_num_area_code;
    /** 自宅電話番号（局番） */
    String home_tel_num_exchange_code;
    /** 自宅電話番号（番号） */
    String home_tel_num_number;
    /** 勤務先電話番号（市外） */
    String workplace_tel_num_area_code;
    /** 勤務先電話番号（局番） */
    String workplace_tel_num_exchange_code;
    /** 勤務先電話番号（番号） */
    String workplace_tel_num_number;
    /** 勤務先電話番号（内線） */
    String workplace_tel_num_extension;
    /** 携帯電話番号１ */
    String mob_num_1;
    /** 携帯電話番号２ */
    String mob_num_2;
    /** 携帯電話番号３ */
    String mob_num_3;
    /** 更新日時 */
    LocalDateTime update_date;
    /** 更新担当者コード */
    String update_user_code;
    /** 登録日時 */
    LocalDateTime registered_date;
    /** 登録担当者コード */
    String registered_user_code;
}