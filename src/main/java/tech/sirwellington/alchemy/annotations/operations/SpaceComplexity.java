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

package tech.sirwellington.alchemy.annotations.operations;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Documents the Space Complexity of an algorithm. In other words, how much space
 * an algorithm takes, relative to {@code n}.
 *
 * @author SirWellington
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ TYPE, FIELD, METHOD })
public @interface SpaceComplexity
{

    Complexity value();

    enum Complexity
    {
        /** O(1) complexity */
        CONSTANT,

        /** O(ln(n))  complexity */
        LOGARITHMIC,

        /** O(n) complexity */
        LINEAR,

        /** O(n²) complexity */
        QUADRATIC,

        /** O(n³) complexity */
        CUBIC,

        /** O(2ⁿ) complexity */
        EXPONENTIAL,

        /** O(n!) complexity */
        FACTORIAL
    }
}
