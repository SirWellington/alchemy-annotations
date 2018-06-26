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

package tech.sirwellington.alchemy.annotations.arguments;

import java.lang.annotation.*;
import java.util.Collection;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Marks an argument or field as something that <b> may be{@code null}</b>.
 * It is also a way of saying that:
 * <p>
 * + {@code null} is an acceptable argument.
 * <br>
 * + An empty {@link Collection} is an acceptable argument.
 * <br>
 * + An empty {@link String} is an acceptable argument.
 *
 * @see Required
 *
 * @author SirWellington
 */
@Documented
@Target({ PARAMETER, FIELD, LOCAL_VARIABLE, METHOD })
@Retention(CLASS)
public @interface Optional
{

}
