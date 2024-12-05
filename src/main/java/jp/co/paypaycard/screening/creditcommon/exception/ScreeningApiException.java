package jp.co.paypaycard.screening.creditcommon.exception;

/**
 * DBエラーのExceptionクラス
 */
public class ScreeningApiException extends ScreeningBaseException {
    /**
     * 例外を新規で発生させる際に使用するコンストラクタ
     * @param status HTTPステータスコード
     * @param message メッセージ
     */
    public ScreeningApiException(int status, String message) {
        super(status, message);
    }

    /**
     * 発生した例外を継承する際に使用するコンストラクタ
     * @param status HTTPステータスコード
     * @param message メッセージ
     * @param cause エラー原因のThrowableオブジェクト
     */
    public ScreeningApiException(int status, String message, Throwable cause) {
        super(status, message, cause);
    }
}
