/*
 * 文 件 名:  ${table.className}LogicService.java
 * 创 建 人:  
 * 创建时间:  <#if now??>${now?string('yyyy-MM-dd')}</#if>
 */
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ${basepackage}.common.utils.StringNumberUtil;
import ${basepackage}.service.${className}Service;
import ${basepackage}.entity.po.${className};
import ${basepackage}.dao.${className}Dao;

/**
 * <一句话功能简述>
 */
@Service
public class ${className}LogicService{
	
    @Autowired
    private ${className}Dao ${classNameLower}Dao;
    
    @Transactional
	public int add(${className} ${classNameLower}) {
		if(null == ${classNameLower}){
			return 0;
		}
        int rows = ${classNameLower}Dao.insert(${classNameLower});
        return rows;
	}

    
    @Transactional
    public int update(${className} ${classNameLower}) {
		if(null == ${classNameLower}){
			return 0;
		}
        int rows = ${classNameLower}Dao.update(${classNameLower});
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = ${classNameLower}Dao.deleteById(id);
        return rows;
    }
    
    
    public ${className} getById(Integer id) {
		if(null == id){
			return null;
		}
		${className} ${classNameLower} = ${classNameLower}Dao.getById(id);
		//
        return ${classNameLower};
    }
	
	public Integer count(${className} ${classNameLower}){
		Integer rows = ${classNameLower}Dao.count(${classNameLower});
		return rows;
	}
	
	public List<${className}> list(${className} ${classNameLower}){
		List<${className}> lists = ${classNameLower}Dao.list(${classNameLower});
		
		return lists;
	}
    
}
