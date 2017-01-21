<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service.logic;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.domain.${className};

/**
 * ${table.tableAlias} LogicService
 * @author raisewang
 *
 */
@Component
public class ${className}LogicService {
    /**${table.tableAlias} dao */
    @Autowired
    private ${className}Dao ${classNameLower}Dao;
    
     /**
     * 根据主键ID，查询${table.tableAlias}
     * @param id 主键ID
     * @return ${table.tableAlias}对象
     */
    public ${className} get(Integer id){
        ${className} entity = ${classNameLower}Dao.get(id);
        return entity;
    }
    

    /**
     * 保存${table.tableAlias}对象到数据库
     * @param entity ${table.tableAlias}对象
     */
    void add(${className} entity){
        ${classNameLower}Dao.add(entity);
    }
    

    /**
     * 更新${table.tableAlias}对象到数据库
     * @param entity ${table.tableAlias}对象
     * @return 更新记录数
     */
    int update(${className} entity){
        return ${classNameLower}Dao.update(entity);
    }
    
    /**
     * 设置${table.tableAlias}对象状态“无效”
     * @param id 主键ID
     */
    void disable(Integer id){
        ${classNameLower}Dao.disable(id);;
    }
}
