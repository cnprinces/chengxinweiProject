package com.howbuy.cc.basic.test.mybatis.dao;

import com.howbuy.cc.basic.mybatis.dao.MybatisCommonDao;
import com.howbuy.cc.basic.test.model.Aaaa;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xinwei.cheng on 2015/7/20.
 */
@Service
@SuppressWarnings("unused")
public class AaaaDao extends MybatisCommonDao<Aaaa> {


    public List<Aaaa> getAaaa(int id){
        Map<String,Object> params = new HashMap<>();
        params.put("id" , id);
        return super.selectList("selectList", params);
    }

    public void update(Aaaa a){
        super.update("update" , a);
    }

    public void insert(Aaaa a){
        super.insert("insert" , a);
    }

    public void delete(int id){
        Map<String,Object> params = new HashMap<>();
        params.put("id" , id);
        super.delete("delete" , params);
    }

}
