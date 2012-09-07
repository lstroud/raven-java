package net.kencochrane.raven.log4j;

import org.apache.log4j.spi.LoggingEvent;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: les
 * Date: 9/7/12
 * Time: 5:39 PM
 */
public interface TagGenerator {
    public Map<String, ?> tag(LoggingEvent loggingEvent);
}
