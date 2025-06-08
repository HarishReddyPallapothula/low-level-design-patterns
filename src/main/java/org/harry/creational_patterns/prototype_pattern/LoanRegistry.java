package org.harry.creational_patterns.prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class LoanRegistry {
    private Map<String, LoanProfile> prototypes = new HashMap<>();

    public LoanRegistry(ConfigService configService) {
        prototypes.put("home", new LoanProfile("home", configService));
        prototypes.put("car", new LoanProfile("car", configService));
    }

    public LoanProfile getLoan(String type) {
        return prototypes.get(type).clone();
    }
}

