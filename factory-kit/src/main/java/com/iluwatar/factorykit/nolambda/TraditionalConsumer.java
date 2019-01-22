package com.iluwatar.factorykit.nolambda;

/**
 * 非lambda得传统Consumer
 * @see java.util.function.Consumer
 */
public interface TraditionalConsumer<T> {
    void consume(T t);
}
