/*
 * Copyright 2005 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.server.util;

public class ModuleEditorConfiguration {
    private String format;
    private String editorClass;
    private String assetEditorFormats;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getEditorClass() {
        return editorClass;
    }

    public void setEditorClass(String editorClass) {
        this.editorClass = editorClass;
    }

    public String getAssetEditorFormats() {
        return assetEditorFormats;
    }

    public void setAssetEditorFormats(String assetEditorFormats) {
        this.assetEditorFormats = assetEditorFormats;
    }


}
