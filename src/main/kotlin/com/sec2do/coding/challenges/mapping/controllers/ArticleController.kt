package com.sec2do.coding.challenges.mapping.controllers
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import com.sec2do.coding.challenges.mapping.models.dto.ArticleDto
import com.sec2do.coding.challenges.mapping.services.ArticleService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/article")
class ArticleController(
    private val articleService: ArticleService
) {
    @GetMapping
    fun list(): List<ArticleDto> {
        val dtoList: List<ArticleDto> =articleService.list()
        val gson = Gson()
        val jsonlist=gson.toJson(dtoList)
        return jsonlist
    }

    @GetMapping("/{id}")
    fun details(@PathVariable(value = "id") articleId: Long): ResponseEntity<ArticleDto> {
        return articleService.articleForId(articleId).map { article ->
            ResponseEntity.ok(article)
        }.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors))
    }


    @PostMapping
    fun create(@RequestBody articleDto: ArticleDto): ArticleDto = articleService.create(articleDto)
}
