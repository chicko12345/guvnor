/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.guvnor.m2repo.client;

import com.google.gwt.user.client.ui.IsWidget;
import org.jboss.errai.common.client.api.Caller;
import org.guvnor.m2repo.service.M2RepoService;
import org.uberfire.backend.vfs.Path;
import org.uberfire.lifecycle.OnClose;
import org.uberfire.lifecycle.OnSave;
import org.uberfire.lifecycle.OnStartup;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchPartView;
import org.uberfire.client.annotations.WorkbenchScreen;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
@WorkbenchScreen(identifier = "M2RepoEditor")
public class M2RepoEditorPresenter {

    public interface View
            extends
            IsWidget {

    }

    @Inject
    private View view;

    private Path path;

    @Inject
    private Caller<M2RepoService> m2RepoService;
    
    @PostConstruct
    public void init() {
    }

    @OnStartup
    public void onStartup( final Path path ) {
        this.path = path;
    }

    @OnSave
    public void onSave() {
    }

    @WorkbenchPartView
    public IsWidget getWidget() {
        return view;
    }

    @OnClose
    public void onClose() {
        this.path = null;
    }

    @WorkbenchPartTitle
    public String getTitle() {
        return "Guvnor M2 REPOSITORY";
    }

}
