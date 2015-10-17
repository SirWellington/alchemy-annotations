/*
 * Copyright 2015 Sir Wellington.
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
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.CLASS;
import java.lang.annotation.Target;

/**
 * +Used on a class to indicate that it is designed to be Thread-Safe. 
 * <br>
 * +Used on a variable to indicate that it is expected to be Thread-Safe.
 * <p>
 * Thread Safety means that no special precautions must be taken to handle concurrency issues while
 * using this object. Thread-Safe Objects are usually immutable or handle synchronization internally
 * can be marked as {@link ThreadSafe}.
 *
 * @see ThreadUnsafe
 * @see Immutable
 * 
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target({ TYPE, FIELD, CONSTRUCTOR, LOCAL_VARIABLE, METHOD })
public @interface ThreadSafe
{

}
