package com.sec2do.coding.challenges.mapping.models.db

import java.util.*

interface DBEntity {
    var id: Long
    var lastModified: Date
    var lastModifiedBy: String?
}
