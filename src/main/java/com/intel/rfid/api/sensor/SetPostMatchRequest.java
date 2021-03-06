/*
 * Copyright (C) 2018 Intel Corporation
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.intel.rfid.api.sensor;

import com.intel.rfid.api.JsonRequest;

public class SetPostMatchRequest extends JsonRequest {

    public static final String METHOD_NAME = "set_post_match";

    public Params params = new Params();

    public SetPostMatchRequest() { method = METHOD_NAME; }

    public static class Params {
        public MatchState match_state = MatchState.UNKNOWN;
        public int offset = 0;
        public int mask_length = 0;
        public String mask_data = "0";
    }

}
