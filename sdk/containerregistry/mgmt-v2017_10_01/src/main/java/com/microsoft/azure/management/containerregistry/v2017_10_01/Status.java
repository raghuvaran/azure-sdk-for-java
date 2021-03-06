/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of an Azure resource at the time the operation was called.
 */
public class Status {
    /**
     * The short label for the status.
     */
    @JsonProperty(value = "displayStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String displayStatus;

    /**
     * The detailed message for the status, including alerts and error
     * messages.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The timestamp when the status was changed to the current value.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * Get the short label for the status.
     *
     * @return the displayStatus value
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Get the detailed message for the status, including alerts and error messages.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the timestamp when the status was changed to the current value.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

}
