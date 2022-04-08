package com.sec2do.coding.challenges.mapping.models.db.blocks

import com.sec2do.coding.challenges.mapping.models.db.Image

class ImageBlock(
    var image: Image?,
    override val sortIndex: Int = 0,
) : ArticleBlock(sortIndex)
