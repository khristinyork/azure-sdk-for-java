/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

public class NetworkInterface {
    private ArrayList<IPConfiguration> iPConfigurations;
    
    /**
    * Optional.
    * @return The IPConfigurations value.
    */
    public ArrayList<IPConfiguration> getIPConfigurations() {
        return this.iPConfigurations;
    }
    
    /**
    * Optional.
    * @param iPConfigurationsValue The IPConfigurations value.
    */
    public void setIPConfigurations(final ArrayList<IPConfiguration> iPConfigurationsValue) {
        this.iPConfigurations = iPConfigurationsValue;
    }
    
    private String name;
    
    /**
    * Optional.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    /**
    * Initializes a new instance of the NetworkInterface class.
    *
    */
    public NetworkInterface() {
        this.setIPConfigurations(new LazyArrayList<IPConfiguration>());
    }
}
