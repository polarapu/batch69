package sprite.fanta.web;


/**
 * @author ock
 */
public enum ApiStatus {
    SUCCESS(0),
    BAD_REQUEST(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    METHOD_NOT_ALLOWED(405),
    REDIRECT(302),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    public int getCode() {
        return this.code;
    }

    ApiStatus(int code) {
        this.code = code;
    }

    public static ApiStatus getApiStatus(int code) {
        ApiStatus[] apiStatuses = ApiStatus.values();
        for (ApiStatus apiStatus : apiStatuses) {
            if (code == apiStatus.getCode()) {
                return apiStatus;
            }
        }
        return null;
    }

}
