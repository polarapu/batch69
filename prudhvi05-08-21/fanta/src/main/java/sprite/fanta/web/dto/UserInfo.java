package sprite.fanta.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@ToString
@Builder
@Getter
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    String token;
    String roles;

    public Map<String, Object> toMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("token", token);
        result.put("roles", roles);
        return result;
    }
}
