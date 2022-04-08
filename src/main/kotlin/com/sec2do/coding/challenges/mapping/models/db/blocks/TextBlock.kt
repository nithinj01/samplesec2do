package com.sec2do.coding.challenges.mapping.models.db.blocks

class TextBlock(
    var text: String,
    override var sortIndex: Int = 0,
) : ArticleBlock(sortIndex)
