/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_959 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> {

	private static final long serialVersionUID = -1418082798;

	/**
	 * The singleton instance of <code>public.t_959</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_959 T_959 = new org.jooq.test.postgres.generatedclasses.tables.T_959();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_959Record.class;
	}

	/**
	 * The column <code>public.t_959.java_keywords</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record, org.jooq.test.postgres.generatedclasses.enums.U_959> JAVA_KEYWORDS = createField("java_keywords", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.U_959.class), this, "");

	/**
	 * Create a <code>public.t_959</code> table reference
	 */
	public T_959() {
		this("t_959", null);
	}

	/**
	 * Create an aliased <code>public.t_959</code> table reference
	 */
	public T_959(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.T_959.T_959);
	}

	private T_959(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> aliased) {
		this(alias, aliased, null);
	}

	private T_959(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_959 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_959(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.T_959 rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_959(name, null);
	}
}
