package pl.altkom.scope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service("session-scope")
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScopeImpl implements ScopeService {

    private int i = 0;


    @Override
    public String responseMessage() {
        String msg = "The number is: " + i;
        i++;
        return msg;
    }
}

