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

package com.microsoft.azure.management.resources.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* Tag details.
*/
public class TagDetails {
    private TagCount count;
    
    /**
    * Optional. Gets or sets the tag count.
    * @return The Count value.
    */
    public TagCount getCount() {
        return this.count;
    }
    
    /**
    * Optional. Gets or sets the tag count.
    * @param countValue The Count value.
    */
    public void setCount(final TagCount countValue) {
        this.count = countValue;
    }
    
    private String id;
    
    /**
    * Optional. Gets or sets the tag ID.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Optional. Gets or sets the tag ID.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets the tag name.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets the tag name.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private ArrayList<TagValue> values;
    
    /**
    * Optional. Gets or sets the list of tag values.
    * @return The Values value.
    */
    public ArrayList<TagValue> getValues() {
        return this.values;
    }
    
    /**
    * Optional. Gets or sets the list of tag values.
    * @param valuesValue The Values value.
    */
    public void setValues(final ArrayList<TagValue> valuesValue) {
        this.values = valuesValue;
    }
    
    /**
    * Initializes a new instance of the TagDetails class.
    *
    */
    public TagDetails() {
        this.setValues(new LazyArrayList<TagValue>());
    }
}
