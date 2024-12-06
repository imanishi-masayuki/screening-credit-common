package jp.co.paypaycard.screening.creditcommon.mapper;

import jp.co.paypaycard.screening.creditcommon.entity.db.T00102Entity;
import org.apache.ibatis.annotations.Mapper;

/**
 * T00102(審査履歴)テーブルに対応するMapperクラス
 */
@Mapper
public interface T00102Mapper {
    /**
     * レコード一括追加
     * @param entity T00102Entityテーブルのエンティティ
     */
    void create(T00102Entity entity);
}