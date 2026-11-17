package org.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString
public abstract class W {
    protected W w;

    public W(W w) {
        this.w = w;
    }

    public abstract boolean v1();
}