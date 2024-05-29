package com.demo.controller;

import com.demo.dto.ArticleDTO;
import com.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles().stream()
                .map(article -> new ArticleDTO(article))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ArticleDTO createArticle(@RequestBody ArticleDTO articleDTO) {
        return new ArticleDTO(articleService.saveArticle(articleDTO.toEntity()));
    }

    @GetMapping("/{id}")
    public ArticleDTO getArticleById(@PathVariable Long id) {
        return new ArticleDTO(articleService.getArticleById(id));
    }
}
