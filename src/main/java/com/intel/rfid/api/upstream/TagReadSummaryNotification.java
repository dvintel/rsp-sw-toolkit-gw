/*
 * Copyright (C) 2018 Intel Corporation
 * SPDX-License-Identifier: BSD-3-Clause
 */
package com.intel.rfid.api.upstream;

import com.intel.rfid.api.common.JsonNotification;
import com.intel.rfid.inventory.TagReadSummary;

public class TagReadSummaryNotification extends JsonNotification {

    public static final String METHOD_NAME = "tag_read_summary";

    public TagReadSummary params = new TagReadSummary();

    public TagReadSummaryNotification() {
        method = METHOD_NAME;
    }

    public TagReadSummaryNotification(TagReadSummary _summary) {
        this();
        params.copyFrom(_summary);
    }

}
