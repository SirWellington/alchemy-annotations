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
 * Use to document the application and use of the Factory Pattern.
 *
 * @see
 * <a href="http://www.oodesign.com/factory-pattern.html">http://www.oodesign.com/factory-pattern.html</a>
 *
 * @author SirWellington
 */
@Documented
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
