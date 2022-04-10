package com.sec2do.coding.challenges.mapping.services

import com.sec2do.coding.challenges.mapping.repositories.ArticleRepository
import com.sec2do.coding.challenges.mapping.mappers.ArticleMapper
import com.sec2do.coding.challenges.mapping.models.dto.ArticleDto
import org.springframework.stereotype.Service

@Service
class ArticleService(
    private val mapper: ArticleMapper,
) {
    fun list(): List<ArticleDto> {
        val articles = ArticleRepository.all()
        if (list.isNullOrEmpty()) {
        println("List is null or empty")
        return emptyList()
        }
        else {
        return articles
        }
        
    }

    fun articleForId(id: Long): ArticleDto {
        val article = ArticleRepository.findBy(id)
        val id= article.id,
        val title= article.title,
        val description= article.description,
        val author= article.author,
        val blocks= article.blocks
        return ArticleDto(id,title, description, author, blocks)
    }

    fun create(articleDto: ArticleDto): ArticleDto {
        val article = mapper.map(articleDto)
        ArticleRepository.create(article)
        return mapper.map(article)
    }
}
