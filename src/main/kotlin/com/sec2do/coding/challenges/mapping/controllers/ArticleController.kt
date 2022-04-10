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
    fun list(): String {
        val dtoList: List<ArticleDto> =articleService.list()
        val gson = Gson()
        val jsonlist=gson.toJson(dtoList)
        return jsonlist
    }

    @GetMapping("/{id}")
    fun details(@PathVariable id: Long): ArticleDto{ 
        val gson = Gson()
        val dto: ArticleDto= articleService.articleForId(id)
        if (dto != null ) {
            val jsondto: String = gson.toJson(dto)           
            return articleService.articleForId(articleId).map { jsondto ->
            ResponseEntity.ok(jsondto)
        }.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors))
        }
        
    }
    @PostMapping
    fun create(@RequestBody articleDto: ArticleDto): ArticleDto = articleService.create(articleDto)
}
