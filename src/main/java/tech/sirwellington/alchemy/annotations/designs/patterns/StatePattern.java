/*
 * Copyright © 2018. Sir Wellington.
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
 * Declares the use of the State Pattern, explained
 * <a href="https://sourcemaking.com/design_patterns/state">here</a>.
 *
 * @see
 * <a href="https://sourcemaking.com/design_patterns/state">https://sourcemaking.com/design_patterns/state</a>
 *
 * @see
 * <a href="https://en.wikipedia.org/wiki/State_pattern">https://en.wikipedia.org/wiki/State_pattern</a>
 *
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target({TYPE, METHOD, FIELD})
public @interface StatePattern
{

    public static enum Role
    {

        /**
         * Applied to an Object that knowingly makes use of the State Pattern to delegate some of
         * its behavior.
         */
        CLIENT,
        /**
         * Applied to Objects or Classes that represent State.
         */
        STATE,
        /**
         * Applied to an Object that executes some action on the State.
         */
        EXECUTOR
    }
}
