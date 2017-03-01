<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.query;

import ${basepackage}.base.BaseProperty;

/**
 * ${table.tableAlias} Property
 * @version 1.0
 * @author raisewang
 */
public enum ${className}Property implements BaseProperty {

	<#list table.columns as column>
	/** ${column.columnAlias} */
	${column.columnNameLower}("${column.sqlName}")<#if column_has_next>,<#else>;</#if>
	</#list>
    
	/** table cloumn name */
    private String column;

    private ${className}Property(String column) {
        this.column = column;
    }

    public String getColumn() {
        return this.column;
    }
}
