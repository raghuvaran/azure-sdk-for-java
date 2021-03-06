/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties for updating the source code repository configuration.
 */
public class SourceRepositoryUpdateParameters {
    /**
     * The authorization properties for accessing the source code repository.
     */
    @JsonProperty(value = "sourceControlAuthProperties")
    private SourceControlAuthInfo sourceControlAuthProperties;

    /**
     * The value of this property indicates whether the source control commit
     * trigger is enabled or not.
     */
    @JsonProperty(value = "isCommitTriggerEnabled")
    private Boolean isCommitTriggerEnabled;

    /**
     * Get the authorization properties for accessing the source code repository.
     *
     * @return the sourceControlAuthProperties value
     */
    public SourceControlAuthInfo sourceControlAuthProperties() {
        return this.sourceControlAuthProperties;
    }

    /**
     * Set the authorization properties for accessing the source code repository.
     *
     * @param sourceControlAuthProperties the sourceControlAuthProperties value to set
     * @return the SourceRepositoryUpdateParameters object itself.
     */
    public SourceRepositoryUpdateParameters withSourceControlAuthProperties(SourceControlAuthInfo sourceControlAuthProperties) {
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        return this;
    }

    /**
     * Get the value of this property indicates whether the source control commit trigger is enabled or not.
     *
     * @return the isCommitTriggerEnabled value
     */
    public Boolean isCommitTriggerEnabled() {
        return this.isCommitTriggerEnabled;
    }

    /**
     * Set the value of this property indicates whether the source control commit trigger is enabled or not.
     *
     * @param isCommitTriggerEnabled the isCommitTriggerEnabled value to set
     * @return the SourceRepositoryUpdateParameters object itself.
     */
    public SourceRepositoryUpdateParameters withIsCommitTriggerEnabled(Boolean isCommitTriggerEnabled) {
        this.isCommitTriggerEnabled = isCommitTriggerEnabled;
        return this;
    }

}
