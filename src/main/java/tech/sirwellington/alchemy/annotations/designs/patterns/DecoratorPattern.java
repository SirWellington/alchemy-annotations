/*
 * Copyright © 2018.  Sir Wellington.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tech.sirwellington.alchemy.annotations.designs.patterns;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Declares use of the Decorator Pattern, explained
 * <a href="http://www.oodesign.com/decorator-pattern.html">here</a>.
 *
 * @see
 * <a href="http://www.oodesign.com/decorator-pattern.html">http://www.oodesign.com/decorator-pattern.html</a>
 * @see
 * <a href="https://sourcemaking.com/design_patterns/decorator">https://sourcemaking.com/design_patterns/decorator</a>
 *
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target(TYPE)
public @interface DecoratorPattern
{

    Role role();

    public static enum Role
    {

        /**
         * Applied to the Interface of the component. This is the base Decorators also implement
         * this interface.
         */
        COMPONENT,
        CONCRETE_COMPONENT,
        DECORATOR,
        CONCRETE_DECORATOR,
        /**
         * Applied to a Class or Object that knowingly uses the Decorator Pattern.
         */
        CLIENT
    }
}
