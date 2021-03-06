/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.WebJob;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.appservice.v2018_02_01.WebJobType;

class WebJobImpl extends IndexableRefreshableWrapperImpl<WebJob, WebJobInner> implements WebJob {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String webJobName;
    private String slot;

    WebJobImpl(WebJobInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.webJobName = IdParsingUtils.getValueFromIdByName(inner.id(), "webjobs");
        this.slot = IdParsingUtils.getValueFromIdByName(inner.id(), "slots");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<WebJobInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getWebJobSlotAsync(this.resourceGroupName, this.name, this.webJobName, this.slot);
    }



    @Override
    public String error() {
        return this.inner().error();
    }

    @Override
    public String extraInfoUrl() {
        return this.inner().extraInfoUrl();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String runCommand() {
        return this.inner().runCommand();
    }

    @Override
    public Map<String, Object> settings() {
        return this.inner().settings();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String url() {
        return this.inner().url();
    }

    @Override
    public Boolean usingSdk() {
        return this.inner().usingSdk();
    }

    @Override
    public WebJobType webJobType() {
        return this.inner().webJobType();
    }

}
