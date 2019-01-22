package com.iluwatar.factorykit.nolambda;

/**
 * 传统的不使用lambda的供应商
 */
public interface TraditionalSupplier<T> {
    T supplier();
}
