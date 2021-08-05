package sprite.fanta.domain.entity;


import sprite.fanta.common.Constants;
import sprite.fanta.common.util.StringUtils;

import javax.persistence.*;


@Table(name = "TB_MEMBER", indexes = {
        @Index(name = "IDX_USERNAME", columnList = "USERNAME")
})
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "USERNAME", nullable = false)
    String username;

    @Column(name = "X_TOKEN")
    String token;

    @Column(name = "ROLES")
    String roles;

    @Column(name = "ERROR_COUNT", columnDefinition = "integer default 0")
    Integer errorCount;

    @Column(name = "ALLOW_IP")
    String allowIp;

    public String getRoles() {
        return roles;
    }

    public boolean enableLogin() {
        return errorCount < Constants.MEMBER_ERROR_COUNT;
    }

    public boolean enableIp(String ipAddress) {
        return StringUtils.contains(allowIp, ipAddress);
    }

    public void reset(String token) {
        errorCount = 0;
        this.token = token;
    }

    public boolean matchToken(String value) {
        return StringUtils.equals(token, value);
    }

    public void addError() {
        errorCount += 1;
    }

}

