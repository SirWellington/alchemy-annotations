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

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Declares the use of the Factory Pattern.
 * This pattern is described <a href="http://www.oodesign.com/factory-pattern.html">here</a>.
 *
 * @see
 * <a href="http://www.oodesign.com/factory-pattern.html">http://www.oodesign.com/factory-pattern.html</a>
 *
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target(TYPE)
public @interface FactoryPattern
{

    Role role();

    public static enum Role
    {

        /**
         * Applied to the Interface of the Product, i.e. the Abstract Product.
         */
        PRODUCT,
        /**
         * Applied to a Concrete Product that implements the Product interface.
         */
        CONCRETE_PRODUCT,
        /**
         * Applied to the Factory Class. It's responsible for creating concrete products.
         */
        FACTORY,
        /**
         * Applied to a Class or Object that uses the Factory Pattern.Ï
         */
        CLIENT
    }
}
