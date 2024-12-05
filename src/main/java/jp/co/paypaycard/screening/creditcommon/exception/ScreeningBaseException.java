package jp.co.paypaycard.screening.creditcommon.exception;

import jp.co.paypaycard.screening.creditcommon.entity.ErrorResponse;

/**
 * カスタムExceptionのBaseクラス
 */
public class ScreeningBaseException extends RuntimeException  {
    /** エラーレスポンス */
    private final ErrorResponse errorResponse;

    /**
     * 例外を新規で発生させる際に使用するコンストラクタ
     */
    public ScreeningBaseException(int status, String message) {
        this.errorResponse = new ErrorResponse();
        this.errorResponse.setStatus(status);
        this.errorResponse.setMessage(message);
    }

    /**
     * 発生した例外を継承する際に使用するコンストラクタ
     * @param status HTTPステータスコード
     * @param message メッセージ
     * @param cause エラー原因のThrowableオブジェクト
     */
    public ScreeningBaseException(int status, String message, Throwable cause) {
        super(cause);
        this.errorResponse = new ErrorResponse();
        this.errorResponse.setStatus(status);
        this.errorResponse.setMessage(message);
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
}
