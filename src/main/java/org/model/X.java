package org.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString(callSuper = true)
public class X extends W implements Z {
    private A a;

    public X(A a) {
        this.a = a;
    }

    public boolean w1() {
        return true;
    }

    @Override
    public boolean v1() {
        return w1();
    }

    @Override
    public int z1() {
        return 42;
    }

    @Override
    public float z2(boolean flag) {
        return flag ? 3.14f : 0.0f;
    }
}