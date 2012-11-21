package org.drools.guvnor.client.asseteditor.ruleflow;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ElementContainerTransferNode_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode_Array_Rank_1_FieldSerializer.deserialize(reader, (org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode_Array_Rank_1_FieldSerializer.serialize(writer, (org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode[])object);
  }
  
}
