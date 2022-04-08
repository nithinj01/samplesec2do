package com.sec2do.coding.challenges.mapping.models.dto

import com.sec2do.coding.challenges.mapping.models.db.ImageSize

data class ImageDto(
    var id: Long,
    var url: String,
    var imageSize: ImageSize,
)
