/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExpressRouteCircuitPeeringState.
 */
public final class ExpressRouteCircuitPeeringState extends ExpandableStringEnum<ExpressRouteCircuitPeeringState> {
    /** Static value Disabled for ExpressRouteCircuitPeeringState. */
    public static final ExpressRouteCircuitPeeringState DISABLED = fromString("Disabled");

    /** Static value Enabled for ExpressRouteCircuitPeeringState. */
    public static final ExpressRouteCircuitPeeringState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a ExpressRouteCircuitPeeringState from its string representation.
     * @param name a name to look for
     * @return the corresponding ExpressRouteCircuitPeeringState
     */
    @JsonCreator
    public static ExpressRouteCircuitPeeringState fromString(String name) {
        return fromString(name, ExpressRouteCircuitPeeringState.class);
    }

    /**
     * @return known ExpressRouteCircuitPeeringState values
     */
    public static Collection<ExpressRouteCircuitPeeringState> values() {
        return values(ExpressRouteCircuitPeeringState.class);
    }
}
