package com.leaf.backstagegood.controller;

import com.leaf.backstagegood.entity.Type;
import com.leaf.backstagegood.service.TypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author YeYaqiao
 * @email yaqiao.ye@mobilityasia.com.cn
 * @time 2020-03-22 22:58
 */
@Slf4j
@RestController
@RequestMapping("/type")
@Api(value = "商品类型信息接口")
public class TypeController {

    @Autowired
    TypeService typeService;

    @ApiOperation(value = "获取所有类型信息")
    @GetMapping("allType")
    public List<Type> getAllType(){
        return typeService.getAllType();
    }
    @ApiOperation(value = "查询类型信息")
    @GetMapping("/queryType")
    public Type getTypeById(@RequestParam("id") int id){
        return typeService.getTypeById(id);
    }
    @ApiOperation(value = "更新类型信息")
    @PostMapping("/updateType")
    public Type updateType(@RequestBody Type type){
        return typeService.updateType(type);
    }
    @ApiOperation(value = "添加类型信息")
    @PostMapping("/addType")
    public Type addType(@RequestBody Type type){
        return typeService.addType(type);
    }
    @ApiOperation(value = "删除类型信息")
    @GetMapping("/deleteType")
    public void deleteType(@RequestParam("id") int id){
        typeService.deleteTypeById(id);
    }


}
