package com.examplo.oauth2.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductResource {

    @GetMapping
    public List<Produto> list() {
        return Arrays.asList(new Produto("Livro 4", 10.99), new Produto("Livro 5", 45.29));
    }

    public static class Produto {

        private String name;
        private double value;

        public Produto(String name, double value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

    }

}
