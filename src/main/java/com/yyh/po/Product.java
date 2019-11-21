package com.yyh.po;

import lombok.Data;

/**
 * @author YanYuHang
 * @create 2019-11-21-14:56
 */
@Data
public class Product {
    private int productId;

    private String productName;

    private int productSum;

    private double productPrice;

    private Status status;
}