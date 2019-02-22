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
 * Declares the use of the Builder Pattern.
 * This pattern is explained <a href="http://www.oodesign.com/builder-pattern.html">here</a>.
 *
 * @see
 * <a href="http://www.oodesign.com/builder-pattern.html">http://www.oodesign.com/builder-pattern.html</a>
 *
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target({TYPE, METHOD, FIELD})
public @interface BuilderPattern
{

    Role role();

    enum Role
    {

        /**
         * Applied to the Builder, responsible for configuring and creating the product, for the
         * Client.
         */
        BUILDER,
        /**
         * (optional) Applied to a concrete Builder. In some application of this pattern, the
         * Builder is an Interface, and implementations are captured separately.
         */
        CONCRETE_BUILDER,
        /**
         * Applied to an Object that is created by the Builder.
         */
        PRODUCT,
        /**
         * Applied to an Object or Class that knowingly uses the Builder Pattern.
         */
        CLIENT
    }
}
