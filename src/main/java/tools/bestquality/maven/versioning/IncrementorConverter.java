package tools.bestquality.maven.versioning;

import org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter;

import static tools.bestquality.maven.versioning.Incrementors.incrementor;

public class IncrementorConverter
        extends AbstractBasicConverter {

    @Override
    public boolean canConvert(Class<?> type) {
        return Incrementor.class.equals(type);
    }

    @Override
    protected Object fromString(String value) {
        return incrementor(value);
    }
}
