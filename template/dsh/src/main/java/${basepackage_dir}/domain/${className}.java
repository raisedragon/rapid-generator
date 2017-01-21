<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ${table.tableAlias}
 * @version 1.0
 * @author raisewang
 */
public class ${className} implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	<#list table.columns as column>
	/** ${column.columnAlias} */
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>
		
	<#list table.columns as column>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	
	</#list>
}
<#macro generateJavaColumns>
	<#list table.columns as column>
    <@generateBycondition column.sqlName>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	
	</@generateBycondition>
	</#list>
</#macro>