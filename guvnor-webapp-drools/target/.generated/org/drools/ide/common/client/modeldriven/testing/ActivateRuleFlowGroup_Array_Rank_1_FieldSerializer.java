package org.drools.ide.common.client.modeldriven.testing;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ActivateRuleFlowGroup_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_Array_Rank_1_FieldSerializer.deserialize(reader, (org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_Array_Rank_1_FieldSerializer.serialize(writer, (org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup[])object);
  }
  
}
