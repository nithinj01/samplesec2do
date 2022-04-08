package com.sec2do.coding.challenges.mapping.models.dto.blocks

import com.sec2do.coding.challenges.mapping.models.dto.ImageDto

data class ImageBlock(
    var image: ImageDto,
    override val sortIndex: Int,
) : ArticleBlockDto
