package com.sec2do.coding.challenges.mapping.models.dto.blocks

import com.sec2do.coding.challenges.mapping.models.dto.ImageDto

data class GalleryBlockDto(
    var images: List<ImageDto>,
    override val sortIndex: Int,
) : ArticleBlockDto
