<#include "/macro.include"/>
<#assign className = table.className>   

package ${basepackage}.dao;

import ${basepackage}.base.BaseDao;
import ${basepackage}.domain.${className};

/**
 * ${table.tableAlias},${className}Dao
 * @author raisewang
 */
public interface ${className}Dao extends BaseDao<${className}, Integer> {

}
