package org.drools.ide.common.client.modeldriven.brl;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ExpressionText_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.drools.ide.common.client.modeldriven.brl.ExpressionText instance) throws SerializationException {
    
    org.drools.ide.common.client.modeldriven.brl.ExpressionPart_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.drools.ide.common.client.modeldriven.brl.ExpressionText instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.drools.ide.common.client.modeldriven.brl.ExpressionText();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.ide.common.client.modeldriven.brl.ExpressionText instance) throws SerializationException {
    
    org.drools.ide.common.client.modeldriven.brl.ExpressionPart_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.ide.common.client.modeldriven.brl.ExpressionText_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.brl.ExpressionText_FieldSerializer.deserialize(reader, (org.drools.ide.common.client.modeldriven.brl.ExpressionText)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.brl.ExpressionText_FieldSerializer.serialize(writer, (org.drools.ide.common.client.modeldriven.brl.ExpressionText)object);
  }
  
}
