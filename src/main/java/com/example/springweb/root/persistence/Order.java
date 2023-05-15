package com.example.springweb.root.persistence;

import com.example.springweb.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@Component
@AllArgsConstructor
public class OrderDto {

    private Integer id;

    private Date date;

    private Double cost;

    private Product product;

}


