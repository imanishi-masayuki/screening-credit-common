package jp.co.paypaycard.screening.creditcommon.util;

import jp.co.paypaycard.screening.creditcommon.exception.ScreeningValidationException;
import jp.co.paypaycard.screening.creditcommon.entity.ValidationResultData;
import jp.co.paypaycard.screening.creditcommon.entity.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.SmartValidator;

import java.util.List;
import java.util.stream.Collectors;

/**
 * SmartValidatorによるバリデーションを行うUtilクラス
 */
@Component
public class ValidationUtil {
    private final SmartValidator validator;

    @Autowired
    public ValidationUtil(SmartValidator validator) {
        this.validator = validator;
    }

    /**
     * フィールドバリデーションを実施し、バリデーション違反項目のリストを返却する
     * @param object バリデーション処理を行うオブジェクト
     * @return バリデーションチェック結果
     */
    public ValidationResult validateField(Object object) {
        BeanPropertyBindingResult result = new BeanPropertyBindingResult(object, object.getClass().getName());
        this.validator.validate(object, result);
        List<ValidationResultData> viorationList = result.getFieldErrors().stream()
                .map(e -> {
                    ValidationResultData validationResultData = new ValidationResultData();
                    validationResultData.setField(e.getField());
                    validationResultData.setMessage(e.getDefaultMessage());
                    return validationResultData;
                })
                .collect(Collectors.toList());

        ValidationResult validationResult = new ValidationResult();
        validationResult.setViolationList(viorationList);
        return validationResult;
    }

    /**
     * バリデーション違反の例外をthrowする
     * @param validationResultDataList バリデーション違反項目のリスト
     * @throws ScreeningValidationException バリデーションエラーのExceptionクラス
     */
    public void throwValidationException(List<ValidationResultData> validationResultDataList) throws ScreeningValidationException {
        // TODO 引数をもとにエラーログ出力
        throw new ScreeningValidationException(HttpStatus.BAD_REQUEST.value(), "Invalid parameters");
    }
}
