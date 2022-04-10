package com.sec2do.coding.challenges.mapping.mappers

import com.sec2do.coding.challenges.mapping.models.db.Article
import com.sec2do.coding.challenges.mapping.models.dto.ArticleDto
import org.springframework.stereotype.Component
import java.util.*

@Component
class ArticleMapper {
    fun map(article: Article?): ArticleDto {
               
        val id= article.id,
        val title= article.title,
        val description= article.description,
        val author= article.author,
        val blocks= article.blocks
        return ArticleDto(id, title, description, author, blocks)
    }

    // Not part of the challenge / Nicht Teil dieser Challenge.
    fun map(articleDto: ArticleDto?): Article = Article(
        title = "An Article",
        blocks = emptySet(),
        id = 1,
        lastModified = Date()
    )
}
