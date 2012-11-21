package org.drools.ide.common.client.modeldriven.testing;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Scenario_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getFixtures(org.drools.ide.common.client.modeldriven.testing.Scenario instance) /*-{
    return instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::fixtures;
  }-*/;
  
  private static native void setFixtures(org.drools.ide.common.client.modeldriven.testing.Scenario instance, java.util.List value) 
  /*-{
    instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::fixtures = value;
  }-*/;
  
  private static native java.util.List getGlobals(org.drools.ide.common.client.modeldriven.testing.Scenario instance) /*-{
    return instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::globals;
  }-*/;
  
  private static native void setGlobals(org.drools.ide.common.client.modeldriven.testing.Scenario instance, java.util.List value) 
  /*-{
    instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::globals = value;
  }-*/;
  
  private static native boolean getInclusive(org.drools.ide.common.client.modeldriven.testing.Scenario instance) /*-{
    return instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::inclusive;
  }-*/;
  
  private static native void setInclusive(org.drools.ide.common.client.modeldriven.testing.Scenario instance, boolean value) 
  /*-{
    instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::inclusive = value;
  }-*/;
  
  private static native java.util.Date getLastRunResult(org.drools.ide.common.client.modeldriven.testing.Scenario instance) /*-{
    return instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::lastRunResult;
  }-*/;
  
  private static native void setLastRunResult(org.drools.ide.common.client.modeldriven.testing.Scenario instance, java.util.Date value) 
  /*-{
    instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::lastRunResult = value;
  }-*/;
  
  private static native int getMaxRuleFirings(org.drools.ide.common.client.modeldriven.testing.Scenario instance) /*-{
    return instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::maxRuleFirings;
  }-*/;
  
  private static native void setMaxRuleFirings(org.drools.ide.common.client.modeldriven.testing.Scenario instance, int value) 
  /*-{
    instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::maxRuleFirings = value;
  }-*/;
  
  private static native java.util.List getRules(org.drools.ide.common.client.modeldriven.testing.Scenario instance) /*-{
    return instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::rules;
  }-*/;
  
  private static native void setRules(org.drools.ide.common.client.modeldriven.testing.Scenario instance, java.util.List value) 
  /*-{
    instance.@org.drools.ide.common.client.modeldriven.testing.Scenario::rules = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.drools.ide.common.client.modeldriven.testing.Scenario instance) throws SerializationException {
    setFixtures(instance, (java.util.List) streamReader.readObject());
    setGlobals(instance, (java.util.List) streamReader.readObject());
    setInclusive(instance, streamReader.readBoolean());
    setLastRunResult(instance, (java.util.Date) streamReader.readObject());
    setMaxRuleFirings(instance, streamReader.readInt());
    setRules(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static org.drools.ide.common.client.modeldriven.testing.Scenario instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.drools.ide.common.client.modeldriven.testing.Scenario();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.ide.common.client.modeldriven.testing.Scenario instance) throws SerializationException {
    streamWriter.writeObject(getFixtures(instance));
    streamWriter.writeObject(getGlobals(instance));
    streamWriter.writeBoolean(getInclusive(instance));
    streamWriter.writeObject(getLastRunResult(instance));
    streamWriter.writeInt(getMaxRuleFirings(instance));
    streamWriter.writeObject(getRules(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.ide.common.client.modeldriven.testing.Scenario_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.testing.Scenario_FieldSerializer.deserialize(reader, (org.drools.ide.common.client.modeldriven.testing.Scenario)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.ide.common.client.modeldriven.testing.Scenario_FieldSerializer.serialize(writer, (org.drools.ide.common.client.modeldriven.testing.Scenario)object);
  }
  
}
