package com.example.auth;

import com.example.auth.oauth2.OAuth2Filter;
import com.example.auth.oauth2.OAuth2Provider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestRestController {

    private final OAuth2Provider[] providers;
    private final OAuth2Filter[] filters;

    @GetMapping("/providers")
    public Object providers() {
        return providers;
    }

    @GetMapping("/filters")
    public Object filters() {
        return filters;
    }

}
