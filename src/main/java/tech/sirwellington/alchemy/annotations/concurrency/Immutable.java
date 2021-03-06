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

package tech.sirwellington.alchemy.annotations.concurrency;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * + Marks a class or variable to indicate that it was designed to be immutable.
 * <p>
 * + Marks a variable to indicate that it is expected be {@code final} and immutable.
 * <p><p>
 * Once it is created and set, it's underlying state <b>should not</b> be changed.
 *
 * @see Mutable
 *
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target({ TYPE, FIELD, LOCAL_VARIABLE, METHOD })
public @interface Immutable
{

}
