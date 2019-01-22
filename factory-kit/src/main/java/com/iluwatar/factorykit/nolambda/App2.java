package com.iluwatar.factorykit.nolambda;

import com.iluwatar.factorykit.Axe;
import com.iluwatar.factorykit.Bow;
import com.iluwatar.factorykit.Spear;
import com.iluwatar.factorykit.Sword;
import com.iluwatar.factorykit.Weapon;
import com.iluwatar.factorykit.WeaponType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试
 *
 * @see com.iluwatar.factorykit.App
 */
public class App2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(App2.class);

    public static void main(String[] args) {

        WeaponFactory2 factory2 = WeaponFactory2.factory(builder -> {
            builder.add(WeaponType.SWORD, new TraditionalSupplier<Weapon>() {
                @Override
                public Weapon supplier() {
                    return new Sword();
                }
            });
            builder.add(WeaponType.AXE, new TraditionalSupplier<Weapon>() {
                @Override
                public Weapon supplier() {
                    return new Axe();
                }
            });

            builder.add(WeaponType.SPEAR, new TraditionalSupplier<Weapon>() {
                @Override
                public Weapon supplier() {
                    return new Spear();
                }
            });
            builder.add(WeaponType.BOW, new TraditionalSupplier<Weapon>() {
                @Override
                public Weapon supplier() {
                    return new Bow();
                }
            });
        });

        Weapon weapon = factory2.create(WeaponType.SPEAR);
        LOGGER.info(weapon.toString());

    }
}

