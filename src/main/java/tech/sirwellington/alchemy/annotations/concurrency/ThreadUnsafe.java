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
package tech.sirwellington.alchemy.annotations.concurrency;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * + Used on a class to indicate that it is <b>not</b> designed to be Thread-Safe. 
 * <br>
 * + Used on a variable to indicate that it is expected to <b>not</b> be Thread-Safe.
 * <p>
 * Thread Unsafety means that  special precautions must be taken to handle concurrency issues while
 * using this object. 
 * 
 * @see ThreadUnsafe
 * @see Mutable
 * 
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target({ TYPE, FIELD, CONSTRUCTOR, LOCAL_VARIABLE, METHOD })
public @interface ThreadUnsafe
{

}
