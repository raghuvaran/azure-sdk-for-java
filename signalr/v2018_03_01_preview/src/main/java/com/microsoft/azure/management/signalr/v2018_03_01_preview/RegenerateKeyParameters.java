/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters describes the request to regenerate access keys.
 */
public class RegenerateKeyParameters {
    /**
     * The keyType to regenerate. Must be either 'primary' or
     * 'secondary'(case-insensitive). Possible values include: 'Primary',
     * 'Secondary'.
     */
    @JsonProperty(value = "keyType")
    private KeyType keyType;

    /**
     * Get the keyType value.
     *
     * @return the keyType value
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType value.
     *
     * @param keyType the keyType value to set
     * @return the RegenerateKeyParameters object itself.
     */
    public RegenerateKeyParameters withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

}