package io.smartcat.ranger.core;

import java.math.BigInteger;
import java.time.*;

/**
 * Generates current epoch milliseconds.
 */
public class NowNanosValue extends Value<BigInteger> {

    @Override
    public void eval() {
        Instant t = Instant.now();
        BigInteger a = BigInteger.valueOf(t.getEpochSecond() * 1_000_000_000 + t.getNano());        
        val = a;
    }
}
