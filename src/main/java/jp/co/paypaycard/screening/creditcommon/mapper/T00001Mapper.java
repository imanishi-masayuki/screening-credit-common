package jp.co.paypaycard.screening.creditcommon.mapper;

import jp.co.paypaycard.screening.creditcommon.entity.db.T00001Entity;
import org.apache.ibatis.annotations.Mapper;

/**
 * T00001(初期申込情報)テーブルに対応するMapperクラス
 */
@Mapper
public interface T00001Mapper {
    /**
     * 保管整理番号に一致するレコードを取得する
     * @param receptionNumber 保管整理番号
     * @return ScreeningTableTmpのエンティティのリスト
     */
    T00001Entity findByReceptionNumber(String receptionNumber);
}