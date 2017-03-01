<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.query;

import ${basepackage}.base.Query;
import ${basepackage}.base.UpdateClause;
import ${basepackage}.query.${className}Property;

/**
 * ${table.tableAlias} Query
 * @version 1.0
 * @author raisewang
 */
public class ${className}Query {

	/**
	 * ${table.tableAlias} SelectQuery
	 * @version 1.0
	 * @author raisewang
	 */
	public static class SelectQuery extends Query {
		/**
		 * 条件，ID 等于 XX
		 * @param id primary key
		 * @return
		 */
		public SelectQuery withIdEqual(Integer id) {
			getFirstCriteria().andEqual(${className}Property.id, id);
			return this;
		}

	}
	/**
	 * ${table.tableAlias} UpdateQuery
	 * @version 1.0
	 * @author raisewang
	 */
	public static class UpdateQuery extends UpdateClause<${className}Property, UpdateQuery> {
		/**
		 * 条件，ID 等于 XX
		 * @param id primary key
		 * @return
		 */
		public UpdateQuery withIdEqual(Integer id) {
			getFirstCriteria().andEqual(${className}Property.id, id);
			return this;
		}
	}

}
