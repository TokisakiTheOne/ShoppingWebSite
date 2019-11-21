package com.yyh.service;

import com.yyh.dao.StatusDao;
import com.yyh.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-21-15:06
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Resource
    private StatusDao sd;

    public List<Status> selectAll() {
        return sd.selectAll();
    }

    public Status selectOne(int status_id) {
        return sd.selectOne(status_id);
    }

    public int insert(Status status) {
        return sd.insert(status);
    }

    public int update(Status status) {
        return sd.update(status);
    }

    public int delete(int status_id) {
        return sd.delete(status_id);
    }
}
