package com.iluwatar.factorykit.nolambda;

import com.iluwatar.factorykit.Weapon;
import com.iluwatar.factorykit.WeaponType;

/**
 * 不使用lambda的builder
 * @see com.iluwatar.factorykit.Builder
 */
public interface Builder2 {
    void add(WeaponType weaponType, TraditionalSupplier<Weapon> supplier);
}
