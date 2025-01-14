/*
 * Copyright (c) 2018 PANTHEON.tech s.r.o. All Rights Reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v10.html
 */
package io.lighty.modules.southbound.netconf.impl;

import org.opendaylight.netconf.sal.connect.api.ActionTransformer;
import org.opendaylight.netconf.sal.connect.api.DeviceActionFactory;
import org.opendaylight.netconf.sal.connect.api.RemoteDeviceCommunicator;
import org.opendaylight.netconf.sal.connect.api.RemoteDeviceServices.Actions;

public class LightyDeviceActionFactory implements DeviceActionFactory {


    @Override
    public Actions createDeviceAction(ActionTransformer messageTransformer,
            RemoteDeviceCommunicator listener) {
        return new LightyDOMActionService(messageTransformer, listener);
    }
}

