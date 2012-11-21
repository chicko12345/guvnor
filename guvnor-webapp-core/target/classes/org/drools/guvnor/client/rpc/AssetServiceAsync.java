/*
 * Copyright 2011 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.drools.guvnor.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AssetServiceAsync {
    /** PLACE THE FOLLOWING IN AssetServiceAsync.java **/

    /** Generated by AsyncInterfaceGenerator hackery */
    public void quickFindAsset(org.drools.guvnor.client.rpc.QueryPageRequest p0, AsyncCallback<org.drools.guvnor.client.rpc.PageResponse<org.drools.guvnor.client.rpc.QueryPageRow>> cb);
    public void quickFindAsset(java.lang.String p0, boolean p1, int p2, int p3, AsyncCallback<org.drools.guvnor.client.rpc.TableDataResult> cb);
    public void queryFullText(java.lang.String p0, boolean p1, int p2, int p3, AsyncCallback<org.drools.guvnor.client.rpc.TableDataResult> cb);
    public void getAssetLockerUserName(java.lang.String p0, AsyncCallback<java.lang.String> cb);
    public void lockAsset(java.lang.String p0, AsyncCallback cb);
    public void unLockAsset(java.lang.String p0, AsyncCallback cb);
    public void archiveAsset(java.lang.String p0, AsyncCallback cb);
    public void unArchiveAsset(java.lang.String p0, AsyncCallback cb);
    public void archiveAssets(java.lang.String[] p0, boolean p1, AsyncCallback cb);
    public void removeAsset(java.lang.String p0, AsyncCallback cb);
    public void removeAssets(java.lang.String[] p0, AsyncCallback cb);
    public void buildAssetSource(org.drools.guvnor.client.rpc.Asset p0, AsyncCallback<java.lang.String> cb);
    public void validateAsset(org.drools.guvnor.client.rpc.Asset p0, AsyncCallback<org.drools.guvnor.client.rpc.BuilderResult> cb);
    public void renameAsset(java.lang.String p0, java.lang.String p1, AsyncCallback<java.lang.String> cb);
    public void loadRuleAsset(java.lang.String p0, AsyncCallback<org.drools.guvnor.client.rpc.Asset> cb);
    public void loadRuleAssets(java.lang.String[] p0, AsyncCallback<org.drools.guvnor.client.rpc.Asset[]> cb);
    public void checkinVersion(Asset asset, AsyncCallback<java.lang.String> cb);
    public void restoreVersion(String versionUUID, String assetUUID, String comment, AsyncCallback<Void> callback);
    public void loadItemHistory(java.lang.String p0, AsyncCallback<org.drools.guvnor.client.rpc.TableDataResult> cb);
    public void loadAssetHistory(java.lang.String p0, java.lang.String p1, AsyncCallback<org.drools.guvnor.client.rpc.TableDataResult> cb);
    public void loadArchivedAssets(int p0, int p1, AsyncCallback<org.drools.guvnor.client.rpc.TableDataResult> cb);
    public void loadArchivedAssets(org.drools.guvnor.client.rpc.PageRequest p0, AsyncCallback<org.drools.guvnor.client.rpc.PageResponse<org.drools.guvnor.client.rpc.AdminArchivedPageRow>> cb);
    public void findAssetPage(org.drools.guvnor.client.rpc.AssetPageRequest p0, AsyncCallback<org.drools.guvnor.client.rpc.PageResponse<org.drools.guvnor.client.rpc.AssetPageRow>> cb);
    public void listAssets(java.lang.String p0, java.lang.String[] p1, int p2, int p3, java.lang.String p4, AsyncCallback<org.drools.guvnor.client.rpc.TableDataResult> cb);
    public void listAssetsWithPackageName(java.lang.String p0, java.lang.String[] p1, int p2, int p3, java.lang.String p4, AsyncCallback<org.drools.guvnor.client.rpc.TableDataResult> cb);
    public void copyAsset(java.lang.String p0, java.lang.String p1, java.lang.String p2, AsyncCallback<java.lang.String> cb);
    public void promoteAssetToGlobalArea(java.lang.String p0, AsyncCallback cb);
    public void changeAssetPackage(String uuid, String newPackage, String comment, AsyncCallback<Void> callback);
    public void loadDiscussionForAsset(java.lang.String p0, AsyncCallback cb);
    public void addToDiscussionForAsset(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
    public void clearAllDiscussionsForAsset(java.lang.String p0, AsyncCallback cb);
    public void changeState(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
    public void changePackageState(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
    public void getAssetCount(org.drools.guvnor.client.rpc.AssetPageRequest p0, AsyncCallback<java.lang.Long> cb);
    public void convertAsset(java.lang.String p0, java.lang.String p1, AsyncCallback<ConversionResult> cb);
    
}
