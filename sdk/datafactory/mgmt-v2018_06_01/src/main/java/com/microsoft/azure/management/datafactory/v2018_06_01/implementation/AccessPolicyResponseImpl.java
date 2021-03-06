/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactory.v2018_06_01.AccessPolicyResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2018_06_01.UserAccessPolicy;

class AccessPolicyResponseImpl extends WrapperImpl<AccessPolicyResponseInner> implements AccessPolicyResponse {
    private final DataFactoryManager manager;
    AccessPolicyResponseImpl(AccessPolicyResponseInner inner, DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public String accessToken() {
        return this.inner().accessToken();
    }

    @Override
    public String dataPlaneUrl() {
        return this.inner().dataPlaneUrl();
    }

    @Override
    public UserAccessPolicy policy() {
        return this.inner().policy();
    }

}
