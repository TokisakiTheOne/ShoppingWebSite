package com.yyh.service;

import com.yyh.dao.ProductDao;
import com.yyh.po.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-21-15:05
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao pd;

    public List<Product> selectAll() {
        return pd.selectAll();
    }

    public Product selectOne(int product_id) {
        return pd.selectOne(product_id);
    }

    public int insert(Product product) {
        return pd.insert(product);
    }

    public int update(Product product) {
        return pd.update(product);
    }

    public int delete(int product_id) {
        return pd.delete(product_id);
    }
}
