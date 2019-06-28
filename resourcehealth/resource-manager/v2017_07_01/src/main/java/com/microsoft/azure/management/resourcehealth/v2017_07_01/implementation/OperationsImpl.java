/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.resourcehealth.v2017_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resourcehealth.v2017_07_01.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.resourcehealth.v2017_07_01.OperationListResult;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final ResourceHealthManager manager;

    OperationsImpl(ResourceHealthManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public ResourceHealthManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationListResult> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .map(new Func1<OperationListResultInner, OperationListResult>() {
            @Override
            public OperationListResult call(OperationListResultInner inner) {
                return new OperationListResultImpl(inner, manager());
            }
        });
    }

}