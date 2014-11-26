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

package com.microsoft.azure.management.websites.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.LazyHashMap;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* Represents the properties of a website.
*/
public class WebSiteProperties {
    private boolean adminEnabled;
    
    /**
    * Optional. Read-only. This value is always true.
    * @return The AdminEnabled value.
    */
    public boolean isAdminEnabled() {
        return this.adminEnabled;
    }
    
    /**
    * Optional. Read-only. This value is always true.
    * @param adminEnabledValue The AdminEnabled value.
    */
    public void setAdminEnabled(final boolean adminEnabledValue) {
        this.adminEnabled = adminEnabledValue;
    }
    
    private WebSpaceAvailabilityState availabilityState;
    
    /**
    * Optional. The state of the availability of management information for the
    * site. Possible values are Normal or Limited. Normal means that the site
    * is running correctly and that management information for the site is
    * available. Limited means that only partial management information for
    * the site is available and that detailed site information is unavailable.
    * @return The AvailabilityState value.
    */
    public WebSpaceAvailabilityState getAvailabilityState() {
        return this.availabilityState;
    }
    
    /**
    * Optional. The state of the availability of management information for the
    * site. Possible values are Normal or Limited. Normal means that the site
    * is running correctly and that management information for the site is
    * available. Limited means that only partial management information for
    * the site is available and that detailed site information is unavailable.
    * @param availabilityStateValue The AvailabilityState value.
    */
    public void setAvailabilityState(final WebSpaceAvailabilityState availabilityStateValue) {
        this.availabilityState = availabilityStateValue;
    }
    
    private boolean enabled;
    
    /**
    * Optional. true if the site is enabled; otherwise, false. Setting this
    * value to false disables the site (takes the site off line).
    * @return The Enabled value.
    */
    public boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. true if the site is enabled; otherwise, false. Setting this
    * value to false disables the site (takes the site off line).
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private ArrayList<String> enabledHostNames;
    
    /**
    * Optional. An array of strings that contains enabled hostnames for the
    * site. By default, these are [SiteName].azurewebsites.net and
    * [SiteName].scm.azurewebsites.net.
    * @return The EnabledHostNames value.
    */
    public ArrayList<String> getEnabledHostNames() {
        return this.enabledHostNames;
    }
    
    /**
    * Optional. An array of strings that contains enabled hostnames for the
    * site. By default, these are [SiteName].azurewebsites.net and
    * [SiteName].scm.azurewebsites.net.
    * @param enabledHostNamesValue The EnabledHostNames value.
    */
    public void setEnabledHostNames(final ArrayList<String> enabledHostNamesValue) {
        this.enabledHostNames = enabledHostNamesValue;
    }
    
    private ArrayList<String> hostNames;
    
    /**
    * Optional. An array of strings that contains the public hostnames for the
    * site, including custom domains. Important: When you add a custom domain
    * in a PUT operation, be sure to include every hostname that you want for
    * the web site. To delete a custom domain name in a PUT operation, include
    * all of the hostnames for the site that you want to keep, but leave out
    * the one that you wangt to delete.
    * @return The HostNames value.
    */
    public ArrayList<String> getHostNames() {
        return this.hostNames;
    }
    
    /**
    * Optional. An array of strings that contains the public hostnames for the
    * site, including custom domains. Important: When you add a custom domain
    * in a PUT operation, be sure to include every hostname that you want for
    * the web site. To delete a custom domain name in a PUT operation, include
    * all of the hostnames for the site that you want to keep, but leave out
    * the one that you wangt to delete.
    * @param hostNamesValue The HostNames value.
    */
    public void setHostNames(final ArrayList<String> hostNamesValue) {
        this.hostNames = hostNamesValue;
    }
    
    private ArrayList<WebSiteProperties.WebSiteHostNameSslState> hostNameSslStates;
    
    /**
    * Optional. SSL states bound to the website.
    * @return The HostNameSslStates value.
    */
    public ArrayList<WebSiteProperties.WebSiteHostNameSslState> getHostNameSslStates() {
        return this.hostNameSslStates;
    }
    
    /**
    * Optional. SSL states bound to the website.
    * @param hostNameSslStatesValue The HostNameSslStates value.
    */
    public void setHostNameSslStates(final ArrayList<WebSiteProperties.WebSiteHostNameSslState> hostNameSslStatesValue) {
        this.hostNameSslStates = hostNameSslStatesValue;
    }
    
    private Calendar lastModifiedTimeUtc;
    
    /**
    * Optional. A dateTime value that contains, in Coordinated Universal Time,
    * the last time the web site was modified.
    * @return The LastModifiedTimeUtc value.
    */
    public Calendar getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    
    /**
    * Optional. A dateTime value that contains, in Coordinated Universal Time,
    * the last time the web site was modified.
    * @param lastModifiedTimeUtcValue The LastModifiedTimeUtc value.
    */
    public void setLastModifiedTimeUtc(final Calendar lastModifiedTimeUtcValue) {
        this.lastModifiedTimeUtc = lastModifiedTimeUtcValue;
    }
    
    private WebSiteProperties.SiteProperties properties;
    
    /**
    * Optional. Contains AppSettings, Metadata, and Properties for a site.
    * @return The Properties value.
    */
    public WebSiteProperties.SiteProperties getProperties() {
        return this.properties;
    }
    
    /**
    * Optional. Contains AppSettings, Metadata, and Properties for a site.
    * @param propertiesValue The Properties value.
    */
    public void setProperties(final WebSiteProperties.SiteProperties propertiesValue) {
        this.properties = propertiesValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets resource provisioning state.
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets resource provisioning state.
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private String repositorySiteName;
    
    /**
    * Optional. The name of the repository web site.
    * @return The RepositorySiteName value.
    */
    public String getRepositorySiteName() {
        return this.repositorySiteName;
    }
    
    /**
    * Optional. The name of the repository web site.
    * @param repositorySiteNameValue The RepositorySiteName value.
    */
    public void setRepositorySiteName(final String repositorySiteNameValue) {
        this.repositorySiteName = repositorySiteNameValue;
    }
    
    private WebSiteRuntimeAvailabilityState runtimeAvailabilityState;
    
    /**
    * Optional. Possible values are Normal, Degraded, or NotAvailable. Normal:
    * the web site is running correctly. Degraded: the web site is running
    * temporarily in a degraded mode (typically with less memory and a shared
    * instance.) Not Available: due to an unexpected issue, the site has been
    * excluded from provisioning. This typically occurs only for free sites.
    * @return The RuntimeAvailabilityState value.
    */
    public WebSiteRuntimeAvailabilityState getRuntimeAvailabilityState() {
        return this.runtimeAvailabilityState;
    }
    
    /**
    * Optional. Possible values are Normal, Degraded, or NotAvailable. Normal:
    * the web site is running correctly. Degraded: the web site is running
    * temporarily in a degraded mode (typically with less memory and a shared
    * instance.) Not Available: due to an unexpected issue, the site has been
    * excluded from provisioning. This typically occurs only for free sites.
    * @param runtimeAvailabilityStateValue The RuntimeAvailabilityState value.
    */
    public void setRuntimeAvailabilityState(final WebSiteRuntimeAvailabilityState runtimeAvailabilityStateValue) {
        this.runtimeAvailabilityState = runtimeAvailabilityStateValue;
    }
    
    private String serverFarm;
    
    /**
    * Optional. Name of a Web Hosting Plan (Server Farm) that this site belongs
    * to.
    * @return The ServerFarm value.
    */
    public String getServerFarm() {
        return this.serverFarm;
    }
    
    /**
    * Optional. Name of a Web Hosting Plan (Server Farm) that this site belongs
    * to.
    * @param serverFarmValue The ServerFarm value.
    */
    public void setServerFarm(final String serverFarmValue) {
        this.serverFarm = serverFarmValue;
    }
    
    private SkuOptions sku;
    
    /**
    * Optional. SKU of a Web Hosting Plan (Server Farm) that this site belongs
    * to.
    * @return The Sku value.
    */
    public SkuOptions getSku() {
        return this.sku;
    }
    
    /**
    * Optional. SKU of a Web Hosting Plan (Server Farm) that this site belongs
    * to.
    * @param skuValue The Sku value.
    */
    public void setSku(final SkuOptions skuValue) {
        this.sku = skuValue;
    }
    
    private WebSiteState state;
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values are Stopped or Running.
    * @return The State value.
    */
    public WebSiteState getState() {
        return this.state;
    }
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values are Stopped or Running.
    * @param stateValue The State value.
    */
    public void setState(final WebSiteState stateValue) {
        this.state = stateValue;
    }
    
    private ArrayList<String> trafficManagerHostNames;
    
    /**
    * Optional. An array of strings that contain the traffic manager hostnames.
    * @return The TrafficManagerHostNames value.
    */
    public ArrayList<String> getTrafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }
    
    /**
    * Optional. An array of strings that contain the traffic manager hostnames.
    * @param trafficManagerHostNamesValue The TrafficManagerHostNames value.
    */
    public void setTrafficManagerHostNames(final ArrayList<String> trafficManagerHostNamesValue) {
        this.trafficManagerHostNames = trafficManagerHostNamesValue;
    }
    
    private URI uri;
    
    /**
    * Optional. Direct URL to the web site endpoint on Windows Azure Web Sites,
    * including the subscription ID, webspace name, and site name.
    * @return The Uri value.
    */
    public URI getUri() {
        return this.uri;
    }
    
    /**
    * Optional. Direct URL to the web site endpoint on Windows Azure Web Sites,
    * including the subscription ID, webspace name, and site name.
    * @param uriValue The Uri value.
    */
    public void setUri(final URI uriValue) {
        this.uri = uriValue;
    }
    
    private WebSiteUsageState usageState;
    
    /**
    * Optional. Possible values are Normal or Exceeded. If any quota is
    * exceeded, the UsageState value changes to Exceeded and the site goes off
    * line.
    * @return The UsageState value.
    */
    public WebSiteUsageState getUsageState() {
        return this.usageState;
    }
    
    /**
    * Optional. Possible values are Normal or Exceeded. If any quota is
    * exceeded, the UsageState value changes to Exceeded and the site goes off
    * line.
    * @param usageStateValue The UsageState value.
    */
    public void setUsageState(final WebSiteUsageState usageStateValue) {
        this.usageState = usageStateValue;
    }
    
    private String webSpace;
    
    /**
    * Optional. The name of the webspace in which the web site is located. This
    * property is read-only.
    * @return The WebSpace value.
    */
    public String getWebSpace() {
        return this.webSpace;
    }
    
    /**
    * Optional. The name of the webspace in which the web site is located. This
    * property is read-only.
    * @param webSpaceValue The WebSpace value.
    */
    public void setWebSpace(final String webSpaceValue) {
        this.webSpace = webSpaceValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteProperties class.
    *
    */
    public WebSiteProperties() {
        this.setEnabledHostNames(new LazyArrayList<String>());
        this.setHostNames(new LazyArrayList<String>());
        this.setHostNameSslStates(new LazyArrayList<WebSiteProperties.WebSiteHostNameSslState>());
        this.setTrafficManagerHostNames(new LazyArrayList<String>());
    }
    
    public static class SiteProperties {
        private HashMap<String, String> appSettings;
        
        /**
        * Optional. A set of name/value pairs that contain application settings
        * for a site.
        * @return The AppSettings value.
        */
        public HashMap<String, String> getAppSettings() {
            return this.appSettings;
        }
        
        /**
        * Optional. A set of name/value pairs that contain application settings
        * for a site.
        * @param appSettingsValue The AppSettings value.
        */
        public void setAppSettings(final HashMap<String, String> appSettingsValue) {
            this.appSettings = appSettingsValue;
        }
        
        private HashMap<String, String> metadata;
        
        /**
        * Optional. A set of name/value pairs that contain metadata information
        * for a site.
        * @return The Metadata value.
        */
        public HashMap<String, String> getMetadata() {
            return this.metadata;
        }
        
        /**
        * Optional. A set of name/value pairs that contain metadata information
        * for a site.
        * @param metadataValue The Metadata value.
        */
        public void setMetadata(final HashMap<String, String> metadataValue) {
            this.metadata = metadataValue;
        }
        
        private HashMap<String, String> properties;
        
        /**
        * Optional. A set of name/value pairs that contain properties for a
        * site.
        * @return The Properties value.
        */
        public HashMap<String, String> getProperties() {
            return this.properties;
        }
        
        /**
        * Optional. A set of name/value pairs that contain properties for a
        * site.
        * @param propertiesValue The Properties value.
        */
        public void setProperties(final HashMap<String, String> propertiesValue) {
            this.properties = propertiesValue;
        }
        
        /**
        * Initializes a new instance of the SiteProperties class.
        *
        */
        public SiteProperties() {
            this.setAppSettings(new LazyHashMap<String, String>());
            this.setMetadata(new LazyHashMap<String, String>());
            this.setProperties(new LazyHashMap<String, String>());
        }
    }
    
    /**
    * SSL states bound to a website.
    */
    public static class WebSiteHostNameSslState {
        private String ipBasedSslResult;
        
        /**
        * Optional. The IP based SSL result
        * @return The IpBasedSslResult value.
        */
        public String getIpBasedSslResult() {
            return this.ipBasedSslResult;
        }
        
        /**
        * Optional. The IP based SSL result
        * @param ipBasedSslResultValue The IpBasedSslResult value.
        */
        public void setIpBasedSslResult(final String ipBasedSslResultValue) {
            this.ipBasedSslResult = ipBasedSslResultValue;
        }
        
        private String name;
        
        /**
        * Optional. The URL of the web site.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The URL of the web site.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private WebSiteSslState sslState;
        
        /**
        * Optional. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @return The SslState value.
        */
        public WebSiteSslState getSslState() {
            return this.sslState;
        }
        
        /**
        * Optional. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @param sslStateValue The SslState value.
        */
        public void setSslState(final WebSiteSslState sslStateValue) {
            this.sslState = sslStateValue;
        }
        
        private String thumbprint;
        
        /**
        * Optional. A string that contains the thumbprint of the SSL
        * certificate.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. A string that contains the thumbprint of the SSL
        * certificate.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
        
        private Boolean toUpdate;
        
        /**
        * Optional. Boolean value indicating if it should be updated
        * @return The ToUpdate value.
        */
        public Boolean isToUpdate() {
            return this.toUpdate;
        }
        
        /**
        * Optional. Boolean value indicating if it should be updated
        * @param toUpdateValue The ToUpdate value.
        */
        public void setToUpdate(final Boolean toUpdateValue) {
            this.toUpdate = toUpdateValue;
        }
        
        private Boolean toUpdateIpBasedSsl;
        
        /**
        * Optional. Boolean value indicating if it should be updated based on
        * ssl
        * @return The ToUpdateIpBasedSsl value.
        */
        public Boolean isToUpdateIpBasedSsl() {
            return this.toUpdateIpBasedSsl;
        }
        
        /**
        * Optional. Boolean value indicating if it should be updated based on
        * ssl
        * @param toUpdateIpBasedSslValue The ToUpdateIpBasedSsl value.
        */
        public void setToUpdateIpBasedSsl(final Boolean toUpdateIpBasedSslValue) {
            this.toUpdateIpBasedSsl = toUpdateIpBasedSslValue;
        }
        
        private InetAddress virtualIP;
        
        /**
        * Optional. String. The IP address assigned to the hostname if the
        * hostname uses IP SSL.
        * @return The VirtualIP value.
        */
        public InetAddress getVirtualIP() {
            return this.virtualIP;
        }
        
        /**
        * Optional. String. The IP address assigned to the hostname if the
        * hostname uses IP SSL.
        * @param virtualIPValue The VirtualIP value.
        */
        public void setVirtualIP(final InetAddress virtualIPValue) {
            this.virtualIP = virtualIPValue;
        }
    }
}
