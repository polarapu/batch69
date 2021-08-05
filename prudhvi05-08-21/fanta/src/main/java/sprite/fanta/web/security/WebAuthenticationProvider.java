package sprite.fanta.web.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;

public interface WebAuthenticationProvider extends AuthenticationProvider {

    public Authentication validateToken(Authentication authentication);

}
