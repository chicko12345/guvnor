package org.drools.ide.common.client.modeldriven.dt52;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RowNumberCol52_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52 instance) throws SerializationException {
    
    org.drools.ide.common.client.modeldriven.dt52.DTColumnConfig52_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52 instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52 instance) throws SerializationException {
    
    org.drools.ide.common.client.modeldriven.dt52.DTColumnConfig52_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52_FieldSerializer.deserialize(reader, (org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52_FieldSerializer.serialize(writer, (org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52)object);
  }
  
}
