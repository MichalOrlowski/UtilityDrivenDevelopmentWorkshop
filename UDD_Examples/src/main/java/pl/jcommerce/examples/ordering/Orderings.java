package pl.jcommerce.examples.ordering;

import com.google.common.collect.Ordering;
import org.joda.time.LocalDate;

/**
 * http://danhaywood.com/2013/02/02/using-google-guavas-ordering-api/
 */
public final class Orderings {

    public static final Ordering<Boolean> BOOLEAN_NULLS_LAST =
            Ordering.<Boolean>natural().nullsLast();
    public static final Ordering<LocalDate> LOCAL_DATE_NULLS_LAST =
            Ordering.<LocalDate>natural().nullsLast();
    public static final Ordering<String> STRING_NULLS_LAST =
            Ordering.<String>natural().nullsLast();

    private Orderings() {
    }
}
