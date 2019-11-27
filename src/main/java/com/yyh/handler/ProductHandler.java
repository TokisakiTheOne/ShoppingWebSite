package com.yyh.handler;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yyh.po.Product;
import com.yyh.service.ProductService;
import com.yyh.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YanYuHang
 * @create 2019-11-21-15:17
 */
@RequestMapping("/product")
@Controller
public class ProductHandler {
    @Autowired
    private ProductService ps;
    @Autowired
    private StatusService ss;

    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        model.addAttribute("productList", ps.selectAll());
        return "index";
    }

    @RequestMapping("/selectOne")
    public String selectOne(int product_id, Model model) {
        model.addAttribute("pro", ps.selectOne(product_id));
        model.addAttribute("statusList", ss.selectAll());
        return "update";
    }


    @RequestMapping("/update")
    public String update(Product product) {
        ps.update(product);
        return "redirect:/product/selectAll";
    }

    @RequestMapping("/insert")
    public String insert(Product product) {
        ps.insert(product);
        return "redirect:/product/selectAll";
    }

    @RequestMapping("/delete")
    public String delete(int product_id) {
        ps.delete(product_id);
        return "redirect:/product/selectAll";
    }

    @RequestMapping("/toInsert")
    public String toInsert(Model model) {
        model.addAttribute("statusList", ss.selectAll());
        return "insert";
    }

}
