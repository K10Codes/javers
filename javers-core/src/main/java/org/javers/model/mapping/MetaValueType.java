package org.javers.model.mapping;

/**
 * High level value type
 *
 * @author bartosz walacik
 */
public enum MetaValueType {
    PRIMITIVE,
    PRIMITIVE_BOX,
    VALUE_OBJECT,
    /**
     * Reference to {@link Entity}
     */
    REFERENCE,
    COLLECTION,
    ARRAY
}