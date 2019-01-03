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
 * + Used on a class to indicate that it is <b>not</b> designed to be Thread-Safe.
 * <p>
 * + Used on a variable to indicate that it is expected to <b>not</b> be Thread-Safe.
 * <p><p>
 *
 * An Object that is Thread Unsafe requires special precautions when used concurrently.
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
