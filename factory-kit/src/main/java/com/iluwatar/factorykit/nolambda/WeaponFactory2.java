package com.iluwatar.factorykit.nolambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import com.iluwatar.factorykit.Weapon;
import com.iluwatar.factorykit.WeaponType;

/**
 * 非lambda表达式的WeaponFactory
 *
 * @see com.iluwatar.factorykit.WeaponFactory
 */
public interface WeaponFactory2 {

    Weapon create(WeaponType weaponType);

    /**
     * 非lambda实现
     * @see com.iluwatar.factorykit.WeaponFactory#factory(Consumer)
     * @return
     */
    static WeaponFactory2 factory(TraditionalConsumer<Builder2> tc) {

        Map<WeaponType, TraditionalSupplier<Weapon>> map = new HashMap<>();

        tc.consume(new Builder2() {
            @Override
            public void add(WeaponType weaponType, TraditionalSupplier<Weapon> supplier) {
                map.put(weaponType,supplier);
            }
        });

        return new WeaponFactory2() {
            @Override
            public Weapon create(WeaponType weaponType) {
                return map.get(weaponType).supplier();
            }
        };

    }
}
