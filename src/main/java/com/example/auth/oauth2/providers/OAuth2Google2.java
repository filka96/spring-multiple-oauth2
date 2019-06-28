package com.example.auth.oauth2.providers;

import com.example.auth.oauth2.OAuth2Filter;
import com.example.auth.oauth2.OAuth2Provider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;

@Component
@Profile("oauth2-google2")
@ConfigurationProperties(prefix = "application.oauth2.providers.google2")
public class OAuth2Google2 extends OAuth2Provider implements OAuth2Filter {

    public Filter getFilter() {
        return null;
    }

}
