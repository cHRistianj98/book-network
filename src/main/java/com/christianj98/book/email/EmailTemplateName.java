package com.christianj98.book.email;

public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activate_account");

    private final String name;

    EmailTemplateName(final String name) {
        this.name = name;
    }
}
