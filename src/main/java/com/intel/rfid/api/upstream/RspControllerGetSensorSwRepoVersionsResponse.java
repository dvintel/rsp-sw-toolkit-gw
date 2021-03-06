/*
 * Copyright (C) 2018 Intel Corporation
 * SPDX-License-Identifier: BSD-3-Clause
 */
package com.intel.rfid.api.upstream;

import com.intel.rfid.api.JsonResponseOK;
import com.intel.rfid.api.data.SensorSoftwareRepoVersions;

public class RspControllerGetSensorSwRepoVersionsResponse extends JsonResponseOK {

    public RspControllerGetSensorSwRepoVersionsResponse(String _id, SensorSoftwareRepoVersions _versions) {
        super(_id, Boolean.TRUE);
        result = _versions;
    }

}
