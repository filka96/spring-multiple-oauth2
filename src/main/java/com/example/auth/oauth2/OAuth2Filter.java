package com.example.auth.oauth2;

import javax.servlet.Filter;

@FunctionalInterface
public interface OAuth2Filter {
    Filter getFilter();
}
