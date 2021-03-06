/*
 * Copyright 2011 JBoss Inc
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.drools.guvnor.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.client.rpc.SerializationException;
import org.drools.guvnor.client.common.GenericCallback;

import java.util.Collection;
import java.util.Map;


@RemoteServiceRelativePath("configurationService")
public interface ConfigurationService extends RemoteService {

    String save(IFramePerspectiveConfiguration newConfiguration);

    IFramePerspectiveConfiguration load(String uuid) throws SerializationException;

    Collection<IFramePerspectiveConfiguration> loadPerspectiveConfigurations();

    void remove(String uuid);

    Map<String, String> loadPreferences();
}
