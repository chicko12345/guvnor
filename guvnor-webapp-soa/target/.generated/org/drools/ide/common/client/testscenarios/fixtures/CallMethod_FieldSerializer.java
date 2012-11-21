package org.drools.ide.common.client.testscenarios.fixtures;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CallMethod_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue[] getCallFieldValues(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance) /*-{
    return instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::callFieldValues;
  }-*/;
  
  private static native void setCallFieldValues(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance, org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue[] value) 
  /*-{
    instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::callFieldValues = value;
  }-*/;
  
  private static native java.lang.String getMethodName(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance) /*-{
    return instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::methodName;
  }-*/;
  
  private static native void setMethodName(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance, java.lang.String value) 
  /*-{
    instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::methodName = value;
  }-*/;
  
  private static native int getState(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance) /*-{
    return instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::state;
  }-*/;
  
  private static native void setState(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance, int value) 
  /*-{
    instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::state = value;
  }-*/;
  
  private static native java.lang.String getVariable(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance) /*-{
    return instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::variable;
  }-*/;
  
  private static native void setVariable(org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance, java.lang.String value) 
  /*-{
    instance.@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::variable = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance) throws SerializationException {
    setCallFieldValues(instance, (org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue[]) streamReader.readObject());
    setMethodName(instance, streamReader.readString());
    setState(instance, streamReader.readInt());
    setVariable(instance, streamReader.readString());
    
  }
  
  public static org.drools.ide.common.client.testscenarios.fixtures.CallMethod instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.drools.ide.common.client.testscenarios.fixtures.CallMethod();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.ide.common.client.testscenarios.fixtures.CallMethod instance) throws SerializationException {
    streamWriter.writeObject(getCallFieldValues(instance));
    streamWriter.writeString(getMethodName(instance));
    streamWriter.writeInt(getState(instance));
    streamWriter.writeString(getVariable(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.ide.common.client.testscenarios.fixtures.CallMethod_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.ide.common.client.testscenarios.fixtures.CallMethod_FieldSerializer.deserialize(reader, (org.drools.ide.common.client.testscenarios.fixtures.CallMethod)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.ide.common.client.testscenarios.fixtures.CallMethod_FieldSerializer.serialize(writer, (org.drools.ide.common.client.testscenarios.fixtures.CallMethod)object);
  }
  
}
