/*
 * Copyright 2015 Wellington.
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
package sir.wellington.commons.annotations.concurrency;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Target;

/**
 * Designate the use of an Object or Variable as Thread-Safe. This means that no special precautions
 * must be taken to handle concurrency issues while using this object. Usually Objects that are
 * immutable or handle synchronization internally can be marked as {@link ThreadSafe}.
 *
 * @see ThreadUnsafe
 * @author SirWellington
 */
@Documented
@Target({ TYPE, FIELD, CONSTRUCTOR, LOCAL_VARIABLE})
public @interface ThreadUnsafe
{

}
