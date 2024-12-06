package jp.co.paypaycard.screening.creditcommon.mapper;

import jp.co.paypaycard.screening.creditcommon.entity.db.H48Entity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * H48(DocBell電話接続状況履歴情報)テーブルに対応するMapperクラス
 */
@Mapper
public interface H48Mapper {
    /**
     * 申し込み番号、区分に一致するレコード取得
     * @param moshikomiNo 申し込み番号
     * @param kbn 区分
     * @return H48(DocBell電話接続状況履歴情報)テーブルのエンティティのリスト
     */
    List<H48Entity> findDocbell(String moshikomiNo, String kbn);
}