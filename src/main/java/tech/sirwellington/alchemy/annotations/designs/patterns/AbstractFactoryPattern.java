/*
 * Copyright © 2019. Sir Wellington.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tech.sirwellington.alchemy.annotations.designs.patterns;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Declares the use of the Abstract Factory Pattern. This pattern is explained
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
@Retention(CLASS)
@Target({TYPE, METHOD, FIELD})
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
