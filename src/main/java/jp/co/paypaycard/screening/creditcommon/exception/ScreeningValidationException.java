package jp.co.paypaycard.screening.creditcommon.exception;

/**
 * バリデーションエラーのExceptionクラス
 */
public class ScreeningValidationException extends ScreeningBaseException {
    /**
     * 例外を新規で発生させる際に使用するコンストラクタ
     * @param status HTTPステータスコード
     * @param message メッセージ
     */
    public ScreeningValidationException(int status, String message) {
        super(status, message);
    }

    /**
     * 発生した例外を継承する際に使用するコンストラクタ
     * @param status HTTPステータスコード
     * @param message メッセージ
     * @param cause エラー原因のThrowableオブジェクト
     */
    public ScreeningValidationException(int status, String message, Throwable cause) {
        super(status, message, cause);
    }
}
