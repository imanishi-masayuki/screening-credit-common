package jp.co.paypaycard.screening.creditcommon.mapper;

import jp.co.paypaycard.screening.creditcommon.entity.db.T00101Entity;
import org.apache.ibatis.annotations.Mapper;

/**
 * T00101(審査状況)テーブルに対応するMapperクラス
 */
@Mapper
public interface T00101Mapper {
    /**
     * 保管整理番号に一致するレコードを取得する
     * @param receptionNumber 保管整理番号
     * @return ScreeningTableTmpのエンティティのリスト
     */
    T00101Entity findByReceptionNumber(String receptionNumber);

    /**
     * 審査ステータスを更新する
     * @param receptionNumber 保管整理番号
     * @param receptionStatus ステータス
     */
    void updateReceptionStatus(String receptionNumber, String receptionStatus);

    /**
     * 最終審査ステータスを更新する
     * @param receptionNumber 保管整理番号
     * @param receptionLastStatus ステータス
     */
    void updateReceptionLastStatus(String receptionNumber, String receptionLastStatus);
}