package tech.sirwellington.alchemy.annotations.operations;


import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Marks this code as not being implemented yet.
 * When calling any code marked as {@linkplain NotImplementedYet not implemented yet},
 * expect to receive an Exception, or a {@code null}Response
 *
 * @author SirWellington
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ TYPE, FIELD, METHOD})
public @interface NotImplementedYet
{

}
