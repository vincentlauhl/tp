package expiryeliminator.parser.prefix;

/**
 * Represents a prefix that is optional.
 */
public class OptionalArgPrefix extends SingleArgPrefix {
    /**
     * Initialises optional arg prefix with a prefix string.
     *
     * @param prefix Prefix.
     */
    public OptionalArgPrefix(String prefix) {
        super(prefix);
    }

    /**
     * Initialises optional arg prefix with a single arg prefix.
     *
     * @param singleArgPrefix Prefix that should be allowed to be optional.
     */
    public OptionalArgPrefix(SingleArgPrefix singleArgPrefix) {
        super(singleArgPrefix.getPrefix());
    }
}