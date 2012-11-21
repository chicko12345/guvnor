package org.drools.guvnor.client.rpc;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class InboxPageRow_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.drools.guvnor.client.rpc.InboxPageRow[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.drools.guvnor.client.rpc.InboxPageRow[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.drools.guvnor.client.rpc.InboxPageRow[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.guvnor.client.rpc.InboxPageRow[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.guvnor.client.rpc.InboxPageRow_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.guvnor.client.rpc.InboxPageRow_Array_Rank_1_FieldSerializer.deserialize(reader, (org.drools.guvnor.client.rpc.InboxPageRow[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.guvnor.client.rpc.InboxPageRow_Array_Rank_1_FieldSerializer.serialize(writer, (org.drools.guvnor.client.rpc.InboxPageRow[])object);
  }
  
}
