package jp.co.paypaycard.screening.creditcommon.validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * 電話番号のバリデーションクラス
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TelNumberValidator.class)
public @interface TelNumber {
    String message() default "Invalid tel number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}