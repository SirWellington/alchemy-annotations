/*
 * Copyright 2016 Sir Wellington.
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
package tech.sirwellington.alchemy.annotations.designs.patterns;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Documents the application and use of the Strategy Pattern, explained
 * <a href="http://www.oodesign.com/strategy-pattern.html">here</a>.
 *
 * @see
 * <a href="http://www.oodesign.com/strategy-pattern.html">http://www.oodesign.com/strategy-pattern.html</a>
 *
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target({TYPE, FIELD, METHOD})
public @interface StrategyPattern
{

    Role role();

    public static enum Role
    {

        /**
         * Applied to the Interface definition of the Behavior.
         */
        INTERFACE,
        /**
         * Applied to a concrete implementation of the Behavior Interface.
         */
        CONCRETE_BEHAVIOR,
        /**
         * Applied to an Object that knowingly uses the Strategy Pattern to delegate some of its
         * behavior.
         */
        CLIENT
    }
}
