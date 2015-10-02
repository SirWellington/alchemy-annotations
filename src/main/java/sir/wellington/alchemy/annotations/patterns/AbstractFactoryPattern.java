/*
 * Copyright 2015 Wellington.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sir.wellington.alchemy.annotations.patterns;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Target;

/**
 * Used to document the application and use of the Abstract Factory Pattern, explained
 * <a href="http://www.oodesign.com/abstract-factory-pattern.html">here</a>.
 *
 * @see
 * <a href="http://www.oodesign.com/abstract-factory-pattern.html">http://www.oodesign.com/abstract-factory-pattern.html</a>
 * @see
 * <a href="https://sourcemaking.com/design_patterns/abstract_factory">https://sourcemaking.com/design_patterns/abstract_factory</a>
 *
 * @author SirWellington
 */
@Documented
@Target(TYPE)
public @interface AbstractFactoryPattern
{

    Role role();

    public static enum Role
    {

        /**
         * Applied to the Interface of the Factory, i.e. the Abstract Factory.
         */
        FACTORY,
        /**
         * Applied to a concrete implementation of the Factory.
         */
        CONCRETE_FACTORY,
        /**
         * Applied to the Interface of the Product, i.e. the Abstract Product.
         */
        PRODUCT,
        /**
         * Applied to a concrete Product.
         */
        CONCRETE_PRODUCT,
        /**
         * Applied to an Object or class which makes use of this pattern.
         */
        CLIENT
    }
}
