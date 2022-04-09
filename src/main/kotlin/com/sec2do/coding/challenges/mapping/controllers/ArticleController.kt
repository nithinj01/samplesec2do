package com.sec2do.coding.challenges.mapping.controllers
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.sec2do.coding.challenges.mapping.models.dto.ArticleDto
import com.sec2do.coding.challenges.mapping.services.ArticleService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/article")
class ArticleController(
    private val articleService: ArticleService
) {
    @GetMapping
    fun list(): List<ArticleDto> = articleService.list()

    @GetMapping("/{id}")
    fun details(@PathVariable id: Long): ArticleDto = articleService.articleForId(id)

    @PostMapping
    fun create(@RequestBody articleDto: ArticleDto): ArticleDto = articleService.create(articleDto)
}
