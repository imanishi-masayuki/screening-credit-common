package jp.co.paypaycard.screening.creditcommon.mapper;

import jp.co.paypaycard.screening.creditcommon.entity.db.H00501Entity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * H00501(DocBell電話接続状況履歴情報)テーブルに対応するMapperクラス
 */
@Mapper
public interface H00501Mapper {
    /**
     * 保管整理番号に一致するレコード取得
     * @param receptionNumber 保管整理番号
     * @return H48(DocBell電話接続状況履歴情報)テーブルのエンティティのリスト
     */
    List<H00501Entity> findByReceptionNumber(String receptionNumber);

    /**
     * レコード一括追加
     * @param entityList H48テーブルのエンティティのリスト
     */
    void createAll(List<H00501Entity> entityList);

    /**
     * レコード削除
     * @param receptionNumber 保管整理番号
     */
    void deleteByReceptionNumber(String receptionNumber);
}