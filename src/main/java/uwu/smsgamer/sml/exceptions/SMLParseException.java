package uwu.smsgamer.sml.exceptions;

import uwu.smsgamer.sml.parser.BufferedChars;

public class SMLParseException extends Exception {
    public SMLParseException() {
    }

    public SMLParseException(String message) {
        super(message);
    }

    public SMLParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public SMLParseException(Throwable cause) {
        super(cause);
    }

    public SMLParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static SMLParseException expected(final String s, final String got, final BufferedChars bc) {
        return new SMLParseException('"' + s + "\" expected at [" + bc.getLine() + ':' + bc.getCol() + "]. Got: " + got);
    }

    public static SMLParseException unexpected(final String s, final BufferedChars bc) {
        return new SMLParseException("Unexpected token \"" + s + "\" at [" + bc.getLine() + ':' + bc.getCol() + "].");
    }
}
