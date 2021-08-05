package sprite.fanta.web.exception;

import sprite.fanta.web.ApiStatus;

/**
 * @author ock
 */
public class ApiException extends RuntimeException {
    private int code;

    /**
     * @param code
     * @param message
     */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * @param status
     * @param message
     */
    public ApiException(ApiStatus status, String message) {
        super(message);
        this.code = status.getCode();
    }

    /**
     * @param message
     */
    public ApiException(String message) {
        super(message);
        this.code = ApiStatus.SUCCESS.getCode();
    }

    /**
     * @return
     */
    public int getCode() {
        return this.code;
    }
}
