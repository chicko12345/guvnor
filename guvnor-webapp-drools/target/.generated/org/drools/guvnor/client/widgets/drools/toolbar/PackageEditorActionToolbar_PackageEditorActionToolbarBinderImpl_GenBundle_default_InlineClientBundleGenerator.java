package org.drools.guvnor.client.widgets.drools.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.drools.guvnor.client.widgets.drools.toolbar.PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenBundle {
  private static PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.drools.guvnor.client.widgets.drools.toolbar.PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GEI-42EN{cursor:" + ("default")  + ";}.GEI-42EN .GEI-42FN{cursor:" + ("pointer")  + ";color:" + ("#666")  + ";font-weight:" + ("bold")  + ";padding:" + ("0"+ " " +"10px")  + ";vertical-align:" + ("bottom")  + ";}.GEI-42GN{color:" + ("#666")  + ";font-weight:" + ("bold")  + ";font-style:" + ("italic")  + ";padding:" + ("0"+ " " +"10px")  + ";vertical-align:") + (("bottom")  + ";}");
      }
      public java.lang.String menuBar(){
        return "GEI-42EN";
      }
      public java.lang.String menuItem(){
        return "GEI-42FN";
      }
      public java.lang.String statusLabel(){
        return "GEI-42GN";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.drools.guvnor.client.widgets.drools.toolbar.PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.drools.guvnor.client.widgets.drools.toolbar.PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.drools.guvnor.client.widgets.drools.toolbar.PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.drools.guvnor.client.widgets.drools.toolbar.PackageEditorActionToolbar_PackageEditorActionToolbarBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
