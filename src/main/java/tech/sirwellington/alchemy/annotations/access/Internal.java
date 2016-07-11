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

package tech.sirwellington.alchemy.annotations.access;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Marks code as intended for use only within its project.
 * <p>
 * + Used on a Class to indicate that its design was intended solely for internal use.
 * <br>
 * + Used on a Method or Function to indicate that it was designed for internal use.
 * <p>
 * 
 * This is best reserved for classes and methods that cannot be made package-private because they are used
 * by other classes within the same project.
 * <p>
 * Developers should not use anything tagged as {@link Internal},
 * unless they are coding within that project.
 * 
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target({ TYPE, FIELD, LOCAL_VARIABLE, METHOD })
public @interface Internal
{

}
