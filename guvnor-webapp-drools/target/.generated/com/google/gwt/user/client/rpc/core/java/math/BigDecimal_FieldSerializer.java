package com.google.gwt.user.client.rpc.core.java.math;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BigDecimal_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer.deserialize(reader, (java.math.BigDecimal)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer.serialize(writer, (java.math.BigDecimal)object);
  }
  
}
