package test;

import java.util.concurrent.Callable;

public class Mytgread implements Callable
{
    private String str;

    public Mytgread(String str) {
        this.str = str;
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
