package com.jrpolesi.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class PasswordValidator {
    private final List<Function<String, String>> rules = new ArrayList<>();

    public List<String> validate(String password) {
        return rules.stream().map(rule -> rule.apply(password)).filter(Objects::nonNull).toList();
    }

    public PasswordValidator minLength(int length, String errMsg) {
        rules.add(password -> {
            final var isValid = password.length() >= length;
            if (!isValid) {
                return errMsg;
            }

            return null;
        });
        return this;
    }

    public PasswordValidator containsUpperCase(String errMsg) {
        rules.add(password -> {
            final var isValid = password.chars().anyMatch(Character::isUpperCase);
            if (!isValid) {
                return errMsg;
            }

            return null;
        });
        return this;
    }

    public PasswordValidator containsNumber(String errMsg) {
        rules.add(password -> {
            final var isValid = password.chars().anyMatch(Character::isDigit);
            if (!isValid) {
                return errMsg;
            }

            return null;
        });
        return this;
    }

    public PasswordValidator containsSpecialCharacter(String errMsg) {
        rules.add(password -> {
            final var isValid = password.chars().anyMatch((c) -> !Character.isLetterOrDigit(c) && !Character.isSpaceChar(c));
            if (!isValid) {
                return errMsg;
            }

            return null;
        });
        return this;
    }
}
