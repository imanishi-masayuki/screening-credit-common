package jp.co.paypaycard.screening.creditcommon.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;

/**
 * 電話番号のバリデーションの実装クラス
 * 数値、ハイフンのみであることをチェックする
 */
public class TelNumberValidator implements ConstraintValidator<TelNumber, String> {
    /** 正規表現パターン */
    private static final String TEL_NUMBER_PATTERN = "^[0-9\\-]*$";

    @Override
    public void initialize(TelNumber constraintAnnotation) {
    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // nullチェックは@NotNullでチェックする
        if (Objects.isNull(value)) {
            return true;
        }
        return value.matches(TEL_NUMBER_PATTERN);
    }
}