package io.github.stairman06.arewepatchworkyet.ui;

import io.github.stairman06.arewepatchworkyet.analyze.ClassMember;

public class ResultListItem {
    /**
     * Both classes and methods are stored in this class.
     * If this is of Class type, then {@literal object} is {@link String}
     * If this is of Method type, then {@literal object} is {@link ClassMember}
     */
    private final Object object;
    private final Type type;

    public enum Type {
        CLASS,
        CLASS_MEMBER
    }

    public ResultListItem(Type type, Object object) {
        this.type = type;
        this.object = object;
    }

    public Type getType() {
        return type;
    }

    public Object getObject() {
        return object;
    }
}
