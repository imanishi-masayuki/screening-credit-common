package jp.co.paypaycard.screening.creditcommon.entity;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * バリデーション違反データを保持するクラス
 */
@Data
public class ValidationResult {
    /** バリデーション違反データリスト */
    private List<ValidationResultData> violationList;

    /**
     * バリデーション違反データが存在するかチェックする
     * @return 存在する場合True
     */
    public boolean hasValidationViolation() {
        return !CollectionUtils.isEmpty(violationList);
    }
}
