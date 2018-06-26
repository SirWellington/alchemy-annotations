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

/**
 * Declares use of the Facade Pattern, explained
 * <a href="http://www.oodesign.com/facade-pattern.html">here</a>.
 *
 * <a href="http://www.oodesign.com/facade-pattern.html">http://www.oodesign.com/facade-pattern.html</a>
 *
 * @author SirWellington
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface FacadePattern
{
    Role role() default Role.UMBRELLA;

    public static enum Role
    {
        /**
         * Represents one of the individual pieces that comprise
         * the whole.
         */
        COMPONENT,

        /**
         * Represents the Facade itself, that presents all of
         * the components as one.
         */
        UMBRELLA
    }
}
