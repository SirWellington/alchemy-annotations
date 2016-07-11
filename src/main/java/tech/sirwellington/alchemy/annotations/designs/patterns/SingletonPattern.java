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
package tech.sirwellington.alchemy.annotations.designs.patterns;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Documents a Class that uses the Singleton Design Pattern.
 *
 * @see
 * <a href="http://www.oodesign.com/singleton-pattern.html">http://www.oodesign.com/singleton-pattern.html</a>
 *
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target(TYPE)
public @interface SingletonPattern
{

}
