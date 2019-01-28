package com.jdp.brokerchain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<T> {

    private int index = 0;
    private Map<Integer, Consumer<T>> handlers = new HashMap<>();

    public int subscribe(Consumer<T> handler) {
        this.handlers.put(index, handler);
        return index++;
    }

    public void unsubscribe(int index) {
        handlers.remove(index);
    }

    public void fire(T args) {
        for (Consumer<T> handler : handlers.values()) {
            handler.accept(args);
        }
    }
}
