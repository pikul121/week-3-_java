package in.sp.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password("{noop}password").roles("USER").build());
        return manager;
    }

    @SuppressWarnings("deprecation")
	protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(requests -> requests.anyRequest().authenticated()).httpBasic(withDefaults());
    }

	private Customizer<HttpBasicConfigurer<HttpSecurity>> withDefaults() {
		// TODO Auto-generated method stub
		return null;
	}
}
